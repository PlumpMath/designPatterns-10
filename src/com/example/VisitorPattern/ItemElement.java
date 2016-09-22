package com.example.VisitorPattern;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
