package com.mycompany.metodofabricaauto;

/**
 *
 * @author Sebastian
 */
public class CreadorCamioneta extends CreadorAuto{

    @Override
    protected Auto crearAuto() {
        return new Camioneta();
    }
    
}
