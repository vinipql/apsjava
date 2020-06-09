package aps;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Voluntario {
    
        private String nome;
        private long whatsapp;
        private long telefone;
        private long CPF;
        private long zapLength;
        private long teleLength;
        private long cpfLength;
        
        public Voluntario() {
            this.nome = "Anonimo";
            
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
       
        
        public void Cadastro(){
            Scanner inpiut = new Scanner(System.in);
            System.out.println("Digite o seu nome: ");
            this.nome = inpiut.nextLine();
            if(this.nome.length() < 4){
                throw new IllegalArgumentException("Nome invalido");
            }
            try{
            System.out.println("Digite o seu WhatsApp: ");
            this.whatsapp = Long.parseLong(inpiut.nextLine());
            zapLength = Long.toString(whatsapp).length();

            if(this.zapLength < 10){
                throw new IllegalArgumentException("Numero do WhatsApp deve ser maior que 11.(XX)XXXX-XXXX");  
            }
            else{
                System.out.println("Numero de WhatsApp cadastrado com sucesso");
            }
            }catch(InputMismatchException erro1){
                System.err.println("Nao é permitido inserir letras no WhatsApp!");
                inpiut.nextLine();
            }
            try{
            System.out.println("Digite o seu telefone: XXXXXXXXXX");
            this.telefone = Long.parseLong(inpiut.nextLine());
                this.teleLength = Long.toString(telefone).length();
                if(this.teleLength < 10){
                throw new IllegalArgumentException("Numero de telefone invalido XXXXXXXXXX");
            }
            else{
                System.out.println("Telefone cadastrado com sucesso");
                }
            }catch(InputMismatchException erro2){
                System.err.println("Nao é permitido inserir letras no numero do telefone.");
            }
            try{
            this.CPF = Long.parseLong(inpiut.nextLine());
                this.cpfLength = Long.toString(CPF).length();
                if(this.cpfLength < 11){
                throw new IllegalArgumentException("Numero de CPF Inválido!");
            }
            }catch(InputMismatchException erro3){
                System.err.println("Não é permitido inserir letras no CPF!");
            }
           
        }
        public void Status(){
            System.out.println("Olá " + this.nome);
            System.out.println("A situação atual do seu cadastro é a seguinte:");
            System.out.println("     Nome: " + this.nome);
            System.out.println("     Telefone: " + this.telefone);
            System.out.print("     CPF: " + this.CPF);
                   
            
        }
                
         
        
}
