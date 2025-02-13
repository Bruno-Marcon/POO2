/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.RedeSocial;

public class Youtuber extends Influencer{
    public Youtuber(String name, int seguidores){
        super(name, seguidores);
    }

    @Override
    public void postarConteudo() {
        System.out.println(name + "Postou um video no Youtube");
    }

    @Override
    public void interagir() {
        System.out.println(name + "Está respondendo aos comentários");
    }
    
    
}
