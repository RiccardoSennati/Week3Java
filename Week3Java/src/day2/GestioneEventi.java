package day2;

import java.util.Date;

import day3.Evento;
import day3.TipoEvento;
import day3Dao.EventoDAO;

public class GestioneEventi {

	public static void main(String[] args) {
		
		Evento evento = saveEvento();
		


	}




	private static Evento saveEvento() {
		Evento ev = new Evento();
//		ev.setDataEvento(new Date());
//		ev.setTitolo("Partita");
//		ev.setDescrizione("Finale di coppa");
//		ev.setNumeroMassimoPartecipanti(10);
//		ev.setTipoEvento(TipoEvento.PUBBLICO);
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(ev);
		return ev;
	}

}
