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
@Table(name="genres")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class Genre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, name="idGenre")
	public Integer idGenre;
	
	@Column(name="genreName", nullable=false, unique=true)
	private String genreName;
	
	@Column(name="urlImage", nullable=false, unique=true)
	private String urlImage;
	
	@Column(name="idSerie", nullable=false)
	private Integer idSerie;
	
	@Column(name="idMovie", nullable=false)
	private Integer idMovie;

}
