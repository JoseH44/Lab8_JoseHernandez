/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_josehernandezc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author jrdjh
 */
public class HiloLlamada extends Thread {

    private JLabel tiempo;
    private boolean vive;

    public HiloLlamada() {
    }

    public HiloLlamada(JLabel tiempo) {
        this.tiempo = tiempo;
        this.vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        while (vive) {
            Date h = new Date();

            DateFormat df = new SimpleDateFormat(":ss");
            tiempo.setText(df.format(h));

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
            }
        }
    }

}
