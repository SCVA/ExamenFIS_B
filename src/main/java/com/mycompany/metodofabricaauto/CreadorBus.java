package com.mycompany.metodofabricaauto;

/**
 *
 * @author Sebastian
 */
public class CreadorBus extends CreadorAuto{

    @Override
    protected Auto crearAuto() {
        return new Bus();
    }
    
}
