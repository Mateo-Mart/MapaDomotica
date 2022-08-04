/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.ieslaencanta.com.domoticainterfaces.devices;

import pedro.ieslaencanta.com.domoticainterfaces.interfaces.ILight;
import pedro.ieslaencanta.com.domoticainterfaces.devices.annotations.ADevice;

/**
 *
 * @author Mateo
 */
@ADevice(icon = "light")
public class Light extends Device implements ILight {

    boolean encendido;

    public Light(String description, String name, boolean encendido) {
        super(description, name);
        this.encendido = encendido;
    }

    @Override
    public void setON() {
        this.encendido = true;
    }

    @Override
    public void setOFF() {
        this.encendido = false;
    }
    @Override
    public boolean getLightState() {
        return this.encendido;
    }

}
