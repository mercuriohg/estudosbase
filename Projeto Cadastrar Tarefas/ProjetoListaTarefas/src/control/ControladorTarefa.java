/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Tarefa;

/**
 *
 * @author Mercúrio
 */
public class ControladorTarefa {

    JLabel jLabelTextoMuda;
    JTextField jTextFieldID;
    JTextField jTextFieldTitulo;
    JTextField jTextFieldDescricao;
    ArrayList<Tarefa> listaTarefa = new ArrayList<>();
    JComboBox<String> jComboBoxTarefa = new JComboBox<>(new String[]{"Concluída", "Pendente"});
    JButton jButtonCadastrarTarefa;
    JTable tabelaTarefa;
    DefaultTableModel modle = new DefaultTableModel();
    int contador = 0;
    int index;

    public ControladorTarefa(JLabel jLabelTextoMuda, JTextField jTextFieldID, JTextField jTextFieldTitulo, JTextField jTextFieldDescricao, JComboBox jComboBoxTarefa, JButton jButtonCadastrarTarefa, JTable tabelaTarefa, int index) {
        this.jLabelTextoMuda = jLabelTextoMuda;
        this.jTextFieldID = jTextFieldID;
        this.jTextFieldTitulo = jTextFieldTitulo;
        this.jTextFieldDescricao = jTextFieldDescricao;
        this.jComboBoxTarefa = jComboBoxTarefa;
        this.jButtonCadastrarTarefa = jButtonCadastrarTarefa;
        this.tabelaTarefa = tabelaTarefa;
        this.index = index;
        limpar();
    }

    public int gerarId() {
       int novoId = 1;
        if(!listaTarefa.isEmpty()){
            int indexU = listaTarefa.size()-1;
            Tarefa c = listaTarefa.get(indexU);
            novoId = c.getId()+1;
        }
        return novoId; 
    }
    

    public void limpar() {
        jTextFieldID.setText(gerarId()+"");
        jTextFieldTitulo.setText("");
        jTextFieldDescricao.setText("");
        jComboBoxTarefa.setSelectedIndex(0);
    }

    public void mudarLabel() {
        if (!jComboBoxTarefa.equals("Pendente")) {
            jLabelTextoMuda.setText("Este usuário já concluiu 0 tarefas");
        } else {
            this.contador++;
            String num = String.valueOf(this.contador);
            jLabelTextoMuda.setText("Este usuário já concluiu " + num + " tarefas");
        }

    }

    public void carregarLista(ArrayList<Tarefa> listaAtualizada) {
        modle.setRowCount(0);

        // Preenche novamente com os dados da lista
        for (Tarefa t : listaAtualizada) {
            modle.addRow(new Object[]{
                t.getId(),
                t.getTitulo(),
                t.getDescricao(),
                t.getConcluida()
            });
        }

        // Atualiza a tabela (caso ainda não esteja associada)
        tabelaTarefa.setModel(modle);

        // Reorganiza as colunas (opcional, melhora a usabilidade)
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modle);
        tabelaTarefa.setRowSorter(sorter);
    }

    public void cadastrarTarefa() {
        try {
            int id = Integer.parseInt(jTextFieldID.getText());
            String titulo = jTextFieldTitulo.getText();
            String descricao = jTextFieldDescricao.getText();
            String status = jComboBoxTarefa.getSelectedItem() + "";

            // Criar objeto tarefa
            Tarefa tarefa = new Tarefa(id, titulo, descricao, status);

            // Adicionar na lista
            listaTarefa.add(tarefa);

            // Adicionar na JTable
            DefaultTableModel model = (DefaultTableModel) tabelaTarefa.getModel();
            model.insertRow(0, new Object[]{tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getConcluida()});

            //Por em ordem de id
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            tabelaTarefa.setRowSorter(sorter);
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sorter.setSortKeys(sortKeys);
            sorter.sort();

            // Limpar campos
            jTextFieldID.setText("");
            jTextFieldTitulo.setText("");
            jTextFieldDescricao.setText("");
            jComboBoxTarefa.setSelectedIndex(0);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID deve ser um número!");
        }

    }

    public void editarTarefa() {
        int linha = tabelaTarefa.getSelectedRow(); // pega a linha selecionada
        if (linha != -1) {
            // Se estiver usando sorter, converte para o índice do model
            linha = tabelaTarefa.convertRowIndexToModel(linha);

            DefaultTableModel model = (DefaultTableModel) tabelaTarefa.getModel();

            // Pega os valores da linha
            int id = (int) model.getValueAt(linha, 0);
            String titulo = (String) model.getValueAt(linha, 1);
            String descricao = (String) model.getValueAt(linha, 2);
            String status = (String) model.getValueAt(linha, 3);

            // Coloca nos campos
            jTextFieldID.setText(String.valueOf(id));
            jTextFieldTitulo.setText(titulo);
            jTextFieldDescricao.setText(descricao);
            jComboBoxTarefa.setSelectedItem(status);

            // Troca o texto do botão para "Editar"
            jButtonCadastrarTarefa.setText("Editar");

            // Guarda o índice da tarefa no ArrayList para edição posterior
            index = -1;
            for (int i = 0; i < listaTarefa.size(); i++) {
                if (listaTarefa.get(i).getId() == id) {
                    index = i;
                    break;
                }
            }
        }
    }
}
