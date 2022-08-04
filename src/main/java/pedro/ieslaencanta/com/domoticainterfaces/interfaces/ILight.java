/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.ieslaencanta.com.domoticainterfaces.interfaces;

import pedro.ieslaencanta.com.domoticainterfaces.devices.annotations.AMethod;
import pedro.ieslaencanta.com.domoticainterfaces.devices.annotations.AParameter;
import pedro.ieslaencanta.com.domoticainterfaces.devices.annotations.FIELDS_ACCESS;

/**
 *
 * @author Mateo
 */
public interface ILight {

    @AMethod(direction = FIELDS_ACCESS.WRITE, return_type = @AParameter(name = "LigthState", type = AParameter.ParameterType.BOOLEAN))
    public void setON();
    @AMethod(direction = FIELDS_ACCESS.WRITE, return_type = @AParameter(name = "LigthState", type = AParameter.ParameterType.BOOLEAN))
    public void setOFF();
    @AMethod(direction = FIELDS_ACCESS.READ, return_type = @AParameter(name = "LigthState", type = AParameter.ParameterType.BOOLEAN))
    public boolean getLightState();

}
