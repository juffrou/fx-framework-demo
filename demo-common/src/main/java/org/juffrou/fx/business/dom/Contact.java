package org.juffrou.fx.business.dom;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.juffrou.fx.serials.JFXSerializable;

@Entity
@Table(name="Contact")
public class Contact implements JFXSerializable {

	private static final long serialVersionUID = -1927971714182915038L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne(optional = true, fetch= FetchType.LAZY)
	@JoinColumn(name="person_id")
	private Person person;

	private String description;
	private String value;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Contact: " + description + "= " + value;
	}
}
