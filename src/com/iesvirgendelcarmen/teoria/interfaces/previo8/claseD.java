package com.iesvirgendelcarmen.teoria.interfaces.previo8;

public class claseD implements InterfazB, InterfazC{

	@Override
	public int doblar() {
		// TODO Auto-generated method stub
		return InterfazA.MI_CONSTANTE * 2;
	}

	@Override
	public int triplicar() {
		// TODO Auto-generated method stub
		return InterfazA.MI_CONSTANTE * 3;
	}
	@Override
	public  int cuadruplicar() {
		return InterfazA.MI_CONSTANTE * 4;
	}
	
	@Override
	public double mitad() {
		// TODO Auto-generated method stub
		return InterfazA.MI_CONSTANTE / 2.0;
	}
	

}
