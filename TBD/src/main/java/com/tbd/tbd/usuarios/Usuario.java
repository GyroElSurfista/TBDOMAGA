/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbd.tbd.usuarios;

/**
 *
 * @author Jairo
 */
public class Usuario {
    private int idUsr;
    private int idSesion;
    
    public Usuario(){
        idUsr = -1;
        idSesion = - 1;
    }
    public Usuario (int idUsr, int idSesion){
        this.idUsr = idUsr;
        this.idSesion = idSesion;
    }

    public int getIdUsr() {
        return idUsr;
    }

    public void setIdUsr(int idUsr) {
        this.idUsr = idUsr;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }
    
    public boolean valido(){
        return idUsr >= 0 && idSesion >= 0;
    }
}
