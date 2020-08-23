package com.vehicle.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.vehicle.dao.VehicleDao;

public class Test 
{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		VehicleDao vehicleDao = new VehicleDao();
		Boolean flag = true;
		
		while(flag) {
			System.out.println("MENU:");
			System.out.println("Enter Keyword to perform Operation on Vehicle ");
			System.out.println("1: To insert the vehicle details");
			System.out.println("2: To display vehicle details based on category");
			System.out.println("3: To display vehicle details by name");
			System.out.println("4: To display vehicle details by max speed");
			System.out.println("5: To display vehicle details in range of manufacturing date");
			System.out.println("6: To exit the Menu");

			try {
				int choice = scan.nextInt();
				switch (choice) {

				case 1:
					List list = new ArrayList();
					System.out.println("Enter Vehicle Type(INT):");
					System.out.println("1: Light Weight Passenger Carrier");
					System.out.println("2: Heavy Weight Passenger carrier");
					System.out.println("3: Light Weight goods carrier");
					System.out.println("4: Heavy Weight goods carrier");
					int vehicleType = scan.nextInt();
					System.out.println("Enter Vehicle Details of Type:");
					System.out.println("Enter Vehicle Name(String):");
					String vehicleName = scan.next();
					System.out.println("Enter Vehicle Model No(String):");
					String vehicleModel = scan.next();

					System.out.println("Enter Vehicle Manafacturiing date in Format YYYY-MM-DD:");
					String vehicleDate = scan.next();
					System.out.println("Enter Vehicle Company Name(String):");
					String vehicleCompany = scan.next();
					System.out.println("Enter wheel category of vehicle(int):");
					int vehicleCategory = scan.nextInt();
					System.out.println("Enter Vehicle Torque(double):");
					double vehicleTorque = scan.nextDouble();

					System.out.println("Enter Vehicle Brake Hore Power(double):");
					double vehicleHp = scan.nextDouble();
					System.out.println("Enter Vehicle Max Speed(double):");
					double vehicleMaxSpeed = scan.nextDouble();
					System.out.println("Enter Vehicle Acceleration(double):");
					double vehicleAcc = scan.nextDouble();
					System.out.println("Enter Vehicle Run(double):");
					double vehicleRun = scan.nextDouble();

					VehicleUser vehicleUser = new VehicleUser();
					vehicleUser.insert1(0, vehicleType, vehicleName, vehicleModel);
					vehicleUser.insert2(vehicleDate, vehicleCompany, vehicleCategory, vehicleTorque);
					vehicleUser.insert3(vehicleHp, vehicleMaxSpeed, vehicleAcc, vehicleRun);
					Boolean b = vehicleDao.insertDetails(vehicleUser);

					if(b == true)
					{
						System.out.println("Record Inserted Successfully");
					}
					else {
						System.out.println("Error Inserting Record");
					}
					System.out.println("---------------------------------------------------------------");
					break;

				case 2:
					System.out.println("Enter which category vehicle you want to display:");
					System.out.println("1: 2 Wheeler");
					System.out.println("2: 3 Wheeler");
					System.out.println("3: 4 Wheeler");
					int category = scan.nextInt();
					List categoryList = new ArrayList();
					categoryList = vehicleDao.displayByCategory(category);
					for (Object obj : categoryList) {
						System.out.println(obj);
					}
					System.out.println("---------------------------------------------------------------");
					break;

				case 3:
					List nameList = new ArrayList();
					nameList = vehicleDao.displayByName();
					for (Object obj : nameList) {
						System.out.println(obj);
					}
					System.out.println("---------------------------------------------------------------");
					break;

				case 4:
					List maxList = new ArrayList();
					maxList = vehicleDao.displayByMaxspeed();
					for (Object obj : maxList) {
						System.out.println(obj);
					}
					System.out.println("---------------------------------------------------------------");
					break;

				case 5:
					System.out.println("Enter Lower Manufacturing date in YYYY-MM-DD format:");
					String lowerMfgDate = scan.next();
					System.out.println("Enter Higher Manufacturing date YYYY-MM-DD format:");
					String upperMfgDate = scan.next();

					List dateList = new ArrayList();
					dateList = vehicleDao.displayByMfgDate(lowerMfgDate, upperMfgDate);
					for (Object obj : dateList) {
						System.out.println(obj);
					}
					System.out.println("----------------------------------------------------------------");
					break;
				case 6:
					System.out.println("Thank You for using our Application!!!");
					flag = false;
					break;
					
				} 
			}
			catch (Exception e) {
				System.out.println("Wrong Input Please Try Again!");
				System.out.println(e.getMessage());
				flag = false;
			}	
		}
	}
}
