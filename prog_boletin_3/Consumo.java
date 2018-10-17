/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_3;

/**
 *
 * @author fsancheztemprano
 */
public class Consumo {
    private float km, litros, vMed, pGas;
    
    public Consumo (){
        
    }
    
    public Consumo (float k, float lt, float vM, float pG){
        km = k;
        litros = lt;
        vMed = vM;
        pGas = pG;
    }
    
    public float getTiempo(){
        float tiempo = km / vMed;
        return tiempo;
    }
    public float getConsumoMedio(){
        float consumoMedio = (litros / km)*100;
        return consumoMedio;
    }
    public float getConsumoEuros(){
        float consumoEuros = this.getConsumoMedio() * pGas;
        return consumoEuros;
    }
    public void setKms(float k){
        km = k;
    }
    public float getKms(){
        return km;
    }
    public void setLitros(float lt){
        litros = lt;
    }
    public float getLitros(){
        return litros;
    }
    public void setVMed(float vM){
        vMed = vM;
    }
    public float getVMed(){
        return vMed;
    }
    public void setPGas(float pG){
        pGas = pG;
    }
    public float getPGas(){
        return pGas;
    }
    
}
