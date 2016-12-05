package com.niit.upholsteryback.model;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Category")
@Component
public class Category {
	
    @Id
    @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	   private int categoryid;
    
    @Column
	   private String categoryname; 
    @Column
	   private String categorydecription; 

	   
  
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategorydecription() {
		return categorydecription;
	}
	public void setCategorydecription(String categorydecription) {
		this.categorydecription = categorydecription;
	}
   
}

