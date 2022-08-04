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
public interface IDimmer {
    
    
    @AMethod(direction = FIELDS_ACCESS.READ, return_type = @AParameter(name = "DimmerIntensityState", type = AParameter.ParameterType.VOID))
    public int getIntensityNumber();
    @AMethod(direction = FIELDS_ACCESS.WRITE, parameters = @AParameter(name="DimmerIntensityState", type = AParameter.ParameterType.INT))
    public void changeIntensity(int i);
    @AMethod(direction = FIELDS_ACCESS.WRITE, return_type = @AParameter(name="DimmerIntensityState", type = AParameter.ParameterType.INT))
    public void raiseIntensity();
    @AMethod(direction = FIELDS_ACCESS.WRITE, return_type = @AParameter(name="DimmerIntensityState", type = AParameter.ParameterType.INT))
    public void decreaseIntensity();

}
