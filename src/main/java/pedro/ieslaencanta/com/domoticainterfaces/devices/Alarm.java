/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.ieslaencanta.com.domoticainterfaces.devices;

import pedro.ieslaencanta.com.domoticainterfaces.devices.annotations.ADevice;
import pedro.ieslaencanta.com.domoticainterfaces.interfaces.ILight;
import pedro.ieslaencanta.com.domoticainterfaces.interfaces.IThermometer;

/**
 *
 * @author Mateo
 */
@ADevice(icon="alarm")
public class Alarm extends Device implements ILight, IThermometer {

    boolean activada;
    float temperatura;

    public Alarm(String description, String name, boolean b, float i) {
        super(description, name);
        this.activada = b;
        this.temperatura = i;
    }

    @Override
    public void setON() {
        this.activada = true;
    }

    @Override
    public void setOFF() {
        this.activada = false;
    }

    @Override
    public boolean getLightState() {
        return this.activada;
    }

    @Override
    public float gettemperatura() {
        return this.temperatura;
    }

    @Override
    public void rolltemperatura() {
        this.temperatura+=(float)(Math.random()*15);
        if (this.temperatura>=100){
            this.temperatura=0;
        }
    }
    public void comprobaralarma(){
        if (this.temperatura>40){
            this.setON();
        }
    }
}
