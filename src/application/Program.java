package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller sll = new  Seller(1, "Gui", "agmail.com", new Date(), 20000.00, obj);
		System.out.println(sll);
	}
}
