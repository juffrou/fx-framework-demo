package org.juffrou.fx.business.dom;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DiscoPerson implements PersistableDomain {

	private static final long serialVersionUID = -7969309518311916608L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String email;
	
	private LocalDate dateOfBirth;
	
	@ManyToOne(fetch= FetchType.LAZY)
	private AudioCd favoriteCd;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String toString() {
		return "name: " + name;
	}
	
	public AudioCd getFavoriteCd() {
		return favoriteCd;
	}
	public void setFavoriteCd(AudioCd favoriteCd) {
		this.favoriteCd = favoriteCd;
	}
	
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(obj == null || ! (obj instanceof DiscoPerson))
			return false;
		DiscoPerson audioCd = (DiscoPerson) obj;
		if(id != null)
			return id.equals(audioCd.getId());
		else
			return false;
	}

}