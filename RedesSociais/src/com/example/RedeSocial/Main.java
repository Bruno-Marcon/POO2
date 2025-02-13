/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.RedeSocial;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        List<Influencer> influencers = new ArrayList<>();
        
       Influencer youtuber = new Youtuber("Bruno", 1100000);
       Influencer streamer = new Streamer("Gordo", 1100000);
       Influencer blogueiro = new Blogueiro("Pergo", 1100000);
       
       influencers.add(youtuber);
       influencers.add(streamer);
       influencers.add(blogueiro);
       
       for (Influencer influencer : influencers){
           influencer.exibirInfo();
           influencer.postarConteudo();
           influencer.interagir();
       }
    }
}
