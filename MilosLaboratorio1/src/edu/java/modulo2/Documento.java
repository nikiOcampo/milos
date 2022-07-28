package edu.java.modulo2;

public class Documento {
	private String tipoDoc;
	private int numDoc;
	
	
	public Documento() {
		super();
		
	}
	public Documento(String tipoDoc, int numDoc) {
		super();
		this.tipoDoc = tipoDoc;
		this.numDoc = numDoc;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public int getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(int numDoc) {
		this.numDoc = numDoc;
	}
	@Override
	public String toString() {
		return  "Documento [tipoDoc=" + tipoDoc + ", numDoc=" + numDoc + "]";
	}
	
	
	
}
