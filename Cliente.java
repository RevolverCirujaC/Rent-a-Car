/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ET36
 */
public class Cliente {

    private String nombre;
    private int dni;
    private int telefono;
    private int direccion;
    private int codigo;
    
    public Cliente(String n, int dni, int t, int d) {
        this.nombre = n;
        this.dni = dni;
        this.telefono = t;
        this.direccion = d;

        
    }
        
    public int Identificador(){
        this.codigo = (int)(Math.random()*(1000+100000));
        return this.codigo;
    }
}
