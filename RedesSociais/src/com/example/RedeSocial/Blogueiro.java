/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.RedeSocial;

/**
 *
 * @author Aluno
 */
public class Blogueiro extends Influencer{
    public Blogueiro(String name, int seguidores){
        super(name, seguidores);
    }

    @Override
    public void postarConteudo() {
        System.out.println(name + "Fez um Post");
    }

    @Override
    public void interagir() {
        System.out.println(name + "Está respondendo aos comentários");
    }
    
    
}
