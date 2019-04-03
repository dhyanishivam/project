package com.capgemini.capstore.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ProductDetail")
@SequenceGenerator(name = "prodseq", initialValue = 20000, allocationSize = 10000)
public class Product {

	@Id
	@Column(name = "productId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodseq")
	@NotNull
	private int productId;
	@Column(name="productPrice")
	@NotNull
	private int productPrice;
	@Column(name = "productName")
	@NotNull
	private String productName;
	@Column(name = "productImageUrl")
	@NotNull
	private String productImageUrl;
	@Column(name = "productCategory")
	@NotNull
	private Category productCategory;
	@Column(name = "productBrand")
	@NotNull
	private String productBrand;
	@Column(name = "productModel")
	@NotNull
	private String productModel;   
	@Column(name = "productType")
	@NotNull
	private String productType;
	@Column(name = "productFeature")
	@NotNull
	private String productFeature;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Merchant> merchants;

	public int getProductId() {
		return productId;
	}

	public List<Merchant> getMerchants() {
		return merchants;
	}

	public void setMerchants(List<Merchant> merchants) {
		this.merchants = merchants;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public Product(@NotNull int productId, @NotNull int productPrice, @NotNull String productName,
			@NotNull String productImageUrl, @NotNull Category productCategory, @NotNull String productBrand,
			@NotNull String productModel, @NotNull String productType, @NotNull String productFeature,
			List<Merchant> merchants) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = productName;
		this.productImageUrl = productImageUrl;
		this.productCategory = productCategory;
		this.productBrand = productBrand;
		this.productModel = productModel;
		this.productType = productType;
		this.productFeature = productFeature;
		this.merchants = merchants;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductFeature() {
		return productFeature;
	}

	public void setProductFeature(String productFeature) {
		this.productFeature = productFeature;
	}
	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
