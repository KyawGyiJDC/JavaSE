package com.solt.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public enum Result{
		PASS,FAIL
	}
	private int id;
	private int roll;
	private String name;
	private String grade;
	private LocalDate year;
	private Result result;
	private int myanmar;
	private int english;
	private int mathematics;
	private int chemastry;
	private int physics;
	private int biology;
	private int ecology;
	private String subject;
	private String distinction;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return "Grade :"+grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public LocalDate getYear() {
		return year;
	}
	public void setYear(LocalDate year) {
		this.year = year;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public int getMyanmar() {
		return myanmar;
	}
	public void setMyanmar(int myanmar) {
		this.myanmar = myanmar;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMathematics() {
		return mathematics;
	}
	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}
	public int getChemastry() {
		return chemastry;
	}
	public void setChemastry(int chemastry) {
		this.chemastry = chemastry;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getBiology() {
		return biology;
	}
	public void setBiology(int biology) {
		this.biology = biology;
	}
	public int getEcology() {
		return ecology;
	}
	public void setEcology(int ecology) {
		this.ecology = ecology;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject.toString();
	}
	
	public String getDistinction() {
		return distinction;
	}
	public void setDistinction(String distinction) {
		this.distinction = distinction;
	}
	@Override
	public String toString() {
		return "[myanmar=" + myanmar + ", english=" + english + ", mathematics=" + mathematics + ", chemastry="
				+ chemastry + ", physics=" + physics + ", biology=" + biology + ", ecology=" + ecology + "]";
	}
	
	
	
	
}
