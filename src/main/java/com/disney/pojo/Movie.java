package com.disney.pojo;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

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

	@Column(name="releaseDate", nullable=false)
	private String dateReleaseMovie;

	@Column(name="score", nullable=false)
	private Double score;

	@Column(name="idChar", nullable=false)
	private Integer idChar;

	@ManyToMany()
	private List<Char> characters;

	@ManyToMany()
	private List<Genre> genres;

}
