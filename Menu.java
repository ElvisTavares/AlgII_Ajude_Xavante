/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salve_Xavante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class Menu {
    //arraylist global que pode ser utilizado em todos os métodos da classe
    public static ArrayList<Jogador> jogadores = new ArrayList();
    
    public static Scanner input = new Scanner(System.in);
    
    public static Jogador jogador = new Jogador();
    
    public static void main(String[] args) {
        int op;
        
          while  (true){
            System.out.println("===============");
            System.out.println("1 - Cadastrar Jogador: ");
            System.out.println("2 - Calcular Valor Folha: ");
            System.out.println("3 - Visualizar valor Folha: ");
            System.out.println("4 - Remover Jogador: ");
            System.out.println("5 - Verificar Verba para tranferencia: ");
           op = input.nextInt();
           
           //evita erro de entrada
           input.nextLine();
           
           switch(op){
               case 1:
                   CadastrarJog();
                   break;
               
               case 2:
                   CalcularFolha();
                   break;
                   
               case 3:
                   VisualizarFolha();
                   break;
                   
               case 4:
                   RemoverJog();
                   break;
               case 5:
                   VerificarVerba();
               default:
                   System.out.println("Opção Invalida...");
           }
           
        }
    }
    
    public static void CadastrarJog(){
        String nome;
        System.out.println("Nome do jogador:");
        nome = input.nextLine();
        
        String cpf;
        System.out.println("Cpf:");
        cpf = input.nextLine();
        
        String posicao;
        System.out.println("Posição:");
        posicao = input.nextLine();
        
        double valorCompra;
        System.out.println("Valor de compra:");
        valorCompra = input.nextDouble();
        
        jogador.Cadastrar(nome,cpf,posicao,valorCompra);
        jogadores.add(jogador);
    }
    public static void CalcularFolha(){
        
    }
    public static void RemoverJog(){
        System.out.println("Informe o jogador a remover: ");
        String joo = input.nextLine();
        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jjj = jogadores.get(i);
            
            if (jjj.getNome().equals(joo)) {
                jogadores.remove(jjj);
                System.out.println("Jogador excluido");
                break;
            }
        }
    }
    
    public static void VisualizarFolha(){
        int c = 1;
        
      for(Jogador jogador : jogadores){
            System.out.println(jogador.getNome());
        System.out.println(jogador.getCpf());
        System.out.println(jogador.getValorCompra());
          System.out.println("========================");
          c++;
      }
    }
    
    public static void VerificarVerba(){
        
    }
    
    
    }

