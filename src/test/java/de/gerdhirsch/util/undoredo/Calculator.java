package de.gerdhirsch.util.undoredo;

public class Calculator {
	int result;
	void plus(int summand){
		result += summand;
	}
	void minus(int subtrahend){
		result -= subtrahend;
	}
	public void clear() {
		result = 0;
	}
	public int getResult() {
		return result;
	}
	
}
