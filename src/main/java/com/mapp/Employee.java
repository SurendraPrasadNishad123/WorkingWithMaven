package com.mapp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.*;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
@Id
 private int eId;
 private String eName;
 @ManyToMany
/* //new table that made name it and its column
 @JoinTable(
		 name="emp_proj",
		 joinColumns= { @JoinColumn(name="eid")},
		 inverseJoinColumns= { @JoinColumn(name="pid")}
		 )*/
 private List<Project> projects;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eId, String eName, List<Project> projects) {
	super();
	this.eId = eId;
	this.eName = eName;
	this.projects = projects;
}
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}
 
}
