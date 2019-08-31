package com.smvc.pojo;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import com.mysql.jdbc.Blob;
@Entity
@Table
public class PicturePojo 
{
	@Id
 private int id;
 private String pname;
 @Lob
 private byte[] image;
public PicturePojo() {
	super();
}

private String base64;

@Transient
public String getBase64() {
	return this.base64=Base64.encode(this.image);
}

public void setBase64(String base64) {
	this.base64 = base64;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public byte[] getImage() {
	return image;
}

public void setImage(byte[] image) {
	this.image = image;
}

@Override
public String toString() {
	return "PicturePojo [id=" + id + ", pname=" + pname + ", image=" + image + ", base64=" + base64 + "]";
}

 
}
