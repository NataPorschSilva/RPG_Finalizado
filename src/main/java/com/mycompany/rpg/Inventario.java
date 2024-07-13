package com.mycompany.rpg;
import java.util.Scanner;
import java.util.Random;
import java.sql.DriverManager; // biblioteca 

/**
 * @author aluno
 */
public class Inventario extends Atributos {

    
    int resposta;
    protected boolean espada;
    protected boolean espadaInfernal;
    protected boolean capacete;
    protected boolean peitoral;
    protected boolean bota;
    protected boolean livro;
    protected boolean LivroSagrado;
    private int forcaBonus;
    private int inteligenciaBonus;
    

    //Mostra o inventário abaixo, o do personagem principal assim podendo desequipar e equipar
    void equiparGuerreiro() {

        int resposta = 0;

        while (resposta != 6) {

            Scanner teclado = new Scanner(System.in);

            System.out.println("Inventario:\n\n"
                    + (espada ? "(1) Espada 'EQUIPADO'" : "(1) Espada")
                    + (capacete ? "\n(2) Capacete 'EQUPADO'" : "\n(2) Capacete")
                    + (peitoral ? "\n(3) Peitoral 'EQUIPADO'" : "\n(3) Peitoral")
                    + (bota ? "\n(4) Bota 'EQUIPADO'" : "\n(4) Bota")
                    + (livro ? "\n(5) Livro 'EQUIPADO'" : "\n(5) Livro")
                    + "\n\n(6) Fechar inventario");

            System.out.printf("\nDigite aqui: ");

            resposta = teclado.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println((espada ? "Você desquipou a espada! '-40 FORÇA'\n" : "Você equipou a espada! '+40 FORÇA'"));
                    espada();
                    break;
                case 2:
                    System.out.println((capacete ? "Você desequipou o capacete '-10 VITALIDADE'\n" : "Você equipou o capacete '+10 VITALIDADE'"));
                    capacete();
                    break;
                case 3:
                    System.out.println((peitoral ? "Você desequipou o peitoral '-20 VITALIDADE'\n" : "Você equipou o peitoral '+20 VITALIDADE'"));
                    peitoral();
                    break;
                case 4:
                    System.out.println((bota ? "Você desequipou a bota '-10 VITALIDADE' '-15 STAMINA'\n" : "Você equipou a bota '+10 VITALIDADE' '+15 STAMINA'"));
                    bota();
                    break;
                case 5:
                    System.out.println((livro ? "Você desequipou O livro '-50 INTELIGÊNCIA'\n" : "Você equipou o livro '+50 INTELIGÊNCIA'"));
                    livro();

                    break;
                case 6:
                    System.out.println("Você fechou o inventário\n");
                    break;
                default:
                    System.out.println("Item não encontrado tente novamente!\n");
                    break;
            }
        }
    }
//------------------------------------------------------------------------------------------
    
    //ITENS DO INVENTÁRIO PRINCIPAL
    
    public void espada() {
        setForca((espada) ? (Forca = -40) : (Forca = +40));
        espada = !espada;
    }

    public void capacete() {
        setVitalidade((capacete) ? (vitalidade -= 30) : (vitalidade += 30));
        capacete = !capacete;
    }

    public void peitoral() {
        setVitalidade((peitoral) ? (vitalidade -= 40) : (vitalidade += 40));
        peitoral = !peitoral;
    }

    public void bota() {
        setVelocidade((bota) ? (Velocidade -= 20) : (Velocidade += 20));
        bota = !bota;
    }

    public void livro() {
        setInteligencia((livro) ? (inteligencia -= 50) : (inteligencia += 50));
        livro = !livro;
        
    }
    
    //------------------------------------------------------------------------------------------
    
    //ITENS DA ELFA    

    void espadaInfernal() {
        setForca((espadaInfernal) ? (Forca -= 550) : (Forca += 550));
        espadaInfernal = !espadaInfernal;
    }

    void LivroSagrado() {
        setInteligencia((LivroSagrado) ? (inteligencia -= 550) : (inteligencia += 550));
        LivroSagrado = !LivroSagrado;
    }
    
    //-----------------------------------------------------------------------------------------
    
    //MÉTODOS
    
    public void equipar(Inventario inv){
    inv.setForca(inv.getForca() + forcaBonus);
    inv.setInteligencia(inv.getInteligencia() + inteligenciaBonus);
    }

//---------------------------------------------------------------------------------------------
    
    // Elfa
    //fazer um sistema que ela tera dano mag e fis, e dependendo do item que voce roubar ela vai perder os atributos respectivos dos itens,
    //ela terá dois ataques um para cada tipo de dano e ela vai usá-los aleatóriamente; 

    void FadaEquip() {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("");

        System.out.println("""
                           Inventário de Miriel a Elfa:
                           
                           (1)EspadaInfernal
                           (2)LivroSagrado
                           (3)Fechar Inventário
                           
                           Tentar roubar ou quebrar qual item:(Beta)""");

        resposta = teclado.nextInt();

        //adiantar batalha com a fada
        switch (resposta) {
            case 1:
                String[] actions = {"roubou", "quebrou", "não conseguiu nd"};
                int randomEspada = random.nextInt(actions.length);
                String EscolherAcao = actions[randomEspada];
                System.out.println("Você " + EscolherAcao);
                break;

            case 2:
                String[] actions2 = {"roubou", "quebrou", "não conseguiu nd"};
                int randomLivro = random.nextInt(actions2.length);
                String EscolherAcao1 = actions2[randomLivro];
                System.out.println("Você " + EscolherAcao1);
            default:
                //vp.bornPerson();
                return;
        }

        /*System.out.println("Inventario Fada:\n\n"
                + (espadaInfernal ? "(1) Espada 'EQUIPADO'" : "(1) Espada")
                + "\n\n(6) Fechar inventario");
        
        if (resposta1){
            
        }
        
    
     switch (resposta1) {
            case 1:
                System.out.println((espadaInfernal ? "Você roubou a Espada Infernal! '-550 FORÇA'" : "Você equipou a espada! '+550 FORÇA'"));
                espadaInfernal();
                FadaEquip();
                break;
            case 2:
                System.out.println((espadaInfernal ? "Você não roubou a Espada Infernal! '-550 FORÇA'" : "Você equipou a espada! '+550 FORÇA'"));
                espadaInfernal();
                FadaEquip();
            default:
                
            }*/
    }
}

/**
 * Aqui vc escreve explicando oq o 'buff' vai fazer
 *
 * @param a koasndfakjsdnf
 */
// void buff(int a) {
//  Random RANDOM = new Random();

