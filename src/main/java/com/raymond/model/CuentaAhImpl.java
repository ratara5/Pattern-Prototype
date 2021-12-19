package com.raymond.model;

import com.raymond.inter.ICuenta;

public class CuentaAhImpl implements ICuenta {

    private String tipo;
    private double monto;

    public CuentaAhImpl(){
        tipo="AHORRO";
    }

    @Override
    public ICuenta clonar() {
        CuentaAhImpl cuenta=null;
        try{
            cuenta=(CuentaAhImpl) clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public String toString(){
        return "CuentaAHImpl: [tipo: "+ tipo+" - monto: "+monto+"]";
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
