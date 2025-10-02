/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
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
    DefaultListModel defaultListModel = new DefaultListModel();
    ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    int index;

    public ControladorCadastro(JTextField jTextFieldNome, JTextField jTextFieldEmail, JPasswordField jPasswordFieldSenha, JDesktopPane jDesktop, JButton jButtonCadastro, int index) {
        this.jTextFieldNome = jTextFieldNome;
        this.jTextFieldEmail = jTextFieldEmail;
        this.jPasswordFieldSenha = jPasswordFieldSenha;
        this.jDesktop = jDesktop;
        this.jButtonCadastro = jButtonCadastro;
        this.index = index;
        limpar();
    }

    

    public void limpar() {
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jPasswordFieldSenha.setText("");
    }
      public void cadastrarUsuario() {
        String nome = jTextFieldNome.getText();
        String email = jTextFieldEmail.getText();
        String senha = jPasswordFieldSenha.getText();
        Pessoa p = new Pessoa (nome, email, senha);
        if (jButtonCadastro.getText().compareToIgnoreCase("Salvar") == 0) {

            listaPessoa.add(p);
        } else {
            listaPessoa.set(index, p);
        }
            limpar(); 
            carregarLista();
    
}
      public void carregarLista() {
        defaultListModel = new DefaultListModel();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        for (Pessoa user : listaPessoa) {
            listaAtualizada.add(user.getNome() + " - " + user.getEmail());
        }
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
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
