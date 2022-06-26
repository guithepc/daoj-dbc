package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		SellerDao sl = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1 - FindById ===");
		Seller seller = sl.findById(2);
		
		System.out.println(seller);

		
		
		
		System.out.println("\n=== TEST 2 - FindByDepartment ===");
		Department department = new Department(2, null);
		
		List<Seller> list = sl.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}
}
