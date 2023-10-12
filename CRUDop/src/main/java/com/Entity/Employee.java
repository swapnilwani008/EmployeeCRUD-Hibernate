package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="emptab")
public class Employee {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="eid")
	private Integer eid;
	@Column(name="ename")
	private String ename;
	@Column (name="erole")
	private String erole;
	@Column (name="salary")
	private Double esalary;
	public Employee(String ename, String erole, Double esalary) {
		super();
		this.ename = ename;
		this.erole = erole;
		this.esalary = esalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getErole() {
		return erole;
	}
	public void setErole(String erole) {
		this.erole = erole;
	}
	public Double getEsalary() {
		return esalary;
	}
	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", erole=" + erole + ", esalary=" + esalary + "]";
	}
	
	
}
