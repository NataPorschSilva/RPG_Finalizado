package com.mycompany.rpg;
//import static com.mycompany.rpg.VedaPerson.inspecionar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.tools.StandardLocation;

/**
 * @author Natã
 * <p>
 * <p>
 * Walkman é usado para escutar musicas e dependedo da musica que tocar Aurora recebe algum buff em especifíco (walkman vindo de seu mundo passado e que aparentement   e ela não se recorda de nada)
 */
public class VedaPerson extends Inventario {

    private Inventario inv;
    Scanner resposta = new Scanner(System.in);
    Final p1;
    
    public VedaPerson() {
        this.p1 = new Final("Aurora", vitalidade, Forca, vitalidadeELFA);
        }
    
    void xPerson() {
        System.out.println("Miriel: AURORA! Acorda!...Você está bem?\n");
        System.out.printf("Você: ");
        String a = resposta.next().toLowerCase();
        
        if (a.equals("sim")) {
            System.out.println("\nMiriel: que bom");

        } else if (a.equals("não") || a.equals("nao")) {
            System.out.println("\nMiriel: que merda");

        } else {
            System.out.println("\nMiriel: a vai tomar no cu");
        }
    }

    //Começo das escolhas e história
    //O livro equipado lhe da informações que pessoas normais n tem 
    
    void bornPerson() {

        
        String b = "";
        while (!b.equals("e")) {

            System.out.println("""
                                               
                    Miriel: Pode equipar o Livro na mochila?"
                                               
                    a) Entrar no inventario
                    b) Usar walkman (beta)
                    c) Atributos
                    d) Inventário da Elfa
                    e) *equipei!*""");
            System.out.println("");
            System.out.printf("Você: ");
            b = resposta.next().toLowerCase();

            switch (b) {
                case "a":
                    equiparGuerreiro();
                    break;
                case "b":
                    
                    break;
                case "c":
                    System.out.println("Forca: " + Forca);
                    System.out.println("Velocidade: " + Velocidade);
                    System.out.println("Inteligencia: " + inteligencia);
                    System.out.println("Mana: " + Mana);
                    System.out.println("Vitalidade: " + vitalidade);
                    System.out.println("Dinheiro: " + dinheiro);
                    bornPerson();
                case "d":
                    FadaEquip();
                case "e":
                    pressagio();
            }
        }
    }

    public void pressagio() {

        System.out.println("\nMiriel: Ufa então o que fiz n foi inútil...");
        System.out.println("        Por acaso se sente...'normal?'\n");
        System.out.printf("Você: ");
        String c;
        c = resposta.next().toLowerCase();

        if (c.equals("sim")) {
            System.out.println("\nMiriel: Wow incrível...\n");

        } else if (c.equals("não") || c.equals("nao")) {
            System.out.println("\nMiriel: Como esperado...\n");

        } else {
            System.out.println("\nMiriel: cuidado com suas palavras...\n");

        }
        System.out.println("Miriel: O v0?d_ realmente é assustador...");
        System.out.println("        Que bom que está tudo bem agora com você\n"
                + "        Isso me lembra quando eramos crianças, você adorava livros...\n"
                + "        Sempre amei estar com você,\n"
                + "        você era a única que me entendia não é de se duvidar o porque era a próxima rainha ao trono...\n\n"
                + "Miriel: Por acaso lembra dessa memórias lindas?");
        System.out.printf("\nVocê: ");
        c = resposta.next().toLowerCase();

        if (c.equals("sim")) {
            System.out.println("\nMiriel: Você sempre foi uma mentirosa mesmo ahah...ahahaHAAHAHAHHAHAHAHAHAHAHA");
            antBatalha();
        } else if (c.equals("não") || c.equals("nao")) {
            System.out.println("\nMiriel: Muito bem meu bichinho é isso mesmo que eu esperava...hahahHAHAHAHHAHAHAHHAHAH");
            antBatalha();
        } else {
            System.out.println("\nMiriel: É interessante saber isso meu verme favorito você sempre esteve na minha mão...hahaHAHAHAHAHAHAAHAHAHAH");
            antBatalha();
        }
    }

    public void antBatalha() {

        System.out.println("Miriel: Aiai é tão engraçado, você não tem ideia do passado ao até mesmo do que é não é mesmo?");
        System.out.println("        Esse livro nunca foi qualquer objeto mágico, ele é uma benção porém uma maldição para você, maldito.");
        System.out.println("        Com ele você pode até ver meus itens e poderes não é mesmo?\n");
        System.out.println("        Aliás aqui sou eu quem decide o seu hp. >>>");
        batalha();
    }

