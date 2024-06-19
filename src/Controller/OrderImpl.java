/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Util.databaseConnection;

/**
 *
 * @author Sadeep
 */
public class OrderImpl implements Iorder{
    
    	public OrderImpl() {

	}

	public ArrayList<Order> getAllOrder() {

		ArrayList<Order> orderList = new ArrayList<>();

		PreparedStatement pst;
		ResultSet rs;

		Connection con;
		try {
			con = databaseConnection.getDBConnection();
			try {
				pst = con.prepareStatement("select * from orders");
				rs = pst.executeQuery();

				while(rs.next()) {

					Order order = new Order();

					order.setOdr_ID(rs.getString(1));
					order.setCus_Name(rs.getString(2));
					order.setOdr_Item(rs.getString(3));
					order.setOdr_Quantity(rs.getString(4));
                                        order.setOdr_unitPrice(rs.getString(5));
                                        order.setOdr_Total(rs.getString(6));
					
					orderList.add(order);

				}

			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return orderList;
	}     
    
}
