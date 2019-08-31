package com.smvc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FetchPojo {
	

	@Id
	private int id;

	private String desktops;
	public FetchPojo() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesktops() {
		return desktops;
	}
	public void setDesktops(String desktops) {
		this.desktops = desktops;
	}
	@Override
	public String toString() {
		return "FetchPojo [id=" + id + ", desktops=" + desktops + "]";
	}
	
        
       
}