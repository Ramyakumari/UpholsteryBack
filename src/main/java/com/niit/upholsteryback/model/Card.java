package com.niit.upholsteryback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Card")
@Component
public class Card {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int cardid;
	@Column
		private String cardname;
	@Column
		private int cardnumber ; 
	@Column
		private int cardverificationvaluenumber ; 
	@Column
		private String cardtype;
		
		
		public int getCardId() {
			return cardid;
		}
		public void setCardId(int cardid) {
		   this.cardid= cardid;
		}
		
	 
	public int getCardNumber() {
		return cardnumber;
	}
	public void setCardNumber(int cardnumber) {
	   this.cardnumber = cardnumber;
	}
	public int getCardVerificationValueNumber() {
		return cardverificationvaluenumber;
	}
	public void setCardVerificationValuenumber(int cardverificationvaluenumber) {
	   this.cardverificationvaluenumber = cardverificationvaluenumber;
	}
	public String getCardType() {
		 return cardtype;
	}
	public void setCardType(String cardtype) {
		this.cardtype = cardtype;
	}
	}


