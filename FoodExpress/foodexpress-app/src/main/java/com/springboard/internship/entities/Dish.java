package com.springboard.internship.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="dish3")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
//    private boolean available;
    private String logoPath;
    
    
//    @ManyToOne
//    @JoinColumn(name = "restaurantList1", nullable = false)
//    private Restaurant restaurant;
    public Dish(){
    	
    }
	public Dish(boolean available, Long id, String name, String description, double price,String logoPath) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.logoPath = logoPath;
	//	this.available = available;
	// this.restaurant =restaurant;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String getLogoPath() {
		return logoPath;
	}
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	
//	public boolean isAvailable() {
//		return available;
//	}
//	public void setAvailable(boolean available) {
//		this.available = available;
//	}
	
//	public Restaurant getRestaurant() {
//		return restaurant;
//	}
//	public void setRestaurant(Restaurant restaurant) {
//		this.restaurant = restaurant;
//	}
	
	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", logoPath=" + logoPath + "]";
	}
    
    

}
















