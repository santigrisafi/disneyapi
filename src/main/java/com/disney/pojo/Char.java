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
@Getter @Setter
@ToString @AllArgsConstructor
@NoArgsConstructor
@Table(name="chars")
public class Char {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idChar", unique=true, nullable=false)
	public Integer idChar;
	
	@Column(name="imageUrl", nullable=false)
	public String imageUrl;
	
	@Column(name="charName", nullable=false)
	public String charName;
	
	@Column(name="lastNameChar", nullable=false)
	public String lastNameChar;
	
	@Column(name="ageChar", nullable=false)
	public Integer ageChar;
	
	@Column(name="weightChar", nullable=false)
	public Double weightChar;
	
	@Column(name="heightChar", nullable=false)
	public Double heightChar;
	
	@Column(name="storyChar", nullable=false)
	public String storyChar;
	
	@Column(name="idSerie", nullable=false)
	public Integer idSerie;
	
	@Column(name="idMovie", nullable=false)
	public Integer idMovie;
}
