/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.utils;

import gerenciador.Interfaces.ObjetoVenda;
import gerenciador.Model.Animais.Boi;
import gerenciador.Model.Animais.Ovelha;
import gerenciador.Model.Carros.Classico;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author PICHAU
 */
public class TiposUtil {

    public static final String CLASSICO = "Classico";
    public static final String OVELHA = "Ovelha";
    public static final String BOI = "Boi";
    public static final String VEICULOS = "Veiculos";
    public static final String ANIMAIS = "Animais";
    

    public static List<String> getTipos() {
        List<String> lista = new LinkedList<String>();
        lista.add(ANIMAIS);
        lista.add(VEICULOS);

        return lista;

    }
 

    public static List<String> getTiposDeVeiculos() {
        List<String> lista = new LinkedList<String>();
        lista.add(CLASSICO);

        return lista;

    }

    public static List<String> getTiposDeAnimais() {
        List<String> lista = new LinkedList<String>();
        lista.add(BOI);
        lista.add(OVELHA);

        return lista;

    }

    public static ObjetoVenda criaObjeto(double preco, String nome, int idade, String subTipo, String descricao) {

        ObjetoVenda obj = null;

        if (subTipo == BOI) {
            Boi boi = Boi.criaBoi(preco, nome, idade, descricao);
            obj = boi;
        } else if (subTipo == OVELHA) {
            Ovelha ovelha = Ovelha.criaOvelha(preco, nome, idade, descricao);
            obj = ovelha;
        } else if (subTipo == CLASSICO) {
            Classico boi = Classico.criaClassico(preco, nome, idade, descricao);
            obj = boi;
        }

        return obj;
    }

}
