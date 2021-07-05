package com.example.demo;

public class Category {
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
