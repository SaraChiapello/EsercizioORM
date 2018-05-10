package it.polito.tdp.esercizioorm.model;

import java.util.HashMap;
import java.util.Map;

public class CorsoIdMap {
	private Map<String,Corso> map;
	
	public CorsoIdMap() {
		map=new HashMap<>();
	}
	
	public Corso get(Corso corso) { //passo tutto perchè se non c'è lo devo creare
		Corso old=map.get(corso.getCodIns());
		if(old==null) {
			map.put(corso.getCodIns(), corso);
			return corso;
		}
		return old;
	}
	
	public void put(String codIns,Corso corso) {
		map.put(codIns, corso);
	}

}
