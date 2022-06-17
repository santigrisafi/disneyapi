package com.disney.pojo;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter @Setter
@ToString @AllArgsConstructor
@NoArgsConstructor
@Table(name="characters")
public class Char {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idChar", unique = true, nullable = false)
	public Integer idChar;

	@Column(name = "imageUrl", nullable = false)
	public String imageUrl;

	@Column(name = "nameChar", nullable = false)
	public String nameChar;

	@Column(name = "ageChar", nullable = false)
	public Integer ageChar;

	@Column(name = "weightChar", nullable = false)
	public Double weightChar;

	@Column(name = "storyChar", nullable = false)
	public String storyChar;

	@ManyToMany()
	public List<Productions> productions;

}