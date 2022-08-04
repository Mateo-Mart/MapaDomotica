/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.ieslaencanta.com.domoticainterfaces.devices;

import pedro.ieslaencanta.com.domoticainterfaces.interfaces.IDimmer;
import pedro.ieslaencanta.com.domoticainterfaces.devices.annotations.ADevice;

/**
 *
 * @author Mateo
 */
@ADevice(icon = "dimmer")
public class Dimmer extends Device implements IDimmer {

    int intensidad;

    public Dimmer(String description, String name, int i) {
        super(description, name);
        this.intensidad = i;
    }

    @Override
    public int getIntensityNumber() {

        return this.intensidad;
    }

    @Override
    public void changeIntensity(int i) {
        this.intensidad=i;
    }

    @Override
    public void raiseIntensity() {
        this.intensidad=this.intensidad+1;
    }

    @Override
    public void decreaseIntensity() {
        this.intensidad--;
    }
}
