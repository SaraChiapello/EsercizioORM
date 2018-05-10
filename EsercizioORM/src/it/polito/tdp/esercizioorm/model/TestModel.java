package it.polito.tdp.esercizioorm.model;

public class TestModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m=new Model();
		int matricola=146101;
		int result=m.getTotCreditiFromStudente(matricola);
		System.out.println("somma crediti: "+result);
	
	}

}
