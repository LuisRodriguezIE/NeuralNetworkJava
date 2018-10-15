/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnettest;

import java.util.ArrayList;

/**
 *
 * @author lr_29
 */
public class Layer {
    
    	private ArrayList<Neuron> listOfNeurons;
	private int numberOfNeuronsInLayer;
	
	public void printLayer(){
	}

	public ArrayList<Neuron> getListOfNeurons() {
		return listOfNeurons;
	}

	public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
		this.listOfNeurons = listOfNeurons;
	}

	public int getNumberOfNeuronsInLayer() {
		return numberOfNeuronsInLayer;
	}

	public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
		this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
	}  
}
