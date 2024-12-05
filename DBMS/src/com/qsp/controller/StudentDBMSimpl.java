package com.qsp.controller;

	import java.util.ArrayList;

	import com.qsp.model.Student;

	public class StudentDBMSimpl implements StudentDBMS {
		private ArrayList<Student> arr= new ArrayList<>();

		@Override
		public void save(Student s) {
			if(s!=null) {
				arr.add(s);
				System.out.println("Data saved");
			}
			else
				System.out.println("Data not found to save");
		}

		@Override
		public Student update(int id) {
			for(int i=0;i<arr.size();i++) {
				if(arr.get(i).getId() == id) {
					return arr.get(i);
				}
			}
			return null;
			
		}

		@Override
		public void getAllData() {
			for(int i=0;i<arr.size();i++) {
				System.out.println(arr.get(i));
			}
		}
		
		@Override
		public Student getDataById(int id) {
			for(int i=0;i<arr.size();i++) {
				if(arr.get(i).getId() == id) {
					return arr.get(i);
				}
			}
			return null;
			
		}
		@Override
		public Student getDataByName(String name) {
			for(int i=0;i<arr.size();i++) {
				if(arr.get(i).getName().equalsIgnoreCase(name)) {
					return arr.get(i);
				}
			}
			return null;
			
		}

		@Override
		public Student getDataByMobno(long mobno) {
			for(int i=0;i<arr.size();i++) {
				if(arr.get(i).getMobno() == (mobno)) {
					return arr.get(i);
				}
			}
			
			return null;
		}

		@Override
		public Student getDataByEmail(String email) {
			for(int i=0;i<arr.size();i++) {
				if(arr.get(i).getEmail().equals(email)) {
					return arr.get(i);
				}
			}
			return null;
		}

		@Override
		public void remove(int id) {
			for(int i=0;i<arr.size();i++) {
				if(arr.get(i).getId() == id) {
					arr.remove(i);
					System.out.println("Data Removed");
				}
			}
			
		}

		@Override
		public void clear() {
			arr.clear();
			
		}

}