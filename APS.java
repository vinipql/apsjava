package aps;
import java.util.Scanner;
public class APS implements Autentication{
public static void main(String[] args) {
    
    //Inicio da aplicação, as duas primeiras linhas são o comandos para o input e separador de linhas
    
    Scanner inpiut = new Scanner(System.in);
    String newline = System.getProperty(("line.separator"));
    System.out.println("Bem-vindo! Nós somos da ONG reflorestamento, sabemos dos diversos problemas da ação"
            + " humana causa para nosso meio ambiente um dos piores é o desmatamento de florestas são inúmeros"
            + " os danos que essa ação traz para o meio ambiente, por isso nós buscamos amenizar esses efeitos"
            + " por meio de medidas de preservação e reflorestamento de algumas áreas, caso se sensibilize com"
            + " essa causa você poderá em seguida contribuir com qualquer valor, será mostrado todas as áreas"
            + " florestais que nós atuamos e poderá ver qual a situação atual de cada uma e a porcentagem atual"
            + " de florestamento delas, para contribuir é muito simples apenas escolha para qual floresta você"
            + " quer enviar sua contribuição e em seguida digite o valor, essa contribuição terá efeito direto"
            + " no reflorestamento da área escolhida e a partir de um certo valor podemos aumentar a porcentagem"
            + " de florestamento da área, você poderá voltar a qualquer momento para ver o status atual das florestas"
            + ". Mas não se preocupe qualquer valor já terá um impacto positivo na preservação da floresta escolhida,"
            + " desde já agradecemos qualquer contribuição feita, lembre-se que você não está ajudando apernas a ong"
            + " e sim ajudando o nosso planeta");
    
    System.out.println("Voce deseja entrar em nosso programa de doações e participar desse projeto?" + newline
    + "Digite SIM ou NAO");
    
    String decision = inpiut.nextLine();
    if(decision.equals("SIM")){
    System.out.println("Digite o numero da opção que deseja: ");
    
    //Objetos sendo instanciados
    Voluntario v1 = new Voluntario();
    Conta c1 = new Conta("4593", 150, true);
    Floresta f1 = new Floresta("Amazonia", 40);
    Floresta f2 = new Floresta("Floresta de Taiga", 85);
    Floresta f3 = new Floresta("Floresta do Congo", 80);
    Floresta f4 = new Floresta("Selva Valdiviana", 90);
    Floresta f5 = new Floresta("Floresta Nubladas - Ecuador", 50);
    
    int x = 1;
    
    while(x == 1){
        
    
    System.out.println("1: Registrar seu nome" + newline + "2: Criar uma conta para doação"
            + newline + "3: Verificar seu Status atual" + newline + "4 - Saldo disponivel na conta !" + newline +
            "5 - Seleção das Floresta" + newline + "6 - Status das Florestas" + newline + 
            "7 - Visitar nosso site" + "8 - Trabalhar conosco." + "9 - Sair!");
    int number = Integer.parseInt(inpiut.nextLine());
    if(number ==  1){
           
            v1.Cadastro();}
            
    else if(number == 2){
            
            System.out.println(v1.getNome() + " o5 numero da sua conta é: " + c1.getNumero() + ". Voce agora pode começar"
                    + "a depositar em sua conta para realizar doações para ajudar no combate ao desmatamento"
                    + "e o reflorestamento de algumas florestas. Seu saldo atual para doação é de: " + 
                    c1.getSaldo());
    }
    else if(number == 3){
            v1.Status();
    }
    else if(number == 4) {
            c1.sConta();
    }
    else if(number == 5) {
        System.out.println("Voce esta prestes a ajudar algumas florestas, tanto na preservação"
                + "(combate ao desmatamento), quanto no reflorestamento das mesmas. No momento, "
                + "contamos com 5 florestas que ajudamos em nossa ONG. Voce pode escolher"
                + "a floresta que deseja ajudar: )" + newline + "1 - Floresta Amazonica" + newline
            + "2 - Floresta de Taiga" + newline + "3 - Floresta do Congo" + newline +
                    "4 - Selva Valdiviana" + newline + "5 - Floresta Nublada - Ecuador");
        int y = 1;
        int z = Integer.parseInt(inpiut.nextLine());
        System.out.println("Agora digite o valor a ser doado para a floresta escolhida, lembrando que voce"
                + "tem R$ " + c1.getSaldo() + " disponiveis em sua conta");
        int condition = Integer.parseInt(inpiut.nextLine());
        if(z == 1){
            
            c1.sacar(condition);
            f1.aprCondicao(condition);
            c1.debitar(condition);
        }
        else if(z == 2){
        c1.sacar(condition);
        f2.aprCondicao(condition);
        c1.debitar(condition);
    }
        else if(z == 3) {
            c1.sacar(condition);
            f3.aprCondicao(condition);
            c1.debitar(condition);
        }
        else if(z == 4) {
            c1.sacar(condition);
            f4.aprCondicao(condition);
            c1.debitar(condition);
        }
        else if(z == 5) {
            c1.sacar(condition);
            f5.aprCondicao(condition);
            c1.debitar(condition);
        }
    
    }
    else if(number == 6){
        f1.Status();
        f2.Status();
        f3.Status();
        f4.Status();
        f5.Status();
    }
    
    else if (number == 7){
        c1.fecharContas();
    }
    else if (number == 8){
        c1.fecharMenu();
    }
    else if (number == 9){
        System.out.println("Agradecemos a sua visita, sinta-se sempre vindo para retornar.");
            x =- 1;
    }
        else{
            System.out.println("DIGITE UMA OPÇÃO VALIDA !!!!");
           }      
        }
    }
    else{
        System.out.println("A ONG APS AGRADECE A SUA VISITA, SINTA-SE A VONTADE PARA RETORNAR QUANDO QUISER !");
    }
}

    @Override
    public void abrirMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fecharMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void criarContas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fecharConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ajudarFloresta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
