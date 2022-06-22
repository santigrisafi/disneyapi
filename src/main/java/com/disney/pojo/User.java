package com.disney.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="users")
@Getter @Setter @AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idUser", nullable=false, unique=true)
	public Integer idUser;

	@Column(name="username", unique=true, nullable=false)
	public String username;
	
	@Column(name="email", unique=true, nullable=false)
	public String email;
	
	@Column(name="password", nullable=false)
	public String password;
	
	@Column(name="status", nullable=false)
	public boolean status;
	
	@ManyToMany(mappedBy = "users")
	public List<Rol> roles;
}
