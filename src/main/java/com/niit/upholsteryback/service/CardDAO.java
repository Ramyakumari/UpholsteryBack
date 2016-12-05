package com.niit.upholsteryback.service;




import java.util.List;

import com.niit.upholsteryback.model.Card;




public interface CardDAO {
	
	 public List<Card> getAllCard();
	   public  Card getCard(int cardid);
	   public void insertCard(Card card);
	   public void updateCard(Card card);
	   public void deleteCard(int id);
	   public void deleteallCard(Card card);

}

