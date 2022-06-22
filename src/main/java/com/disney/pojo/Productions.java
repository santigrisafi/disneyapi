package com.disney.pojo;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="productions")
@ToString @Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Productions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idProduction", unique=true, nullable=false)
	private Integer idProduction;

	@Column(name="urlImage", nullable=false)
	private String urlImage;

	@Column(name="title", nullable=false)
	public String title;
	
	@Column(name="releaseDate", nullable=false)
	public String releaseDate;

	@Column(name="score", nullable=false)
	public Double score;

	@ManyToMany
	@JoinTable(
			name = "characters_productions",
			joinColumns = @JoinColumn(name = "id_production"),
			inverseJoinColumns = @JoinColumn(name = "id_char")
	)
	public List<Char> characters = new ArrayList<>();

	@ManyToMany
	@JoinTable(
			name = "genres_productions",
			joinColumns = @JoinColumn(name = "id_production"),
			inverseJoinColumns = @JoinColumn(name = "id_genre")
	)
	public List<Genre> genres;

}
