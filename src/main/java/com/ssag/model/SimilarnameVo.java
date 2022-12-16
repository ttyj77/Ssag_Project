package com.ssag.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("similarnameVo")
public class SimilarnameVo {

	
	private String similar;
	private String originalname;
	
	private IngredientVo ingredientVo22;
	private MerchandiseVo merchandiseVo22;
	private CookIngredientVo cookIngredientVo22;
	private CookVo cookVo22;
	
	
	public String getSimilar() {
		return similar;
	}
	public void setSimilar(String similar) {
		this.similar = similar;
	}
	public String getOriginalname() {
		return originalname;
	}
	public void setOriginalname(String originalname) {
		this.originalname = originalname;
	}
	public IngredientVo getIngredientVo22() {
		return ingredientVo22;
	}
	public void setIngredientVo22(IngredientVo ingredientVo22) {
		this.ingredientVo22 = ingredientVo22;
	}
	public MerchandiseVo getMerchandiseVo22() {
		return merchandiseVo22;
	}
	public void setMerchandiseVo22(MerchandiseVo merchandiseVo22) {
		this.merchandiseVo22 = merchandiseVo22;
	}
	public CookIngredientVo getCookIngredientVo22() {
		return cookIngredientVo22;
	}
	public void setCookIngredientVo22(CookIngredientVo cookIngredientVo22) {
		this.cookIngredientVo22 = cookIngredientVo22;
	}
	public CookVo getCookVo22() {
		return cookVo22;
	}
	public void setCookVo22(CookVo cookVo22) {
		this.cookVo22 = cookVo22;
	}
	@Override
	public String toString() {
		return "SimilarnameVo [similar=" + similar + ", originalname=" + originalname + ", ingredientVo22="
				+ ingredientVo22 + ", merchandiseVo22=" + merchandiseVo22 + ", cookIngredientVo22=" + cookIngredientVo22
				+ ", cookVo22=" + cookVo22 + "]";
	}
	
	
	
	
}
