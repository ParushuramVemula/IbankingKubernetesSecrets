package com.kspoc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {

	@Id
	@Column(name = "PERSON_ID")
	private int person_oid;

	@Column(name = "FIRST_NAME")
	private String first_name;

	@Column(name = "ACCOUNT_NUMBER")
	private int account_number;

	public int getPerson_oid() {
		return person_oid;
	}

	public void setPerson_oid(int person_oid) {
		this.person_oid = person_oid;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	@Override
	public String toString() {
		return "Person [person_oid=" + person_oid + ", first_name=" + first_name + ", account_number=" + account_number
				+ "]";
	}

}
