package com.example.demo.model;
import java.util.Date;

import javax.persistence.Entity;


@SuppressWarnings("serial")
@Entity
public class Duyuru extends Etkinlik {
	
	public Duyuru(int id, String baslik, String konu, String icerik, Date gTarih,String dresim) {
		super(id, baslik, konu, icerik, gTarih);
	}
	public Duyuru() {
	}
	
	
	private String dresim;

	public String getDresim() {
		return dresim;
	}

	public void setDresim(String dresim) {
		this.dresim = dresim;
	}

}
