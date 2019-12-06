/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_josehernandezc;

import java.util.Date;

/**
 *
 * @author jrdjh
 */
public class Llamada {

    private String emisor;
    private String receptor;
    private String duracion;
    private Date fecha_llamada;

    public Llamada() {
    }

    public Llamada(String emisor, String receptor, String duracion, Date fecha_llamada) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.duracion = duracion;
        this.fecha_llamada = fecha_llamada;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Date getFecha_llamada() {
        return fecha_llamada;
    }

    public void setFecha_llamada(Date fecha_llamada) {
        this.fecha_llamada = fecha_llamada;
    }

    @Override
    public String toString() {
        return "Llamada{" + "duracion=" + duracion + '}';
    }

}
