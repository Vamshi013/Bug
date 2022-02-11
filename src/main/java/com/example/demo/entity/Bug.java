package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Bug {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bug_id;
	@NotBlank
	@NotNull
	@Email
	private String email_id;
	@NotBlank
	@NotNull
	private String owner_project;
	@NotBlank
	@NotNull
	private String priority;
	@NotBlank
	@NotNull
	private String status;
	@NotBlank
	@NotNull
	private String project_name;
	@NotBlank
	@NotNull
	private String created_date;
	@NotBlank
	@NotNull
	private String completed_date;
	@NotBlank
	@NotNull
	@Size(max = 100)
	private String description;
	
	@OneToOne(mappedBy ="bug")
	
	public Integer getBug_id() {
		return bug_id;
	}
	public void setBug_id(Integer bug_id) {
		this.bug_id = bug_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getOwner_project() {
		return owner_project;
	}
	public void setOwner_project(String owner_project) {
		this.owner_project = owner_project;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getCompleted_date() {
		return completed_date;
	}
	public void setCompleted_date(String completed_date) {
		this.completed_date = completed_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
	
	
	
	