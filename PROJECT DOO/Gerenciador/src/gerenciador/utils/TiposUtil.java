/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.utils;

import gerenciador.Interfaces.ObjetoVenda;
import gerenciador.Model.Animais.Boi;
import gerenciador.Model.Animais.Ovelha;
import gerenciador.Model.Outros.Brinquedo;
import gerenciador.Model.Outros.Utensilios;
import gerenciador.Model.Veiculos.Carro;
import gerenciador.Model.Veiculos.Moto;
import gerenciador.Model.Veiculos.Trator;
import java.util.LinkedList;
import java.util.List;
//para facilitar a criacao de objetos de venda
public class TiposUtil {
    //TIPO
    public static final String VEICULOS = "Veiculos";
    public static final String ANIMAIS = "Animais";
    public static final String OUTROS = "Outros";
    
    //SUBTIPO
    public static final String MOTO = "Motos";
    public static final String TRATOR = "Trator";
    public static final String CARRO = "Carros";
    public static final String OVELHA = "Ovelha";
    public static final String BOI = "Boi";
    public static final String BRINQUEDO = "Brinquedo";
    public static final String UTENSILIOS = "Utensilios";
    
    

    
    public static List<String> getTipos() {
        List<String> lista = new LinkedList<String>();
        lista.add(ANIMAIS);
        lista.add(VEICULOS);
        lista.add(OUTROS);

        return lista;

    }
    
     public static List<String> getTiposDeOutros() {
        List<String> lista = new LinkedList<String>();
        lista.add(BRINQUEDO);
        lista.add(UTENSILIOS);

        return lista;

    }
 

    public static List<String> getTiposDeVeiculos() {
        List<String> lista = new LinkedList<String>();
        lista.add(CARRO);
        lista.add(TRATOR);
        lista.add(MOTO);

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
        } else if (subTipo == CARRO) {
            Carro carro = Carro.criaCarro(preco, nome, idade, descricao);
            obj = carro;
        } else if (subTipo ==  TRATOR){
            Trator trator = Trator.criaTrator(preco, nome, idade, descricao);
            obj = trator;
        } else if (subTipo ==  MOTO){
            Moto moto = Moto.criaMoto(preco, nome, idade, descricao);
            obj = moto;
        }else if (subTipo == UTENSILIOS){
            Utensilios utensilios = Utensilios.criaUtensilios(preco, nome, idade, descricao);
            obj = utensilios;
        }else if (subTipo == BRINQUEDO){
            Brinquedo brinquedo = Brinquedo.criaBrinquedo(preco, nome, idade, descricao);
            obj = brinquedo;
        }
        return obj;
    }

}
