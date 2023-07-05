
import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ET36
 */
public class Renta {

   private ArrayList lista = new ArrayList();
   Cliente cliente;
   private LocalDate fechaInicio;
   private LocalDate fechaFin;
   private int cantDias;

    public Renta(Cliente c, LocalDate fi, LocalDate ff, int cantDias) {
        this.cliente = c;
        this.fechaInicio = fi;
        this.fechaFin = ff;
        this.cantDias = cantDias;
    }
   
    
}
