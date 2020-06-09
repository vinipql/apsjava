package aps;

import java.util.Scanner;

public class Floresta extends APS{
 
    private String nome;
    private int condicao;
    private int valorDoado;

    public Floresta(String nome, int condicao) {
        this.nome = nome;
        this.condicao = condicao;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCondicao() {
        return condicao;
    }

    public void setCondicao(int condicao) {
        this.condicao = condicao;
    }

    public int getValorDoado() {
        return valorDoado;
    }

    public void setValorDoado(int valorDoado) {
        this.valorDoado = valorDoado;
    }
    
    
        
    
    
    public void aprimorar(){
            Scanner inpiut = new Scanner(System.in);
            String newline = System.getProperty(("line.separator"));
            System.out.println("Voce esta prestes a ajudar algumas florestas, tanto na preservação"
                + "(combate ao desmatamento), quanto no reflorestamento das mesmas. No momento, "
                + "contamos com 5 florestas que ajudamos em nossa ONG. Voce pode escolher"
                + "a floresta que deseja ajudar: )" + newline + "1 - Floresta Amazonica" + newline
            + "2 - Floresta de Taiga" + newline + "3 - Floresta do Congo" + newline +
                    "4 - Selva Valdiviana" + newline + "5 - Floresta Nublada - Ecuador");
            
    }
    
    public void aprCondicao(int condition){
        
        
        if(condition > 0 && condition < 1000){
            this.condicao += 1;
        } 
        else if(condition > 1000 && condition < 2000){
            this.condicao += 3;
        }
        else if(condition > 2000 && condition < 10000){
            this.condicao += 5;
        }
        else if(condition > 10000 && condition < 100000){
            this.condicao += 6;
        }
        else{
            this.condicao += 7;
        }
        
    }
    
    public void Status(){
        if(this.condicao > 100){
            System.out.println("Parabéns, voce conseguiu ajudar a: " + this.nome + " a ser"
                    + "completamente reflorestada. Muito obrigado!!");
        }
        else{
        System.out.println("Atualmente a: " + this.nome + "encontra-se com a taxa de flerestamento em: "
        + this.condicao + "%.");
        }
        
    }
            
    
}           

