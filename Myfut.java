/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfut;

/**
 *
 * @author 182300007
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.LinkedList;
import java.sql.DatabaseMetaData;


public class Myfut {

   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
   public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String vermelho = "\u001B[41m";
    public static final String preto = "\u001B[40m";
    public static final String azul = "\u001B[44m";
    public static final String roxo = "\u001B[45m";
    public static final String ciano = "\u001B[46m";
    public static final String branco = "\u001B[47m";
     
   
   
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean contemsenha;
        boolean contemlogin;
        contemsenha = true;
        

        String membro[];
        membro = new String[15];
        
        
        String nometime = " ";
        int idademembro[];
        idademembro = new int[15];
        
        
        
        int idmembro;
        
        idmembro = 0;
        
                
                
        
        
        String nomejogador; 
        String senhajogador;
        int tipo;
        int respmenuj;
        int respcriarp;
        int qualquadra;
        
        int resphorario;
        
        String nomeproprietario;
        String senhaproprietario;
        int respmenup;
        int respquadra;
        String nomequadra;
        int contquadra;
        List<String> vetor;
        contquadra = 0;
        
        int loginoucadastro;
        
        
        String quadra1; 
        String quadra2;
        String quadra3;
        String quadra4;
        
        
        int numeropartidas;
        int numerocampeonatos;
        double avaliacaojogador;
        
        
        
          List<String> cadastronomecompleto;
         List<String> cadastronome;
          List<String> cadastrosenha;
          int idjogador;
          int controle;
          String cadastronomecompleto1;
          String cadastronome1;
          String cadastrosenha1;
          int fazer;
          
          
            idjogador = 0;
        
        cadastronomecompleto = new ArrayList<String>();
        cadastronome = new ArrayList<String>();
        cadastrosenha = new ArrayList<String>();
        
         int contcadastro;
         
         contcadastro = 0;
        
         cadastrosenha1 = " ";
        
        
        quadra1 = "Planet Ball";
        quadra2 = "HD Sports";
        quadra3 = "Gold";
        quadra4 = "FairPlay";
        
            numeropartidas = 0;
            numerocampeonatos = 0;
            avaliacaojogador = 0;
            
        
        
        
        Scanner ent = new Scanner(System.in);
         System.out.println(ANSI_GREEN_BACKGROUND + "============= My Fut! =============" + ANSI_RESET);
         
          System.out.println(ANSI_GREEN_BACKGROUND + "Bem vindo ao aplicativo da galera! " + ANSI_RESET);
         
       
      System.out.println("Digite 1 para logar \n" + "Digite 2 para fazer cadastro");
      loginoucadastro = ent.nextInt();
      
      if( loginoucadastro == 2){
          
          System.out.println("Digite seu nome completo"); 
          cadastronomecompleto1 = ent.next();
          
          System.out.println("Digite seu nome de login"); 
          cadastronome1 = ent.next();
          
          
          System.out.println("Digite sua senha"); 
          cadastrosenha1 = ent.next();
          
          
          
          
          
          
          cadastronomecompleto.add(cadastronomecompleto1);
          cadastronome.add(cadastronome1);
          cadastrosenha.add(cadastronome1);
          
          idjogador++;
          
            System.out.println("Seu id é: " + idjogador); 
          
                  
          
           
          
          
      }
      
        
        
        System.out.println("Digite 1 para logar como jogador\n" + "Digite 2 para logar como prorietario");
        tipo = ent.nextInt();
        
        if(tipo == 1){
                 System.out.println("Digite seu nome fera!! ");
            nomejogador = ent.next();
            
            contemlogin = cadastronome.contains(nomejogador);
            
            
            
            
            
            
            
             System.out.println("Digite sua senha! ");
            senhajogador = ent.next();
            
            contemsenha = true;
            
         
             contemsenha = cadastrosenha.contains(senhajogador);
             
                if (contemsenha == false){
                    
                    System.out.println("Senha incorreta, digite novamente");
                     senhajogador = ent.next();
                     
                     
                     
                    
                }
                    
            
            
            
             System.out.println("Digite '1' para criar uma partida \n" + "Digite '2' para acessar o perfil\n" + "Digite '3' para montar um time");
              respmenuj = ent.nextInt();
              
              
              
              
              
              
              if(nomejogador.equalsIgnoreCase("Messi") && senhajogador.equals("quimira")){
                  
                 
                      
                      nomejogador ="Lionel Messi GOAT"; 
                  numeropartidas = 1028;
            numerocampeonatos = 7;
            avaliacaojogador = 5.1;
                      
                 
                  
                   
                 
                  
                  
              }
              
                if(nomejogador.equalsIgnoreCase("CR7") && senhajogador.equals("sii")){
                  
                  
                      
                      nomejogador = "Cristiano Ronaldo GOAT" ;
                  numeropartidas = 1115;
            numerocampeonatos = 13;
            avaliacaojogador = 5.1;
                      
                 
                  
            
            
                }
                  
                
                  if(nomejogador.equalsIgnoreCase("Joao") && senhajogador.equals("admmyfut")){
                  
                  
                      
                      nomejogador = "João Víctor da Silveira Seeches GOAT";
                  numeropartidas = 50;
            numerocampeonatos = 100;
            avaliacaojogador = 5.1;
                      
                 
                  
            
            
                }
                  
                    if(nomejogador.equalsIgnoreCase("Jeferson") && senhajogador.equals("admsenac")){
                  
                  
                      
                      nomejogador = "Jeferson Tigisk Silva";
                  numeropartidas = 0;
            numerocampeonatos = 0;
            avaliacaojogador = 2.5;
            
            
                      
                 
                  
            
            
                }
                  
                  
                  
              
              
             
             if (respmenuj == 1 ){
                 
                 dia();
                 
                  System.out.println("Digite '1' para mostrar as quadras disponíveis");
                  respcriarp = ent.nextInt();
                  
                  if ( respcriarp == 1 ){
                      
                      System.out.println("1- " + quadra1 + "\n" + "2 - " +quadra2  + "\n" + "3 -" +quadra3  + "\n" + "4- " + quadra4);
                      
                      
                      qualquadra = ent.nextInt();
                      
                      if(qualquadra == 1){
                          
                          PlanetBall(); 
                          
                          
                          
                      }
                      
                      if(qualquadra == 2){
                          
                          HDSports(); 
                          
                          
                          
                      }
                      
                      if(qualquadra == 3){
                          
                          Gold(); 
                          
                          
                          
                      }
                      
                      if(qualquadra == 4){
                          
                          FairPlay(); 
                          
                          
                          
                      }
                      
                      confirmarpartida();
                      
                      
                      
                  }
                  
                
                  
                  
                 
                 
                 
             }
             
             
               if (respmenuj == 2 ){
                      
                      System.out.println("Bem vindo ao perfil do jogador! \n");
                      
                      
                      System.out.println("Nome: " + nomejogador + "\n");
                      System.out.println("Time: " + nometime + "\n");
                      System.out.println("Partidas jogadas: " + numeropartidas + "\n");
                       System.out.println("Campeonatos " + numerocampeonatos + "\n");
                       
                       
                       System.out.println("Avaliação do jogador: " + avaliacaojogador + " -  ");
                        System.out.println(craque(avaliacaojogador));
                      
                        int respperfil;
                        System.out.println("Digite 1 para exibir seu time: " );
                        respperfil = ent.nextInt();
                        
                        int contperfil;
                        
                        if(respperfil == 1){
                            
                            for(contperfil = 0 ; contperfil < idjogador; contperfil++ ){
                                
                                 System.out.println("nome: " + membro[idjogador] + "\n");
                                 
                                 
                                
                                
                            }
                            
                        }
                        
                        
                  }
               
               if (respmenuj == 3){
                    int respmenuj3;
                    
                    System.out.println("Vamos montar seu time! Digite um nome para ele! " );
                   nometime = ent.next();
                    
                   System.out.println("Pronto para monstar seu time? digite '1' para adicionar um jogador" );
                   respmenuj3= ent.nextInt();
                   while(respmenuj3 == 1){
                       
                       
                        System.out.println("Insira o nome do craque! " );
                   membro[idmembro] = ent.next();
                   
                    System.out.println("Insira a idade dele!" );
                   idademembro[idmembro] = ent.nextInt();
                       
                       
                       idmembro++;
                       System.out.println("Digite 1 para continuar criando \n Digite 2 para terminar");
                   respmenuj3= ent.nextInt();
                       
                   }
                   
                  if(respmenuj3 == 2){
                      
                       System.out.println("Digite '1' para criar uma partida \n" + "Digite '2' para acessar o perfil\n" + "Digite '3' para montar um time");
              respmenuj = ent.nextInt();
             
              
              
                      
                      
                      
                  }
                   
                   
               }
             
             
        }
        
          if(tipo == 2){
                 System.out.println("Opa mestre! Qual seu nome ");
            nomeproprietario = ent.next();
            
             System.out.println("Digite sua senha! ");
            senhaproprietario = ent.next();
            
             System.out.println("digite 1 para gerenciar suas quadras" + "digite 2 para criar um campeonato" + "digite 3 para criar quadra" );
              respmenup = ent.nextInt();
             
             if(respmenup == 1){
                 System.out.println("Digite 1 para criar ou continuar criando");
              respquadra = ent.nextInt();
                 
                 while(respquadra == 1){
                     
                      System.out.println("Registre uma quadra");
                       nomequadra = ent.next();
                       
                         System.out.println("Digite 1 para criar ou continuar criando");
              respquadra = ent.nextInt();
                       
                       
                       
                       
                      contquadra++;
                      
                     
                     
                     
                     
                     
                     
                 }
                 
                 
                 
                 
             }
             
        }
          
        
        
    
        
        
        
        
             
            
            
            
        
        
    }
    
    public static void dia(){
        
       String dialeia;
       String diasemana;
       dialeia = " ";
       
        Scanner ent = new Scanner(System.in);
        
       System.out.println("Digite um dia da semana, sendo 1 domindo e 2 segunda");
       dialeia = ent.next();
                       
           switch(dialeia){
               
               case "1":
                    diasemana = "Domingo";
                    System.out.println("Você selecionou " + diasemana);
                    
                    
                    break;
                    
               case "2":
                    diasemana = "Segunda";
                    System.out.println("Você selecionou " + diasemana);
                    break;
                    
                    
                      case "3":
                    diasemana = "Terça";
                    System.out.println("Você selecionou " + diasemana);
                    break;
                    
                    
                      case "4":
                    diasemana = "Quarta";
                    System.out.println("Você selecionou " + diasemana);
                    break;
                    
                    
                      case "5":
                    diasemana = "Quinta";
                    System.out.println("Você selecionou " + diasemana);
                    break;
                    
                    
                      case "6":
                    diasemana = "Sexta";
                    System.out.println("Você selecionou " + diasemana);
                    break;
                    
                    
                      case "7":
                    diasemana = "Sábado";
                    System.out.println("Você selecionou " + diasemana);
                    break;
                    
                    
                   
                    
                    default:
                        System.out.println("oi joão");
                        break;
                        
                       
                        
                        
                        
            
        }
        
    }
    
    public static void jogador(){
        String nomejogador; 
        String cpf;
        int idade;
        String telefonejogador;
        
        
        
        
        
        
        
    }
    
    public static void partida(){
        
        double horario_inicio;
        boolean disponibilidade;
        String local;
        
        
        
        
                
        
        
    }
    
    public static void PlanetBall(){
        
        
        double horario1;
    double horario2;
    double horario3;
    String endereco;
    
    
    horario1 = 10.30;
     horario2 = 11.30;
     horario3 = 13.30;
    
     System.out.println("horário 1 " + horario1 +"\n"); 
       System.out.println("horário 2 " + horario2 +"\n"); 
        System.out.println("horário 3 " + horario3 +"\n"); 
     
     
    }
    
    public static void FairPlay(){
        
        double horario1;
    double horario2;
    double horario3;
    String endereco;
    
    
    horario1 = 10.30;
     horario2 = 11.30;
     horario3 = 13.30;
    
     System.out.println("horário 1 " + horario1 +"\n"); 
       System.out.println("horário 2 " + horario2 +"\n"); 
        System.out.println("horário 3 " + horario3 +"\n"); 
     
     
    }
    
    public static void HDSports(){
        
        double horario1;
    double horario2;
    double horario3;
    String endereco;
    
    
    horario1 = 10.30;
     horario2 = 11.30;
     horario3 = 13.30;
    
     System.out.println("horário 1 " + horario1 +"\n"); 
       System.out.println("horário 2 " + horario2 +"\n"); 
        System.out.println("horário 3 " + horario3 +"\n"); 
     
     
    }
    
    public static void Gold(){
        
        double horario1;
    double horario2;
    double horario3;
    String endereco;
    
    
    horario1 = 10.30;
     horario2 = 11.30;
     horario3 = 13.30;
    
     System.out.println("horário 1 " + horario1 +"\n"); 
       System.out.println("horário 2 " + horario2 +"\n"); 
        System.out.println("horário 3 " + horario3 +"\n"); 
     
     
    }
    
    
    public static String craque(double nota){
        
        
        
          if(nota > 5 ){
            return (ANSI_YELLOW_BACKGROUND +  "  Lenda  " + ANSI_RESET);
        }
        
        if(nota == 5 ){
            return (ANSI_GREEN_BACKGROUND + " Craque absoluto " + ANSI_RESET);
        }
        
          
        if(nota >= 4 && nota < 5 ){
            return (azul + " Craque " + ANSI_RESET);
        }
        
        
          
        if(nota >= 3 && nota < 4 ){
            return (roxo + " Acima da Média " + ANSI_RESET);
        }
        
         if(nota >= 2 && nota < 3 ){
            return  (ciano + " Farda no Vasco" + ANSI_RESET);
        }
         
          if(nota >= 1 && nota < 2 ){
            return " Pereba raiz";
        }
          
           if(nota < 1 ){
            return (vermelho + " Desiste irmão" + ANSI_RESET);
        }
          
          
           
        
        
          
      
        
        
            
            
            
            return " Craque ";
            
            
    }     
    
    public static void cadastro(){
        
        List<String> cadastronomecompleto;
         List<String> cadastronome;
          List<String> cadastrosenha;
          int idjogador;
          int controle;
          String cadastronomecompleto1;
          String cadastronome1;
          String cadastrosenha1;
          int fazer;
          
          
        idjogador = 0;
        
        cadastronomecompleto = new ArrayList<String>();
        cadastronome = new ArrayList<String>();
        cadastrosenha = new ArrayList<String>();
        
         Scanner ent = new Scanner(System.in);
         
        // System.out.println("Digite 1 para fazer o cadastro"); 
          // fazer = ent.nextInt();
         
         
        
          
          
        
             
             System.out.println("Digite seu nome completo"); 
          cadastronomecompleto1 = ent.next();
          
          System.out.println("Digite seu nome de login"); 
          cadastronome1 = ent.next();
          
          
          System.out.println("Digite sua senha"); 
          cadastrosenha1 = ent.next();
          
          
          
          
          
          
          cadastronomecompleto.add(cadastronomecompleto1);
          cadastronome.add(cadastronome1);
          cadastrosenha.add(cadastronome1);
          
          idjogador++;
          
            System.out.println("Seu id é: " + idjogador); 
          
                  
                  
          
          
          
        
    }
    
   
    
    
   
    
    public static void confirmarpartida(){
        
        int resphorario;
        
          double horario1;
    double horario2;
    double horario3;
    String endereco;
    String horafut;
    
    horafut = " ";
        
   
        
        Scanner ent = new Scanner(System.in);
        
         System.out.println("Digite o número do horário que você quer jogar!" );
         resphorario = ent.nextInt();
         
        
         
         
         
         if(resphorario == 1){
             
         horafut = "10:30 ";
         }
         
         
         if(resphorario == 2){
             
             horafut = "11:30";
         }
         
         
         if(resphorario == 3){
             
              horafut = "13: 30 ";
         }
         
          System.out.println("Partida marcada! Você marcou o horário das " + horafut);
         
      
    }
}
    
    
    
