    // colocar os poderes da elfa no msql e puxar as informacoes dos dois ataques dela quanto 'investigar' as habilidades dela
    public void batalha() {
        
        String c = "";
        while (!c.equals("e")) {

            System.out.println("""
                                               
                    Miriel: Vá em frente e faça o teste.
                                               
                    a) Inspecionar
                    b) Usar walkman (beta)
                    c) Atributos da Elfa
                    d) Inventário da Elfa
                    e) *vamos iníciar isso logo*""");
            System.out.println("");
            System.out.printf("Você: ");
            c = resposta.next().toLowerCase();

            switch (c) {
                case "a":
                {
                    try {
                        inspecionar();
                    } catch (SQLException ex) {
                        Logger.getLogger(VedaPerson.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    batalha();
                case "b":
                    //Upgrade();
                case "c":
                    System.out.println("Forca: " + ForcaELFA);
                    System.out.println("Velocidade: " + VelocidadeELFA);
                    System.out.println("Inteligencia: " + inteligenciaELFA);
                    System.out.println("Mana: " + ManaELFA);
                    System.out.println("Vitalidade: " + vitalidadeELFA);
                    System.out.println("Dinheiro: " + dinheiroELFA);
                    batalha();
                case "d":
                    FadaEquip();
                case "e":
                    fight();
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         
    }
    int ataqueUsuario() {  //Menu de Ações durante a luta.
    Scanner leitor = new Scanner(System.in);
    System.out.println("Escolha sua ação:");
    System.out.println("(1) - Soco");
    System.out.println("(2) - Especial\n====================");
    return leitor.nextInt();
    }
    
    int ataqueComputador() { //Gerar um número aleatório de 1 a 10, usado para escolhas aleatórias de golpes.
    Random gerador = new Random();
    return gerador.nextInt(10) + 1;
    }
    
    void imprimeHP(String nome, int vida, int hpComputador) {
    System.out.println("\n====================");
    System.out.println("- HP Aurora: " + p1.vitalidade);
    System.out.println("- HP Miriel: " + p1.vitalidadeELFA);
    System.out.println("====================");
    }
    
    public int fight() {
    System.out.println("\n----LUTA-INICIADA----");
    Scanner STRING = new Scanner(System.in);
    String enter;
    int escolhaAtaque;
    int mudarNumero;
    int mudarNumero2;
    
    Random gerador = new Random();
    while (p1.vitalidade >= 0) {
    p1.getVitalidadeELFA();
    //System.out.println("\nXXXX  INICIO DA LUTA  XXXX");
        
    while (p1.vitalidade > 0 && p1.vitalidadeELFA > 0) {
        imprimeHP("Aurora", p1.vitalidade, p1.vitalidadeELFA);
        escolhaAtaque = ataqueUsuario();
    
    //////////////////////////ATAQUES DE AURORA//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    switch (escolhaAtaque) {
    case 1 -> {
        mudarNumero = gerador.nextInt((10 - 6) + 1) + 6; // Escolhe um número de 6 a 10
        System.out.println("\nVOCÊ aplicou um soco.\n-" + (mudarNumero + p1.Forca) + " HP para o Miriel.");
        p1.vitalidadeELFA -= mudarNumero + (p1.Forca);
    }
    case 2 -> {
        System.out.println("...Aurora recusa usar 'Especial'...");
    }
    default ->
        System.out.println("Opcao invalida");
    }
    if (p1.vitalidadeELFA >= 0) {
        escolhaAtaque = ataqueComputador(); //"ataqueComputador usa Random no intervalo 1-10 "
    
    ///////////////////////////ATAQUES DE MIRIEL/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    switch (escolhaAtaque) {
    
    case 1, 2, 9: // para a chance ser de 30%
    mudarNumero = gerador.nextInt((3 - 1) + 1) + 1; // Escolhe um número de 1 a 3
    System.out.println("\nMiriel acertou um 'Corte Dimencional' em você.\n-" + mudarNumero + " HP para Aurora");
    p1.vitalidade -= mudarNumero; //+ (int)(i / 10)
    break;
    
    case 3, 4, 5: //30%
    mudarNumero = gerador.nextInt((6 - 4) + 1) + 4; // Escolhe um número de 4 a 6
    System.out.println("\nMiriel acertou um 'Corte Frontal' em você.\n-" + mudarNumero + " HP para Aurora");
    p1.vitalidade -= mudarNumero; //+ (int)(i / 10)
    break;
    
    case 6: //10%
    mudarNumero = gerador.nextInt((10 - 7) + 1) + 7; // Escolhe um número de 7 a 10
    System.out.println("\nMiriel usa 'Efêmero' e se cura.\n+" + mudarNumero + " HP para Miriel.");
    p1.vitalidadeELFA += mudarNumero; //+ (int) (i / 10)
    break;
    
    case 7, 8: // 2 possíveis números, para uma chance de 20%
    mudarNumero = gerador.nextInt((8 - 7) + 1) + 7; // Escolhe 7 ou 8
    System.out.println("\nMiriel usa 'Espelho de yata' em você.\n-" + mudarNumero + " HP para Aurora");
    p1.vitalidade -= mudarNumero; //+ (int)(i / 10);
    break;
    
    case 10: // 10%
    
    mudarNumero = gerador.nextInt((16 - 10) + 1) + 10; // Escolhe um número de 10 a 16
    mudarNumero2 = gerador.nextInt((8 - 5) + 1) + 5; // Escolhe um número de 5 a 8
    System.out.println("\nMiriel suga sua vida, e lança uma energia escura e devastadora em você."
    + "\n+" + mudarNumero + " HP para a Miriel.\n-" + mudarNumero2 + " HP para Aurora\n");
    p1.vitalidadeELFA += mudarNumero; //+ (int)(i / 20);
    p1.vitalidade -= mudarNumero2; //+ (int)(i / 20);
    break;
    } 
    } 
    }
    if (p1.vitalidade <= 0) {
    System.out.println("\nVocê foi derrotado por Miriel. >>>");
    enter = STRING.nextLine();
    encerramentoMal();
    
    }else if(p1.vitalidadeELFA <= 0){
    System.out.println("\nInimigo derrotado. >>>");
    enter = STRING.nextLine();
    encerramentoBom();
    break;
    }
    }
    
    return 0;
    }
     //fecha o Int Batalha = Toda a luta
    
    public void encerramentoBom(){
        
        Scanner STRING = new Scanner(System.in);
        String Fn;
        
        System.out.println("...>>>\n");
        
        System.out.println("Miriel: Eu espero que lá no fundo... >>>\n");
        Fn = STRING.nextLine();
        System.out.println("Miriel: A verdadeira Aurora ainda esteja ai... >>>\n");
        Fn = STRING.nextLine();
        System.out.println("Miriel: Maldito jogador ela nunca mereceu esse destino sendo seu receptáculo. >>>\n");
        Fn = STRING.nextLine();
        System.out.println("Miriel: Morra e não volte mais. >>>\n");
        Fn = STRING.nextLine();
        System.out.println("...>>>\n");
        Fn = STRING.nextLine();
        System.out.println("Aurora: Me...desculpe...Miriel>>>\n");
        Fn = STRING.nextLine();
        ExitGame();
    }
    public void encerramentoMal(){
        
        Scanner STRING = new Scanner(System.in);
        String Fn;
        
        System.out.println("...>>>\n");
        
        System.out.println("Miriel: No fim...nem com o v0?d você foi capaz de tomar o corpo de minha amiga. >>>\n");
        Fn = STRING.nextLine();
        System.out.println("Miriel: Maldito jogador ela nunca mereceu esse destino sendo seu receptáculo. >>>\n");
        Fn = STRING.nextLine();
        System.out.println("Miriel: Morra e liberte Aurora seguidor do v0?d!. >>>\n");
        Fn = STRING.nextLine();
        ExitGame();
    }
        
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void inspecionar() throws SQLException { //criar classe poderes Poderes poderes
        try (Connection conn = Conexao.getConexao()) {
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM poderes");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Tipo: " + rs.getString("tipo"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Dano: : " + rs.getInt("dano"));
                System.out.println("-----------------------------");
            }
        }
    }

    public void setInventario(Inventario inv) {

        this.inv = inv;
    }

    public VedaPerson getVedaPerson() {
        return this;
    }

    void ExitGame() {
    Scanner STRING = new Scanner(System.in);
    String enter;
    System.out.print("\nObrigado por jogar! Como o jogo ainda está em desenvolvimento\n"
    + "Eu conto com a sua paciência, caso algo tenha dado errado.");

    }
       
}