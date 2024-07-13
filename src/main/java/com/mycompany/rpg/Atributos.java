package com.mycompany.rpg;
import java.sql.DriverManager; // biblioteca 
import java.util.Random;

/**
 *
 * @author Natã //mortos vivos ja estão mortos, faça algum metodo para acabar com eles de forma diferente.
 */
public class Atributos {
    
    
    
//--------------------------ATRIBUTOS-DO-PERSONAGEM-PRINCIPAL--------------------------------------
    
    public int Forca;
    protected int Velocidade;
    protected int Mana;
    protected int dinheiro;
    protected int vitalidade;
    protected int inteligencia;
    protected boolean estaVivo;

    public int getForca() {
        return Forca;
    }

    public void setForca(int Forca) {
        this.Forca = Forca;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int Velocidade) {
        this.Velocidade = Velocidade;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int Mana) {
        this.Mana = Mana;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public boolean isVivoELFA() {
        return vivoELFA;
    }

    public void setVivoELFA(boolean vivoELFA) {
        this.vivoELFA = vivoELFA;
    }
   

    
 
//-------------------------ATRIBUTOS-DA-ELFA-----------------------------------------------
    
    public int ForcaELFA = 200;
    protected int VelocidadeELFA = 100;
    protected int ManaELFA = 100;
    protected int dinheiroELFA = 1500;
    protected int vitalidadeELFA = 500;
    protected int inteligenciaELFA = 200;
    public boolean vivoELFA;

    public int getForcaELFA() {
        return Forca;
    }

    public void setForcaELFA(int Forca) {
        this.Forca = Forca;
    }

    public int getVelocidadeELFA() {
        return Velocidade;
    }

    public void setVelocidadeELFA(int Velocidade) {
        this.Velocidade = Velocidade;
    }

    public int getManaELFA() {
        return Mana;
    }

    public void setManaELFA(int Mana) {
        this.Mana = Mana;
    }

    public int getDinheiroELFA() {
        return dinheiro;
    }

    public void setDinheiroELFA(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getVitalidadeELFA() {
        return vitalidade;
    }

    public void setVitalidadeELFA(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getInteligenciaELFA() {
        return inteligencia;
    }

    public void setInteligenciaELFA(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    
    //--------------------------BATALHA-------------------------------------------------------------
    
    protected String nome;
    private int pontosDeVida;
    private int ataque;
    private int defesa;
    
    public void Personagem(String nome, int pontosDeVida, int ataque, int defesa) {
    this.nome = nome;
    this.pontosDeVida = pontosDeVida;
    this.ataque = ataque;
    this.defesa = defesa;
    }
    
    public String getNome() {
    return nome;
    }
    
    public int getPontosDeVida() {
    return pontosDeVida;
    }
    
    public void setPontosDeVida(int pontosDeVida) {
    this.pontosDeVida = pontosDeVida;
    }
    
    public int getAtaque() {
    return ataque;
    }
    
    public int getDefesa() {
    return defesa;
    }
    
    public void receberDano(int dano) {
    pontosDeVida -= dano;
    if (pontosDeVida < 0) {
    pontosDeVida = 0;
    }
    }
    
    public boolean estaVivo() {
    return pontosDeVida > 0;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    // Outros atributos comuns
    
    public abstract class Personagem {

    public String nome;
    protected int vida;
    protected int forca;
    protected int magia;
    
    protected int mudarVida;
    protected int mudarForca;
    protected int mudarMagia;
    
    protected int hpComputador;
    
    //Constructor
    
    public Personagem(String nome, int vida, int forca, int furia, int hpComputador) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        
        this.hpComputador = hpComputador;
    }

    // Getters e Setters
    //NOME DO PERSONAGEM
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    ////////////////////////////////////////////////
    //VIDA DO PERSONAGEM
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    ///////////////////////////////////////////////
    //FORÇA DO PERSONAGEM
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    //////////////////////////////////////////////
    //MAGIA DO PERSONAGEM
    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    /////////////////////////////////////////////
    //VIDA DO MACACO
    public int getHpComputador() {
        return hpComputador;
    }

    public void setHpComputador(int hpComputador) {
        this.hpComputador = hpComputador;
    }
    ///////////////////////////////////////////////
    /////////// AUMENTAR/DIMINUIR ATRIBUTOS ////////////////
    //DIMINUIR VIDA
    public void diminuirVidaLVL0() {
        Random RANDOM = new Random();
        mudarVida = RANDOM.nextInt((5 - 2) + 1) + 2;
        this.vida = vida - mudarVida;
    }

    public void diminuirVidaLVL1() {
        Random RANDOM = new Random();
        mudarVida = RANDOM.nextInt((15 - 6) + 1) + 6;
        this.vida = vida - mudarVida;
    }

    //AUMENTAR VIDA
    public void aumentarVidaLVL0() {
        Random RANDOM = new Random();
        mudarVida = RANDOM.nextInt((6 - 2) + 1) + 2;
        this.vida += vida + mudarVida;
    }

    public void aumentarVidaLVL1() {
        Random RANDOM = new Random();
        mudarVida = RANDOM.nextInt((15 - 7) + 1) + 7;
        this.vida = vida + mudarVida;
    }

    //////////////////////////////////////////////
    //DIMINUIR FORÇA
    public void diminuirForcaLVL1() {
        Random RANDOM = new Random();
        mudarForca = RANDOM.nextInt((3 - 1) + 1) + 1;
        this.forca = forca - mudarForca;
    }

    //AUMENTAR FORÇA
    public void aumentarForcaLVL1() {
        Random RANDOM = new Random();
        mudarForca = RANDOM.nextInt((3 - 1) + 1) + 1;
        this.forca = forca + mudarForca;
    }

    ////////////////////////////////////////////////
    //AUMENTAR MAGIA
    protected void ADDMagiaNIVEL1() {
        magia += 1;
    }

    protected void ADDMagiaNIVEL2() {
        magia += 2;
    }

    protected void ADDMagiaNIVEL3() {
        magia += 5;
    }

    ////////////////////////////////////////////////
    //##  STATUS  ##//
    protected void StatusGeralP1() {
        System.out.println("Vida Atual: " + vida);//vida += 0;
        System.out.println("Força Atual: " + forca);//forca += 0;
        System.out.println("Magia Atual: " + magia);//magia += 0; 
        
    }
}
    }

