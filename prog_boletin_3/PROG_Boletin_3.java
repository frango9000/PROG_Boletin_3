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
public class PROG_Boletin_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consumo consumo1 = new Consumo();
        consumo1.setLitros(50f);
        consumo1.setPGas(1.57f);
        
        Consumo consumo2 = new Consumo(150f, 30f, 80f, 1.39f);
        System.out.println("Consumo medio: " + consumo2.getConsumoMedio());
        System.out.println("Litros consumidos: " + (consumo2.getLitros() * consumo2.getPGas()) );
        System.out.println("Velcidad media: " + consumo2.getVMed());
        
    }
    
}
