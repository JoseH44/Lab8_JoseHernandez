/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_josehernandezc;

import java.sql.Date;

/**
 *
 * @author jrdjh
 */
public class Mensaje {

    private String emisor;
    private String receptor;
    private Date fecha_envio;
    private String contenido;

    public Mensaje() {
    }

    public Mensaje(String emisor, String receptor, Date fecha_envio, String contenido) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha_envio = fecha_envio;
        this.contenido = contenido;
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

    public Date getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return fecha_envio + " " + contenido;
    }

}
