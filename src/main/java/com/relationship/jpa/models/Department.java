package com.relationship.jpa.models;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "deptid")
    private Integer deptid;
    @Column(name = "deptname")
    private String deptname;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Employee> employees;
	public Integer getId() {
		return deptid;
	}
	public void setId(Integer id) {
		this.deptid = id;
	}
	public String getDeptName() {
		return deptname;
	}
	public void setDeptName(String deptName) {
		this.deptname = deptName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Department(Integer id, String deptName, List<Employee> employees) {
		super();
		this.deptid = id;
		this.deptname = deptName;
		this.employees = employees;
	}

	public Department() {
	}
    
    
}
