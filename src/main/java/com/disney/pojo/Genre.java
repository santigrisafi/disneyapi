package com.disney.pojo;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

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
	
	@Column(name="nameGenre", nullable=false, unique=true)
	private String nameGenre;
	
	@Column(name="urlImage", nullable=false, unique=true)
	private String urlImage;

	@ManyToMany(mappedBy = "genres")
	private List<Productions> movies;
}
