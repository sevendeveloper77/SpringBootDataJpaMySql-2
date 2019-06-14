package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	@NonNull
	private Integer prodId;
	@NonNull
	private String prodCode;
	@NonNull
	private Double ProdCost;
}
