package com.example.demo.entity;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tuition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private String id;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "menuId", nullable = false)
	private Menu menu;
	
	@Column(nullable = false)
	private double cal;
	
	@Column(nullable = false)
	private double protein;
	
	@Column(nullable = false)
	private double fat;
	
	@Column(nullable = false)
	private double carbo;
	
	@Column(nullable = false)
	private double salt;
	
}
