/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Util.databaseConnection;

/**
 *
 * @author Sadeep
 */
public class CustomerImpl implements Icustomer{
    
	public CustomerImpl() {

	}

	public ArrayList<Customer> getAllCustomer() {

		ArrayList<Customer> customerList = new ArrayList<>();

		PreparedStatement pst;
		ResultSet rs;

		Connection con;
		try {
			con = databaseConnection.getDBConnection();
			try {
				pst = con.prepareStatement("select * from customers");
				rs = pst.executeQuery();

				while(rs.next()) {

					Customer customer = new Customer();

					customer.setCus_ID(rs.getString(1));
					customer.setCus_Name(rs.getString(2));
					customer.setCus_Address(rs.getString(3));
					customer.setCus_Number(rs.getString(4));
					
					customerList.add(customer);

				}

			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return customerList;
	}     
    
}
