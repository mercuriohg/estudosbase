/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import vision.TelaCadastro;
import vision.TelaDesktopPrincipal;
import vision.TelaLogin;

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

   
    
    public void abrirTelaPrincipal(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); 
        TelaDesktopPrincipal view = new TelaDesktopPrincipal();        
        view.setSize(resolucao);
        view.setLocation(0, 0);
        jDesktop.add(view);
        view.setVisible(true);
    }
    
    public void abrirTelaCasatro(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); 
        TelaCadastro view = new TelaCadastro();        
        view.setSize(resolucao);
        view.setLocation(0, 0);
        jDesktop.add(view);
        view.setVisible(true);
    }

    public void login() {
        if(jTextFieldEmail.getText().equals("foda")){
            abrirTelaPrincipal();
        }else{
            abrirTelaCasatro();
        }
    }
    
}
