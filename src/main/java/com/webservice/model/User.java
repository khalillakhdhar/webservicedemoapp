package com.webservice.model;

import lombok.Data;

//@Data
public class User {
public static int id=0;
private String nom,prenom;
private int age;
public User(String nom, String prenom, int age) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	id++;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "User [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ",id=" + id + "]";
}

}
