package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@SequenceGenerator(
		name = "product_sequence",
		sequenceName = "product_sequence",
		allocationSize = 1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "product_sequence"
	)
	private long id;
	private String titre;
	private String description;
	private String shortDescription;
    private int qte;
	private int prix;
	
	public Product(){}

	public Product(long id, String titre, String description, String shortDescription, int qte, int prix) {
		this.id = id;
		this.titre = titre;
        this.description = description;
		this.shortDescription = shortDescription;
		this.qte = qte;
		this.prix = prix;
	}

	public Product(String titre, String description, String shortDescription, int qte, int prix) {
		this.titre = titre;
        this.description = description;
		this.shortDescription = shortDescription;
		this.qte = qte;
		this.prix = prix;
	}
	public long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}



	public String getTitre(){
		return titre;
	}
	public void setTitre(String titre){
		this.titre = titre;
	}



	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		this.description = description;
	}


	public String getShortDescription(){
		return shortDescription;
	}
	public void setShortDescription(String shortDescription){
		this.shortDescription = shortDescription;
	}


	public int getQte(){
		return qte;
	}
	public void setQte(int qte){
		this.qte = qte;
	}


	public int getPrix(){
		return prix;
	}
	public void setPrix(int prix){
		this.prix = prix;
	}


	@Override
	public String toString(){
		return "Product{"+ "id=" + id + ",titre'" + titre + '\'' + ",description'" + description + '\'' + ",shortDescription'" + shortDescription + '\'' +", qte=" + qte + ", prix=" + prix + '}'; 
	}


}