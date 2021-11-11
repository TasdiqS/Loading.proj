package com.SpringLogi.SpringLogis.entities;

import java.time.LocalDate;
import java.util.UUID;


public class Load {
//	private UUID shipmentid;
	private long shipmentid;
	private LocalDate date= LocalDate.now();
		
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private int noOfTrucks;
	private int weight;
	private String optional="";
	
	
	public Load(long shipmentid, LocalDate date, String loadingPoint, String unloadingPoint, String productType,
			String truckType, int noOfTrucks, int weight, String optional) {
		super();
//		this.shipmentid = UUID.randomUUID();
		this.shipmentid = shipmentid;
		this.date = LocalDate.now();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.optional = optional;
	}

	//Getters and Setters
	public long getShipmentid() {
		return shipmentid;
	}
	public void setShipmentid(long shipmentid) {
		this.shipmentid = shipmentid;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = LocalDate.now();
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}

	@Override
	public String toString() {
		return "Load [shipmentid=" + shipmentid + ", date=" + date + ", loadingPoint=" + loadingPoint
				+ ", unloadingPoint=" + unloadingPoint + ", productType=" + productType + ", truckType=" + truckType
				+ ", noOfTrucks=" + noOfTrucks + ", weight=" + weight + ", optional=" + optional + "]";
	}
	

}
