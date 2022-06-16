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
@Table(name="movies")
@ToString @Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idMovie", unique=true, nullable=false)
	private Integer idMovie;
	
	@Column(name="urlImage", nullable=false)
	private String urlImage;
	
	@Column(name="titleMovie", nullable=false)
	private String titleMovie;
	
	@Column(name="dateReleaseMovie", nullable=false)
	private String dateReleaseMovie;
	
	@Column(name="scoreUser", nullable=false)
	private Double scoreUser;
	
	@Column(name="idChar", nullable=false)
	private Integer idChar;

}
