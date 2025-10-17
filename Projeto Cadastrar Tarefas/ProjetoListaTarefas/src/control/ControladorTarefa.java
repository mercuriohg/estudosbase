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
        modle.setColumnIdentifiers(new Object[]{"ID", "Título", "Descrição", "Status"});
        limpar();
    }

    public int gerarId() {
        int novoId = 1;
        if (!listaTarefa.isEmpty()) {
            int indexU = listaTarefa.size() - 1;
            Tarefa c = listaTarefa.get(indexU);
            novoId = c.getId() + 1;
        }
        return novoId;
    }

    private void reorganizarIds() {
        for (int i = 0; i < listaTarefa.size(); i++) {
            listaTarefa.get(i).setId(i + 1);
        }
    }

    public void salvarEdicaoOuExcluir() {
        if (index >= 0 && index < listaTarefa.size()) {
            Tarefa tarefa = listaTarefa.get(index);
            String novoStatus = jComboBoxTarefa.getSelectedItem().toString();

            if (!tarefa.getConcluida().equals(novoStatus)) {
                // Se o status mudou para Concluída → remove
                if (novoStatus.equalsIgnoreCase("Concluída")) {
                    listaTarefa.remove(index);
                    reorganizarIds();
                    JOptionPane.showMessageDialog(null, "Tarefa concluída e removida com sucesso!");
                } else {
                    // Só atualiza o status
                    tarefa.setConcluida(novoStatus);
                    listaTarefa.set(index, tarefa);
                    JOptionPane.showMessageDialog(null, "Status atualizado com sucesso!");
                }

                // Atualiza a tabela
                carregarLista(listaTarefa);
                limpar();

                // Reabilita os campos e volta o texto do botão
                jTextFieldTitulo.setEnabled(true);
                jTextFieldDescricao.setEnabled(true);
                jButtonCadastrarTarefa.setText("Cadastrar");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma modificação detectada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa selecionada para editar!");
        }
    }

    public void limpar() {
        jTextFieldID.setText(gerarId() + "");
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
        DefaultTableModel model = (DefaultTableModel) tabelaTarefa.getModel();
        model.setRowCount(0); // limpa

        for (Tarefa t : listaAtualizada) {
            model.addRow(new Object[]{
                t.getId(),
                t.getTitulo(),
                t.getDescricao(),
                t.getConcluida()
            });
        }

        // se quiser garantir que está ordenado:
        tabelaTarefa.setAutoCreateRowSorter(true);
    }

    public void cadastrarTarefa() {
        try {
            int id = Integer.parseInt(jTextFieldID.getText());
            String titulo = jTextFieldTitulo.getText();
            String descricao = jTextFieldDescricao.getText();
            String status = jComboBoxTarefa.getSelectedItem() + "";

            DefaultTableModel model = (DefaultTableModel) tabelaTarefa.getModel();

            if (jButtonCadastrarTarefa.getText().equals("Editar") && index != -1) {
                // Atualiza tarefa existente
                Tarefa tarefaEditada = listaTarefa.get(index);
                tarefaEditada.setTitulo(titulo);
                tarefaEditada.setDescricao(descricao);
                tarefaEditada.setConcluida(status);

                // Atualiza tabela visualmente
                model.setValueAt(id, index, 0);
                model.setValueAt(titulo, index, 1);
                model.setValueAt(descricao, index, 2);
                model.setValueAt(status, index, 3);

                // Volta o botão para modo “Cadastrar”
                jButtonCadastrarTarefa.setText("Cadastrar");

                JOptionPane.showMessageDialog(null, "Tarefa atualizada com sucesso!");
            } else {
                // Adiciona nova tarefa
                Tarefa tarefa = new Tarefa(id, titulo, descricao, status);
                listaTarefa.add(tarefa);

                model.addRow(new Object[]{tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getConcluida()});
                JOptionPane.showMessageDialog(null, "Tarefa cadastrada com sucesso!");
            }

            // Reordena por ID crescente
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            tabelaTarefa.setRowSorter(sorter);
            sorter.toggleSortOrder(0);
            limpar();
            carregarLista(listaTarefa);

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
