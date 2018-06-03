package com.synergy.recupro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Accounts extends AuditModel {
	
    @Id
    @GeneratedValue(generator = "accounts_generator")
    @SequenceGenerator(
            name = "accounts_generator",
            sequenceName = "accounts_sequence",
            initialValue = 1000
    )
    private Long id;
    @Column(columnDefinition = "text")
    private String account_name;
    @Column(columnDefinition = "text")
    private String account_type;
    @Column(columnDefinition = "text")
    private String account_address;
    @Column(columnDefinition = "text")
    private String account_phone;
    @Column(columnDefinition = "text")
    private String account_team;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return account_name;
	}
	public void setText(String text) {
		this.account_name = text;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getAccount_address() {
		return account_address;
	}
	public void setAccount_address(String account_address) {
		this.account_address = account_address;
	}
	public String getAccount_phone() {
		return account_phone;
	}
	public void setAccount_phone(String account_phone) {
		this.account_phone = account_phone;
	}
	public String getAccount_team() {
		return account_team;
	}
	public void setAccount_team(String account_team) {
		this.account_team = account_team;
	}

    

}
