package com.disney.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="roles")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class Rol {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idRol", unique=true, nullable=false)
	private Integer idRol;
	
	@Column(name="rol", unique=true, nullable=false)
	private String rol;

}
