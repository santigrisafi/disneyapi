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
@AllArgsConstructor @NoArgsConstructor
@ToString
@Getter @Setter
public class Genre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, name="idGenre")
	public Integer idGenre;
	
	@Column(name="nameGenre", unique=true, nullable=false)
	public String nameGenre;
	
	@Column(name="urlImage", unique=true, nullable=false)
	public String urlImage;

	@ManyToMany(mappedBy = "genres")
	public List<Productions> productions;
}
