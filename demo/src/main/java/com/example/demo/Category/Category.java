package com.example.demo.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Category {

    @Id
	@SequenceGenerator(
		name = "category",
		sequenceName = "category",
		allocationSize = 1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "category"
	)


    private long storeId;
    private String name;


    public Category(){}

    public Category(long storeId, String name){
        this.storeId=storeId;
        this.name=name;
    }
    public Category(String name){
        this.name=name;
    }


    public long getStoreId(){
		return storeId;
	}
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

    public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}



    @Override
	public String toString(){
		return "Category{"+ "storeId=" + storeId + ",name'" + name + '\'' + '}'; 
	}

}
