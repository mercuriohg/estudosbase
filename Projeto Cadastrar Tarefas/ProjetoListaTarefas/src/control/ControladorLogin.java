/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import db.BDUsuario;
import java.awt.Dimension;
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
public class ControladorLogin {

    JTextField jTextFieldEmail;
    JPasswordField jPasswordField;
    JDesktopPane jDesktop;

    public ControladorLogin(JTextField jTextFieldEmail, JPasswordField jPasswordField, JDesktopPane jDesktop) {
        this.jTextFieldEmail = jTextFieldEmail;
        this.jPasswordField = jPasswordField;
        this.jDesktop = jDesktop;
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

    public void login() {
        String identificador = jTextFieldEmail.getText().trim(); // pode ser nome ou email
        String senha = new String(jPasswordField.getPassword()).trim();

        Pessoa usuario = BDUsuario.buscarUsuario(identificador, senha);

        if (usuario != null) {
            // Achou o usuário → abre a tela principal
            abrirTelaPrincipal();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
            return;
        }
    }

}

