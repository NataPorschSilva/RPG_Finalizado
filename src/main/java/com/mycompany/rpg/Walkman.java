
package com.mycompany.rpg;

import java.util.Random;

/**
 * @author Natã
 */
public class Walkman extends VedaPerson {

    boolean resposta;
    //boolean resposta1;

    //iniciamos com apenas uma musica que pode dar atributos em especificos forca e hp em questao
    
    boolean Fortalecimento;
    boolean HPMAX;

   public void Upgrade() {

        Random random = new Random();

        boolean[] buffs = {resposta};
        int randomBuff = random.nextInt(buffs.length);
        boolean EscolherBuff = buffs[randomBuff];
        System.out.println("Você conseguiu: " + EscolherBuff);
    }
   
    protected boolean Fortalecimento() {
        /*Random random = new Random();
        
        boolean[] buffs = {resposta};
        int randomBuff = random.nextInt(buffs.length);
        boolean EscolherBuff = buffs[randomBuff];
        System.out.println("Você conseguiu: " + EscolherBuff);
        */
        if(Fortalecimento){
           setForca ( Forca += 100); 
        }
        return resposta;

    }
    protected boolean HPMAX() {
        if(HPMAX){
           setVitalidade ( vitalidade += 200); 
        }
        return resposta;
    }
        //setVitalidade((HPMAX) ? (vitalidade -= 200) : (vitalidade += 200));
        //HPMAX = !HPMAX;
}
