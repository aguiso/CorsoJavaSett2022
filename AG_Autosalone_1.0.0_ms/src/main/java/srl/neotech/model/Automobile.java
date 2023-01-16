package srl.neotech.model;

public class Automobile {
	
		private Integer id;
		private String descrizione;
		
		public Automobile() {
			
		}
		
		//Costruttore pubblico con tutti i parametri
		public Automobile (Integer id, String descrizione) {
			this.id=id;
			this.descrizione=descrizione;
		}
		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getDescrizione() {
			return descrizione;
		}
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		

}
