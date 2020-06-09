package aps;

import java.util.Scanner;

public class Conta implements Autentication{
    private String numero;
    private double saldo;
    private String dono;
    private boolean status;
    private int valor;

    public Conta(String numero, double saldo, boolean status) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = status;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void creditar(int valor){
        saldo += valor;
    }
    public void debitar(int condition){
        if(condition > this.getSaldo()){
            
        }
        else{
        saldo -= condition;
    }
    
    }
    public void depositar(){
        System.out.println("Digite o valor que deseja depositar: ");
        Scanner inpiut = new Scanner(System.in);
        valor = Integer.parseInt(inpiut.next());
        this.setSaldo(this.getSaldo() + valor);
    }
    
    public void abrirConta(){
        this.setStatus(true);
        this.setSaldo(50);
        
    }
    
    public void sacar(int condition) {
        
        int w = 1;
        while(w != 0){
            if(condition > this.getSaldo()){
                System.out.println("Impossivel doar o valor indicado!");
                w--;
            }
            else if(condition == this.getSaldo() || condition < this.getSaldo()){
                System.out.println("Obrigado pela doação!");
                w--;
            }
        }
    }
    public void fecharConta() {
        int q = 1;
        while(q != 0){
        if(this.getSaldo() > 0) {
            System.out.println("Voce ainda tem dinheiro na conta, utilize para ajudar as Florestas");
        }
        else if(this.getSaldo() < 0) {
            System.out.println("Voce não possui dinheiro suficiente para continuar doando.");
        }
        else{
            q--;
        }
        }
    }
    public void sConta(){
        System.out.println("O saldo atual da sua conta é de: " + this.getSaldo());
    }
    
    @Override
    public void abrirMenu() {
    }

    @Override
    public void fecharMenu() {
        throw new UnsupportedOperationException("NAO TEMOS VAGAS DISPONIVEIS NO MOMENTO, TENTE NOVAMENTE EM ALGUNS DIAS!");
    }

    public void fecharContas() {
        throw new UnsupportedOperationException("SITE EM DESENVOLVIMENTO, EM BREVE ESTARA DISPONIVEL! ");
    }

    @Override
    public void ajudarFloresta() {
        throw new UnsupportedOperationException("Sem suporte atualmente"); 
    }

    @Override
    public void criarContas() {
        throw new UnsupportedOperationException("Sem suporte atualmente");
    }
}
