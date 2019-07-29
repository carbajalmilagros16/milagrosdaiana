/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo1;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class ItemStock {
    Computadora computadora;
    int cantidad;
Date ultimaFechaModificacion;

    public ItemStock(Computadora computadora, int cantidad) {
        this.computadora = computadora;
        this.cantidad = cantidad;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public int getCantidad() {
        return cantidad;
    }

}
