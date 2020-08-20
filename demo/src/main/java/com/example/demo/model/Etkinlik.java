package com.example.demo.model;
/**import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;*/
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//BASE ENTİTY CLASS

@SuppressWarnings("serial")
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Table(name="Etkinlik")
public abstract class Etkinlik implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	private String baslik;
	

	private String konu; 
	
	private String icerik;
	
	private Date gTarih;
	

	
	public Etkinlik(int id, String baslik, String konu, String icerik, Date gTarih) {
		super();
		this.id = id;
		this.baslik = baslik;
		this.konu = konu;
		this.icerik = icerik;
		this.gTarih = gTarih;
	}

	public Etkinlik() {
	
	}
	
	@Column(name = "Id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Baslik", nullable = false)
	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	
	@Column(name = "konu", nullable = false)

	public String getKonu() {
		return konu;
	}

	public void setKonu(String konu) {
		this.konu = konu;
	}
	@Column(name = "icerik", nullable = false ,length = 65535)
	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}
	
	@Column(name = "gTarih", nullable = false)
	public Date getgTarih() {
		return gTarih;
	}

	public void setgTarih(Date gTarih) {
		this.gTarih = gTarih;
	}
	

	

	
	
	
}
