/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Product;
import models.User;
import services.DbConnection;
import view.pages.Dashboard;

/**
 *
 * @author 1styrGroupA
 */
public class ProductController {

    public static void index(User user, DbConnection dbConnection) {

        try {

            Dashboard dashboard = new Dashboard();
            dashboard.setUser(user);
            dashboard.setProducts(ProductController.products(dbConnection));
            dashboard.showPage(dbConnection);

        } catch (Exception e) {
            System.out.println("Something went wrong ...." + e);
            e.printStackTrace();
        }

    }

    public static void store(Product product, DbConnection dbConnection, Dashboard dashboard) {

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
                dashboard.updateProducts();
            }
            dbConnection.getPreparedStatement().close();
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }

    }

    public static void update(Product product, DbConnection dbConnection, Dashboard dashboard) {
        String query = "UPDATE products SET name = ? , price = ? ,brand = ?,stocks = ?,description =? WHERE id = ?;";
        try {
            dbConnection.setPreparedStatement(dbConnection.getConnection().prepareStatement(query));
            dbConnection.getPreparedStatement().setString(1, product.getName());
            dbConnection.getPreparedStatement().setDouble(2, product.getPrice());
            dbConnection.getPreparedStatement().setString(3, product.getBrand());
            dbConnection.getPreparedStatement().setInt(4, product.getStocks());
            dbConnection.getPreparedStatement().setString(5, product.getDescription());
            dbConnection.getPreparedStatement().setInt(6, product.getId());
            dbConnection.getPreparedStatement().toString();

            if (dbConnection.getPreparedStatement().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Product successfully updated!");
                dashboard.updateProducts();
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }

    public static int destroy(int id, DbConnection dbConnection) {
        try {
            String query = "DELETE FROM products WHERE id = " + String.valueOf(id);
            dbConnection.setStatement(dbConnection.getConnection().createStatement());
            return dbConnection.getStatement().executeUpdate(query);
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e);
            return 0;
        }
    }

    public static ArrayList<Product> products(DbConnection dbConnection) {
        try {
            String query = "SELECT * FROM products;";
            dbConnection.setResultSet(dbConnection.getStatement().executeQuery(query));
            ArrayList<Product> products = new ArrayList<>();
            while (dbConnection.getResultSet().next()) {
                Product product = new Product();
                product.setId(dbConnection.getResultSet().getInt("id"));
                product.setName(dbConnection.getResultSet().getString("name"));
                product.setBrand(dbConnection.getResultSet().getString("brand"));
                product.setPrice(dbConnection.getResultSet().getDouble("price"));
                product.setStocks(dbConnection.getResultSet().getInt("stocks"));
                product.setDescription(dbConnection.getResultSet().getString("description"));
                products.add(product);
            }

            return products;

        } catch (Exception e) {
            System.out.println("Something went wrong ...." + e);
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Product> search(String searchInput, DbConnection dbConnection) {
        try {
            String query = "SELECT * FROM `products` WHERE CONCAT(`id`, `name`, `brand`, `price`, `stocks`, `description`)LIKE'%" + searchInput + "%'";
            dbConnection.setResultSet(dbConnection.getStatement().executeQuery(query));
            ArrayList<Product> products = new ArrayList<>();
            while (dbConnection.getResultSet().next()) {
                Product product = new Product();
                product.setId(dbConnection.getResultSet().getInt("id"));
                product.setName(dbConnection.getResultSet().getString("name"));
                product.setBrand(dbConnection.getResultSet().getString("brand"));
                product.setPrice(dbConnection.getResultSet().getDouble("price"));
                product.setStocks(dbConnection.getResultSet().getInt("stocks"));
                product.setDescription(dbConnection.getResultSet().getString("description"));
                products.add(product);
            }

            return products;

        } catch (Exception e) {
            System.out.println("Something went wrong ...." + e);
            e.printStackTrace();
            return null;
        }
    }

}
