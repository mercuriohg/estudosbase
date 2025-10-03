/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import model.Pessoa;

/**
 *
 * @author alunos
 */
public class BDUsuario {

    public static final String ARQUIVO = "database/usuario.sv";

    public static List<Pessoa> carregar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO))) {
            return (List<Pessoa>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void salvar(List<Pessoa> pessoa) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
            oos.writeObject(pessoa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     // Adiciona um usuário no "banco"
    public static void adicionarUsuario(Pessoa p) {
        List<Pessoa> usuarios = carregar();
        usuarios.add(p);
        salvar(usuarios);
    }

    // Busca usuário pelo nome OU email + senha
    public static Pessoa buscarUsuario(String identificador, String senha) {
        List<Pessoa> usuarios = carregar();

        for (Pessoa p : usuarios) {
            if ((p.getNome().equalsIgnoreCase(identificador) ||
                 p.getEmail().equalsIgnoreCase(identificador)) &&
                 p.getSenha().equals(senha)) {
                return p;
            }
        }
        return null; // não achou
    }
}
