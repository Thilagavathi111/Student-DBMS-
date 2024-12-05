package com.qsp.controller;
import com.qsp.model.*;
class DataNotFoundExcep extends Exception{
	private String msg;
	public DataNotFoundExcep(String msg) {
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
}

public class Excep {
	public static void dataNotFound(Student data)
	{
		if(data == null) {
			try {
				throw new DataNotFoundExcep("Sorry....Data Not Found");
			}
			catch(DataNotFoundExcep e) {
				System.out.println(e.getMsg());
			}
		}
	}
	

}
