package com.app.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Order extends BaseEntity {
	
	@Column(name="total_qty")
	private int totalQuantity;
	@Column(name="total_amount")
	private int totalAmount;
	
	@ManyToMany
	@JoinTable(name="product_order",joinColumns= @JoinColumn(name="order_id")
	,inverseJoinColumns = @JoinColumn(name="Prduct_id"))
	private Set<Product> productset= new HashSet<Product>();
}
