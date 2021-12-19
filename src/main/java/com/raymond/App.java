package com.raymond;

import com.raymond.model.CuentaAhImpl;

public class App {

    public static void main(String[] args){
        CuentaAhImpl cuentaAhorro=new CuentaAhImpl();
        cuentaAhorro.setMonto(200);
        CuentaAhImpl cuentaClonada=(CuentaAhImpl) cuentaAhorro.clonar();


        if(cuentaClonada!=null){
            System.out.println(cuentaClonada);
        }

        System.out.println(cuentaClonada==cuentaAhorro);  //false: objeto de la misma clase, con iguales valores a los de la otra instancia, pero diferente a esa intancia
    }

}
