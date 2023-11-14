package es.curso.java.ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Facility {

	private long id;
	private long guid;
	private String name;
	private String description;
	private String category;
	private String adress;
	private double height;

	
	public Facility(long id, long guid, String name, String description, String category, String adress, double height) {
		super();
		this.id = id;
		this.guid = guid;
		this.name = name;
		this.description = description;
		this.category = category;
		this.adress = adress;
		this.height = height;
	}
	
	public Facility() {
	
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the guid
	 */
	public long getGuid() {
		return guid;
	}


	/**
	 * @param guid the guid to set
	 */
	public void setGuid(long guid) {
		this.guid = guid;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Facility [id=" + id + ", guid=" + guid + ", " + (name != null ? "name=" + name + ", " : "")
				+ (description != null ? "description=" + description + ", " : "")
				+ (category != null ? "category=" + category + ", " : "")
				+ (adress != null ? "adress=" + adress + ", " : "") + "height=" + height + "]";
	}

	
}
