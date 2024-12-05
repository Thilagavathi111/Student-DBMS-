package com.qsp.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import com.qsp.controller.*;
import com.qsp.model.Student;

public class Driver {
	public static void main(String[] args)  {
	
		
		Scanner s = new Scanner(System.in);
		StudentDBMSimpl impl = new StudentDBMSimpl();
		Excep e = new Excep();
		while (true) {
			System.out.println();
			System.out.println("****************************");
			System.out.println(
					" 1. Save\n 2. Update\n 3. GetAllData\n 4. GetDataById\n 5. GetDataByName\n 6. GetDataByMobno\n 7. GetDataByEmail\n 8. Remove Data\n 9. Clear Data\n 10. Exit");
			System.out.println();
			System.out.println("*****************************");
			System.out.println("Please Select the option");
			System.out.println();
			int choice = s.nextInt();
			switch (choice) {
			case 1: {
				// Save
				System.out.println("Enter Id");
				int id = s.nextInt();
				System.out.println("Enter Name");
				String name = s.next();
				System.out.println("Enter mobile");
				long mobno = s.nextLong();
				System.out.println("Enter email");
				String email = s.next();
				Student stu = new Student(id, name, mobno, email);
				impl.save(stu);

			}
				break;
			case 2: {
				// Update
				System.out.println("Enter id");
				int id = s.nextInt();
				Student st = impl.update(id);
				if (st != null) {
					System.out.println(" 1. UpdateName\n 2. Update MobNo\n 3. Update Email");
					System.out.println("Select Choice");
					int choice1 = s.nextInt();
					switch (choice1) {
					case 1: {
						System.out.println("Enter New Name");
						String name = s.next();
						st.setName(name);
						System.out.println("Name Updated");
					}
						break;
					case 2: {
						System.out.println("Enter New MobNo");
						long mobno = s.nextLong();
						st.setMobno(mobno);
						System.out.println("Mobno Updated");
					}
						break;
					case 3: {
						System.out.println("Enter New Email");
						String email = s.next();
						st.setEmail(email);
						System.out.println("Email Updated");
					}
						break;
					}
				}

			}
				break;
			case 3: {
				// GetAllData
				impl.getAllData();

			}
				break;
			case 4: {
				// GetDataById
				System.out.println("Enter id");
				int id = s.nextInt();
				Student data = impl.getDataById(id);
				if (data != null) {
					System.out.println(data.getId());
					System.out.println(data.getName());
					System.out.println(data.getMobno());
					System.out.println(data.getEmail());
				} else
					e.dataNotFound(data);

			}
				break;
			case 5: {
				// GetDataByName
				System.out.println("Enter name");
				String name = s.next();
				Student data = impl.getDataByName(name);
				if (data != null) {
					System.out.println(data.getId());
					System.out.println(data.getName());
					System.out.println(data.getMobno());
					System.out.println(data.getEmail());
				} else
					e.dataNotFound(data);
			}
				break;

			case 6: {
				// GetDataByMobno
				System.out.println("Enter mobno");
				long mobno = s.nextLong();
				Student data = impl.getDataByMobno(mobno);
				if (data != null) {
					System.out.println(data.getId());
					System.out.println(data.getName());
					System.out.println(data.getMobno());
					System.out.println(data.getEmail());
				} else
					e.dataNotFound(data);
			}
				break;
			case 7: {
				// GetDataByEmail
				System.out.println("Enter email");
				String email = s.next();
				Student data = impl.getDataByEmail(email);
				if (data != null) {
					System.out.println(data.getId());
					System.out.println(data.getName());
					System.out.println(data.getMobno());
					System.out.println(data.getEmail());
				} else
					e.dataNotFound(data);
			}
				break;

			case 8: {
				// RemoveData
				System.out.println("Enter id");
				int id = s.nextInt();
				impl.remove(id);
			}
				break;

			case 9: {

				// ClearData
				impl.clear();
				System.out.println("Data cleared");

			}
				break;

			case 10: {
				// Exit
				System.out.println("Thank You......!!!!");
				System.exit(0);
			}
				break;
			default:
				System.out.println("Invalid choice");

			}
		}

	}

}