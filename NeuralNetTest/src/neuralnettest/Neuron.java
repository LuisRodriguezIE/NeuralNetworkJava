/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnettest;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lr_29
 */
public class Neuron {
    
    private ArrayList<Double> listOfWeightIn;
    private ArrayList<Double> listOfWeightOut;
    
    // A pseudo random real number
    public double initNeuron(){
    		Random r = new Random();
		return r.nextDouble();
    }
    
    public ArrayList<Double> getListOfWeightIn() {
		return listOfWeightIn;
    }
    
    //Sets the listOfWeightIn function with a list of real numbers list
    public void setListOfWeightIn(ArrayList<Double> listOfWeightIn){
        this.listOfWeightIn = listOfWeightIn;
    }
    
    public ArrayList<Double> getListOfWeightOut() {
		return listOfWeightOut;
    }

    public void setListOfWeightOut(ArrayList<Double> listOfWeightOut) {
		this.listOfWeightOut = listOfWeightOut;
    }
    
}
