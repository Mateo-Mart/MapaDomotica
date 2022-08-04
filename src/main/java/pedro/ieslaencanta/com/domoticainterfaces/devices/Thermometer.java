/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.ieslaencanta.com.domoticainterfaces.devices;

import pedro.ieslaencanta.com.domoticainterfaces.devices.annotations.ADevice;
import pedro.ieslaencanta.com.domoticainterfaces.devices.annotations.AParameter;
import pedro.ieslaencanta.com.domoticainterfaces.interfaces.IThermometer;

/**
 *
 * @author Mateo
 */
@ADevice(icon = "termostato")
public class Thermometer extends Device implements IThermometer {

    float temperatura;

    public Thermometer() {
        super(null, null);
        temperatura = 7f;
    }

    public Thermometer(String description, String name, float temperatura) {
        super(description, name);
        this.temperatura = temperatura;
    }

    @Override
    public float gettemperatura() {
        return this.temperatura;
    }

    @Override
    public void rolltemperatura() {
        this.temperatura=(float)(Math.random()*100);
    }

}
