package com.vehicle.test;

public class VehicleUser {
	public int vehicleId;
	public int vehicleType;
	public String vehicleName;
	public String vehicleModel;
	public String vehicleDate;
	public String vehicleCompany;
	public int vehicleCategory;
	public double vehicleTorque;
	public double vehicleHp;
	public double vehicleMaxSpeed;
	public double vehicleAcc;
	public double vehicleRun;

	public void insert1(int vehicleId, int vehicleType, String vehicleName, String vehicleModel) {
		this.vehicleId = vehicleId;
		this.vehicleType =  vehicleType;
		this.vehicleName = vehicleName;
		this.vehicleModel = vehicleModel;
	}
	public void insert2(String vehicleDate, String vehicleCompany, int vehicleCategory, double vehicleTorque){
		this.vehicleDate = vehicleDate;
		this.vehicleCompany =  vehicleCompany;
		this.vehicleCategory = vehicleCategory;
		this.vehicleTorque = vehicleTorque;
	}
	public void insert3(double vehicleHp, double vehicleMaxSpeed, double vehicleAcc, double vehicleRun) {
		this.vehicleHp = vehicleHp;
		this.vehicleMaxSpeed =  vehicleMaxSpeed;
		this.vehicleAcc = vehicleAcc;
		this.vehicleRun = vehicleRun;
	}
}
