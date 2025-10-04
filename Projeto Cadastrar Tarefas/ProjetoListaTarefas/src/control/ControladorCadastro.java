/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import db.BDUsuario;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Pessoa;
import vision.TelaCadastro;
import vision.TelaDesktopPrincipal;

/**
 *
 * @author alunos
 */
public class ControladorCadastro {

    JTextField jTextFieldNome;
    JTextField jTextFieldEmail;
    JPasswordField jPasswordFieldSenha;
    JDesktopPane jDesktop;
    JButton jButtonCadastro;
    JList<String> jListCadastro;
    DefaultListModel defaultListModel = new DefaultListModel();
    ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    int index;

    public ControladorCadastro(JTextField jTextFieldNome, JTextField jTextFieldEmail, JPasswordField jPasswordFieldSenha, JDesktopPane jDesktop, JButton jButtonCadastro, JList<String> jListCadastro, int index) {

        this.jTextFieldNome = jTextFieldNome;
        this.jTextFieldEmail = jTextFieldEmail;
        this.jPasswordFieldSenha = jPasswordFieldSenha;
        this.jDesktop = jDesktop;
        this.jButtonCadastro = jButtonCadastro;
        this.jListCadastro = jListCadastro;
        this.index = index;
        carregarLista();

    }

    public void limpar() {
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jPasswordFieldSenha.setText("");
    }

    public void cadastrarUsuario() {
        String nome = jTextFieldNome.getText().trim();
        String email = jTextFieldEmail.getText().trim();
        String senha = new String(jPasswordFieldSenha.getPassword()).trim();
        Pessoa p = new Pessoa(nome, email, senha);

        if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return;

        } else if (!email.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "E-mail inválido! Digite um endereço válido.");
            return;
        } else {
            listaPessoa.add(p);
            BDUsuario.adicionarUsuario(p);
            defaultListModel.addElement(p.getNome());
            abrirTelaPrincipal();
        }

        limpar();
        BDUsuario.salvar(listaPessoa);
        carregarLista();

    }

    public void carregarLista() {
        listaPessoa = (ArrayList<Pessoa>) BDUsuario.carregar();
        defaultListModel = new DefaultListModel();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        for (Pessoa user : listaPessoa) {
            listaAtualizada.add(user.getNome() + " - " + user.getEmail());
        }
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
        jListCadastro.setModel(defaultListModel);
    }

    public void abrirTelaPrincipal() {
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize();
        TelaDesktopPrincipal view = new TelaDesktopPrincipal();
        view.setSize(resolucao);
        view.setLocation(0, 0);
        jDesktop.add(view);
        view.setVisible(true);
    }

    public void abrirTelaCadastro() {
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize();
        TelaCadastro view = new TelaCadastro(jDesktop);
        view.setSize(resolucao);
        view.setLocation(0, 0);
        jDesktop.add(view);
        view.setVisible(true);
    }

}
