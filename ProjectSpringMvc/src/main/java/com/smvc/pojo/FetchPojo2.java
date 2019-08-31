package com.smvc.pojo;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table
public class FetchPojo2 {
	@Id
	private int id;

	private String name;
	
	private int prize;
	
	private int quantity;

	private byte[] image;
	
	private String base64;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Transient
	public String getBase64() {
		return this.base64=Base64.encode(this.image);
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}
	public FetchPojo2() {
		super();
	}

	@Override
	public String toString() {
		return "FetchPojo2 [id=" + id + ", name=" + name + ", prize=" + prize + ", quantity=" + quantity + ", image="
				+ Arrays.toString(image) + ", base64=" + base64 + "]";
	}
	
	
}
