/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Product;
import services.DbConnection;

/**
 *
 * @author 1styrGroupA
 */
public class ProductController {

    public static void store(Product product, DbConnection dbConnection) {

        String query = "INSERT INTO products(name,price,brand,stocks,description) VALUES (?,?,?,?,?);";

        try {
            dbConnection.setPreparedStatement(dbConnection.getConnection().prepareStatement(query));
            dbConnection.getPreparedStatement().setString(1, product.getName());
            dbConnection.getPreparedStatement().setDouble(2, product.getPrice());
            dbConnection.getPreparedStatement().setString(3, product.getBrand());
            dbConnection.getPreparedStatement().setInt(4, product.getStocks());
            dbConnection.getPreparedStatement().setString(5, product.getDescription());

            if (dbConnection.getPreparedStatement().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Product successfully created!");
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }

    }

    public static void update(Product product, DbConnection dbConnection) {
        String query = "UPDATE products SET name = ? , price = ? ,brand = ?,stocks = ?,description =? WHERE id = ?;";

        try {
            dbConnection.setPreparedStatement(dbConnection.getConnection().prepareStatement(query));
            dbConnection.getPreparedStatement().setString(1, product.getName());
            dbConnection.getPreparedStatement().setDouble(2, product.getPrice());
            dbConnection.getPreparedStatement().setString(3, product.getBrand());
            dbConnection.getPreparedStatement().setInt(4, product.getStocks());
            dbConnection.getPreparedStatement().setString(5, product.getDescription());
            dbConnection.getPreparedStatement().setInt(6, product.getId());

            if (dbConnection.getPreparedStatement().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Product successfully updated!");
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }

    public static void destroy(int id, DbConnection dbConnection) {
        try {
            String query = "DELETE FROM products WHERE id = " + String.valueOf(id);
            dbConnection.setStatement(dbConnection.getConnection().createStatement());
            if (dbConnection.getStatement().executeUpdate(query) > 0) {
                JOptionPane.showMessageDialog(null, "Product successfully deleted!");
            }

        } catch (SQLException | HeadlessException e) {
        }
    }

}
