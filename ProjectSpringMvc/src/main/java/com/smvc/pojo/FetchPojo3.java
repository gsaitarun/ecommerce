package com.smvc.pojo;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

@Entity
@Table
public class FetchPojo3 
{
	    @Id
		private int id;

		private String name;
		
		
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

		public FetchPojo3() {
			super();
		}

		@Override
		public String toString() {
			return "FetchPojo3 [id=" + id + ", name=" + name + ", image=" + Arrays.toString(image) + ", base64="
					+ base64 + "]";
		}
		
	

}
