package com.synergy.recupro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "requirements")
public class Requirements extends AuditModel {
	
    @Id
    @GeneratedValue(generator = "req_generator")
    @SequenceGenerator(
            name = "req_generator",
            sequenceName = "req_sequence",
            initialValue = 1000
    )
    private Long id;
    @Column(columnDefinition = "text")
    private String req_title;
    @Column(columnDefinition = "text")
    private String req_description;
    @Column(columnDefinition = "text")
    private String rate;
    @Column(columnDefinition = "text")
    private String req_type;
    @Column(columnDefinition = "text")
    private String secondary_skills;
    @Column(columnDefinition = "text")
    private String seniority_level;
    @Column(columnDefinition = "text")
    private String pay_rate;
    @Column(columnDefinition = "text")
    private String candidate_availability;
    @Column(columnDefinition = "text")
    private String exp_required;
    @Column(columnDefinition = "text")
    private String recruiter_name;
    @Column(columnDefinition = "text")
    private String account_manager;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Accounts accounts;
	public Accounts getAccounts() {
		return accounts;
	}
	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return req_title;
	}
	public void setText(String text) {
		this.req_title = text;
	}
	public String getAccount_name() {
		return req_title;
	}
	public void setAccount_name(String account_name) {
		this.req_title = account_name;
	}
	public String getAccount_type() {
		return req_description;
	}
	public void setAccount_type(String account_type) {
		this.req_description = account_type;
	}
	public String getAccount_address() {
		return rate;
	}
	public void setAccount_address(String account_address) {
		this.rate = account_address;
	}
	public String getAccount_phone() {
		return req_type;
	}
	public void setAccount_phone(String account_phone) {
		this.req_type = account_phone;
	}
	public Long getReq_id() {
		return id;
	}
	public void setReq_id(Long req_id) {
		this.id = req_id;
	}
	public String getReq_title() {
		return req_title;
	}
	public void setReq_title(String req_title) {
		this.req_title = req_title;
	}
	public String getReq_description() {
		return req_description;
	}
	public void setReq_description(String req_description) {
		this.req_description = req_description;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getReq_type() {
		return req_type;
	}
	public void setReq_type(String req_type) {
		this.req_type = req_type;
	}
	public String getSecondary_skills() {
		return secondary_skills;
	}
	public void setSecondary_skills(String secondary_skills) {
		this.secondary_skills = secondary_skills;
	}
	public String getSeniority_level() {
		return seniority_level;
	}
	public void setSeniority_level(String seniority_level) {
		this.seniority_level = seniority_level;
	}
	public String getPay_rate() {
		return pay_rate;
	}
	public void setPay_rate(String pay_rate) {
		this.pay_rate = pay_rate;
	}
	public String getCandidate_availability() {
		return candidate_availability;
	}
	public void setCandidate_availability(String candidate_availability) {
		this.candidate_availability = candidate_availability;
	}
	public String getExp_required() {
		return exp_required;
	}
	public void setExp_required(String exp_required) {
		this.exp_required = exp_required;
	}
	public String getRecruiter_name() {
		return recruiter_name;
	}
	public void setRecruiter_name(String recruiter_name) {
		this.recruiter_name = recruiter_name;
	}
	public String getAccount_manager() {
		return account_manager;
	}
	public void setAccount_manager(String account_manager) {
		this.account_manager = account_manager;
	}
	
}
