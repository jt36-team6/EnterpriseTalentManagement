package com.szxs.entity;


public class Enterprisetalent {

  private int id;
  private String name;
  private int workingLife;
  private String workExperience;
  private String personalProfile;
  private int departmentId;
  private String graduateSchool;
  private Department department;

  public Enterprisetalent() {
  }

  public Enterprisetalent(int id) {
    this.id = id;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWorkingLife() {
    return workingLife;
  }

  public void setWorkingLife(int workingLife) {
    this.workingLife = workingLife;
  }

  public String getWorkExperience() {
    return workExperience;
  }

  public void setWorkExperience(String workExperience) {
    this.workExperience = workExperience;
  }

  public String getPersonalProfile() {
    return personalProfile;
  }

  public void setPersonalProfile(String personalProfile) {
    this.personalProfile = personalProfile;
  }

  public int getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
  }

  public String getGraduateSchool() {
    return graduateSchool;
  }

  public void setGraduateSchool(String graduateSchool) {
    this.graduateSchool = graduateSchool;
  }
}
