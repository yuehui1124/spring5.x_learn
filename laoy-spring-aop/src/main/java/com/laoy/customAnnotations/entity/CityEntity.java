package com.laoy.customAnnotations.entity;

import com.laoy.customAnnotations.anno.Entity;

@Entity(value = "city")
public class CityEntity {
	private String id;

	private String name;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
