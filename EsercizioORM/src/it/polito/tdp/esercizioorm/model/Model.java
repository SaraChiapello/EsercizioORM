package it.polito.tdp.esercizioorm.model;

import java.util.List;

import it.polito.tdp.esercizioorm.dao.CorsoDAO;
import it.polito.tdp.esercizioorm.dao.StudenteDAO;

public class Model {
	
	private CorsoDAO CDAO;
	private StudenteDAO SDAO;
	
	private List<Corso> corsi;
	private List<Studente> studenti;
	private CorsoIdMap corsomap;
	
	public Model(){
		CDAO=new CorsoDAO();
		SDAO=new StudenteDAO();
		
		corsomap=new CorsoIdMap();
		corsi=CDAO.getTuttiCorsi(corsomap);
		System.out.println(corsi.size());
		studenti=SDAO.getTuttiStudenti();
		System.out.println(studenti.size());
		for(Studente s: studenti)
			CDAO.getCorsiFromStudente(s,corsomap);
	}

	public int getTotCreditiFromStudente(int matricola) {
		int sum=0;
		for(Studente s: studenti) {
			if(s.getMatricola()==matricola) {
				for(Corso c:s.getCorsi()) {
					sum+=c.getCrediti();
				}
				return sum;
				
			}
			
		}
			
		return -1;
	}

}
