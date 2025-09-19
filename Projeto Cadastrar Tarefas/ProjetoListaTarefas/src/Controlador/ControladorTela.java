/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Visão.PainelPrincipal;
import Visão.TelaCadastro;
import Visão.TelaLogin;
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
        Dimension resolucao = jDesktop.getSize(); //captura resolução do container
        TelaLogin tLogin = new TelaLogin();        
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
