package application;

import java.util.Date;

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
	}
}
