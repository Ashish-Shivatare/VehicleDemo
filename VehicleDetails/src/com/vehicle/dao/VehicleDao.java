package com.vehicle.dao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.vehicle.entities.Vehicle;
import com.vehicle.test.VehicleUser;

public class VehicleDao {
	private SessionFactory factory=new Configuration().configure("cfgs/hibernate.cfg.xml").addAnnotatedClass(Vehicle.class).buildSessionFactory();
	
	public boolean insertDetails(VehicleUser vu1){
		boolean flag = true;
		
		Session session = factory.openSession();
		Vehicle v1 = new Vehicle();
		v1.setVehicleId(vu1.vehicleType);
		v1.setVehicleName(vu1.vehicleName);
		v1.setVehicleModel(vu1.vehicleModel);
		v1.setVehicleDate(vu1.vehicleDate);
		v1.setVehicleCompany(vu1.vehicleCompany);
		v1.setVehicleCategory(vu1.vehicleCategory);
		v1.setVehicleTorque(vu1.vehicleTorque);
		v1.setVehicleHp(vu1.vehicleHp);
		v1.setVehicleMaxSpeed(vu1.vehicleMaxSpeed);
		v1.setVehicleAcc(vu1.vehicleAcc);
		v1.setVehicleRun(vu1.vehicleRun);
		
		Transaction transaction = session.beginTransaction();
		try
		{
			session.save(v1);
			transaction.commit();
		}catch(Exception e)
		{
			flag = false;
			transaction.rollback();
		}
		session.close();
		return flag;
	}
	
	public List<Vehicle> displayByCategory(int category) {
		Session session = factory.openSession();
	
		Criteria crt = session.createCriteria(Vehicle.class);
		crt.add(Restrictions.eq("vehicleCategory", category));

		List<Vehicle> categoryList = crt.list();
		session.close();
		return categoryList;
	}
	
	public List<Vehicle> displayByName() {
		Session session = factory.openSession();
	
		Criteria crt = session.createCriteria(Vehicle.class);
		crt.addOrder(org.hibernate.criterion.Order.asc("vehicleName"));

		List<Vehicle> nameList = crt.list();
		session.close();
		return nameList;
	}
	
	public List<Vehicle> displayByMaxspeed() {
		Session session = factory.openSession();
	
		Criteria crt = session.createCriteria(Vehicle.class);
		crt.addOrder(org.hibernate.criterion.Order.asc("vehicleName"));
		crt.addOrder(org.hibernate.criterion.Order.asc("vehicleMaxSpeed"));

		List<Vehicle> maxList = crt.list();
		session.close();
		return maxList;
	}
	
	public List<Vehicle> displayByMfgDate(String lowerMfgDate, String uppderMfgDate) {
		Session session = factory.openSession();
	
		Criteria crt = session.createCriteria(Vehicle.class);
		crt.add(Restrictions.ge("vehicleDate", lowerMfgDate));
		crt.add(Restrictions.le("vehicleDate", uppderMfgDate));

		List<Vehicle> dateList = crt.list();
		session.close();
		return dateList;
	}
}
