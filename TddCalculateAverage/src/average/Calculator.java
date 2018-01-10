package average;

import java.util.ArrayList;

public class Calculator {
	
	private ArrayList<Double> elements;
	
	public Calculator() {
		elements = new ArrayList<Double>();
	}
	
	public void addElement(double element) {
		elements.add(element);
	}
	
	public double average()  throws NoElementsException {
		double sum = 0;
		
		if(elements.size() == 0) {
			throw new NoElementsException();
		}
		
		for (Double element : elements) {
			sum += element;
		}
		
		return sum/elements.size();
	}
}
