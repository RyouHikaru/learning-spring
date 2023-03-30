package com.tapioca.spring.springcore.propertytypeplaceholder;

public class MyDAO {

	private String dbServer;

	public MyDAO(String dbServer) {
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "MydDAO [dbServer=" + dbServer + "]";
	}

}
