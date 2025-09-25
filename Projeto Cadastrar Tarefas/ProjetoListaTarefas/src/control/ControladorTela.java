/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import vision.PainelPrincipal;
import vision.TelaCadastro;
import vision.TelaLogin;
import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author alunos
 */
public class ControladorTela {
    JDesktopPane jDesktop;

    public ControladorTela(JDesktopPane jDesktop) {
        this.jDesktop = jDesktop;
    }

      public void abrirTelaLogin(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); 
        TelaLogin tLogin = new TelaLogin(jDesktop);        
        tLogin.setSize(resolucao);
        tLogin.setLocation(0, 0);
        jDesktop.add(tLogin);
        tLogin.setVisible(true);
    }
    
    public void abrirCadastro(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); //captura resolução do container
        TelaCadastro tCadastro = new TelaCadastro();        
        tCadastro.setSize(resolucao);
        tCadastro.setLocation(0, 0);
        jDesktop.add(tCadastro);
        tCadastro.setVisible(true);
    }
    
      public void voltarTela(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); //captura resolução do container
        PainelPrincipal tPrin = new PainelPrincipal();        
        tPrin.setSize(resolucao);
        tPrin.setLocation(0, 0);
        jDesktop.add(tPrin);
        tPrin.setVisible(true);
    }
}
