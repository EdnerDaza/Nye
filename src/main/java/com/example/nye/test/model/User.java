package com.example.nye.test.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Access(AccessType.FIELD)
public class User extends ParentEntity {

	private static final long serialVersionUID = 2311736245929808721L;
	
	@Column(name="name", nullable=false, length=255)
    private String name;
	@Column(name="email", nullable=false, length=50)
	private String email;
	@Column(name="phone", nullable=true, length=15)
	private String phone;
	@Column(name="mobile", nullable=true, length=15)
	private String mobile;
	@Column(name="position", nullable=false, length=50)
    private String position;
	@Column(name="image", nullable=true, length=255)
    private String image;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
