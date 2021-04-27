/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safikri;

import java.util.Scanner;

/**
 *
 * @author sarka
 */
public class UIApp {
    public static ElevenGame gameA = new ElevenGame();
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.format("Welcome to %s%n",gameA.getName());
        System.out.println("");//menu start (1) pravidla(2)
        
        int answ=sc.nextInt();
        if(answ==1){
            play();
        }else if(answ==2){
            showRules();
        }
        //pozdrav
        //chces zobrazit pravidla/start
        //start
        //vylozit balik (print)
        
        //+hratelne+pocet karet
        //nahrat odpovedi 
        //print -> lze odebrat -> vymenit karty +hratelne+pocet karet
        //      -> nelze odebrat -> print nelze
        
        // balik je prazdny -> prohral jsi, konecny pocet karet v baliku
        
        
    }
    public static void play(){
       
 
    }
    public static void showRules(){
        
    }
}
