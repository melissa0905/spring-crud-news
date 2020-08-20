package com.example.demo.model;
import java.util.Date;

import javax.persistence.Entity;


@SuppressWarnings("serial")
@Entity
public class Haber extends Etkinlik {
	public Haber(int id, String baslik, String konu, String icerik, Date gTarih,String link,String detay) {
		super(id, baslik, konu, icerik, gTarih);
		// TODO Auto-generated constructor stub
	}
	public Haber() {
	
	}
	
	private String detay;
	private String link;

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	public String getDetay() {
		return detay;
	}
	public void setDetay(String detay) {
		this.detay = detay;
	}
	
}
