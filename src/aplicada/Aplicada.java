/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicada;

import xFuzzyHH.hervirHuevo;

/**
 *
 * @author root
 */
public class Aplicada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        xFuzzyHH.hervirHuevo hv = new hervirHuevo();
        double[] in = new double[2];
        in[0]=2.0;
        in[1]=50.0;
        System.out.println(hv.crispInference(in)[0]);
    }
}
