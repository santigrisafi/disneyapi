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
@Table(name="series")
@Getter @Setter @AllArgsConstructor
@NoArgsConstructor @ToString
public class Serie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idSerie", unique=true, nullable=false)
	private Integer idSerie;
	
	@Column(name="imageUrl", nullable=false)
	private String imageUrl;
	
	@Column(name="titleSerie", nullable=false)
	private String titleSerie;
	
	@Column(name="dateReleaseSerie", nullable=false)
	private String dateReleaseSerie;
	
	@Column(name="scoreUser", nullable=false)
	private Double scoreUser;
	
	@Column(name="idChar", nullable=false)
	private Integer idChar;

}
