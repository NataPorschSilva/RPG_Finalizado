
package com.mycompany.rpg;

import java.util.Scanner;

/**
 * @author aluno
 */
public class FalsePerson {

    void fallperson() {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("______________________________________");
        System.out.println("Void: Você deseja mesmo continuar?\n\n"
                + "a)sim\n"
                + "b)não\n");
        System.out.printf("Você:");String f = teclado.next().toLowerCase();
        System.out.println("______________________________________");
        
        System.out.println("Void: Qual sua altura.....\n\n"
                + "a)Alto\n"
                + "b)Médio\n"
                + "c)Baixo\n");
        System.out.printf("Você:");String z = teclado.next().toLowerCase();
        System.out.println("______________________________________");

        System.out.println("Void: Qual estilo de roupa....\n\n"
                + "a)Elegante\n"
                + "b)Casual\n"
                + "c)Criativo\n"
                + "d)Dramático\n"
                + "e)Romântico\n"
                + "f)Sexy\n");
        System.out.printf("Você:");String b = teclado.next().toLowerCase();
        System.out.println("______________________________________");

        System.out.println("Void: Qual seu tipo de sangue preferido.....\n\n"
                + "a)ABO\n"
                + "b)A\n"
                + "c)B\n"
                + "d)AB\n"
                + "e)O\n");
        System.out.printf("Você:");String c = teclado.next().toLowerCase();
        System.out.println("______________________________________");

        System.out.println("Void: Qual seu sabor preferido....\n\n"
                + "a)Doce\n"
                + "b)Azedo\n"
                + "c)Salgado\n"
                + "d)Amargo\n"
                + "e)Medo\n");
        System.out.printf("Você:");String d = teclado.next().toLowerCase();
        System.out.println("______________________________________");

        System.out.println("Void: Dê um nome para a criação:\n");
        System.out.printf("Você:");String h = teclado.next().toLowerCase();
        System.out.println("______________________________________");

        System.out.println("Void: Qual nome de seu criador:\n");
        System.out.printf("Você:");String g = teclado.next().toLowerCase();
        System.out.println("______________________________________");        

        System.out.println("Void: Obrigado...");
        System.out.println("      Pelo seu tempo...");
        b = teclado.nextLine();
        System.out.println("      Sua criação...");
        System.out.println("      Sua bela criação agr...>>>");
        b = teclado.nextLine();
        System.out.println("Void: Será descartada.\n      Você nunca teve dominancia alguma aqui.\n      Ninguém pode escolher o que quer ser nesse mundo.");
        System.out.println("      Seu nome é...>>>\n");
        System.out.println("______________________________________\n");
    }
}


