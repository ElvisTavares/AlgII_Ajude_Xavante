/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salve_Xavante;

/**
 *
 * @author elvis
 */
public class Jogador {
    
    private String nome;
    private String cpf;
    private String posicao;
    private double valorCompra;
    
    
    public Jogador(){
        
    }
    
    public void Cadastrar(String nome, String cpf, String posicao, double valorCompra){
        setNome(nome);
        setCpf(cpf);
        setPosicao(posicao);
        setValorCompra(valorCompra);
    }
    
    public void setNome(String nome){
       this.nome = nome;
       
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
        
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    
    public String getPosicao(){
        return this.posicao;
    }
    
    public void setValorCompra(double valorCompra){
        this.valorCompra= valorCompra;
    }
    
    public double getValorCompra(){
        return this.valorCompra;
    }
    
}
