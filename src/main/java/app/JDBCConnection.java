package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Class for Managing the JDBC Connection to a SQLLite Database.
 * Allows SQL queries to be used with the SQLLite Databse in Java.
 *
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 * @author Timothy Wiley, 2021. email: timothy.wiley@rmit.edu.au
 */
public class JDBCConnection {

    // Name of database file (contained in database folder)
    private static final String DATABASE = "jdbc:sqlite:database/Homelessness.db";

    public JDBCConnection() {
        System.out.println("Created JDBC Connection Object");
    }

    /**
     * Get all of the Movies in the database
     */
    public HashMap<String, ArrayList<String>> getLga() {
        HashMap<String, ArrayList<String>> lga = new HashMap<String, ArrayList<String>>();

        // Setup the variable for the JDBC connection
        Connection connection = null;

        try {
            // Connect to JDBC data base
            connection = DriverManager.getConnection(DATABASE);

            // Prepare a new SQL Query & Set a timeout
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            // The Query
            String query = "SELECT * FROM Homeles";
            
            // Get Result
            ResultSet results = statement.executeQuery(query);
           

            

            // Process all of the results
            // The "results" variable is similar to an array
            // We can iterate through all of the database query results
            while (results.next()) {
                // We can lookup a column of the a single record in the
                // result using the column name
                // BUT, we must be careful of the column type!
            
                String gender     = results.getString("gender");
                int year            = results.getInt("year");
                String agegroup         = results.getString("age");
                String code = results.getString("lga_code");

                // For now we will just store the movieName and ignore the id
                lga.get(code);
                lga.get(agegroup);
                lga.get(gender);

            }

            // Close the statement because we are done with it
            statement.close();
        } catch (SQLException e) {
            // If there is an error, lets just pr/ing the error
            System.err.println(e.getMessage());
        } finally {
            // Safety code to cleanup
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }

        // Finally we return all of the movies
        return lga;
    }

        
    /**
     * Get all of the Movie Titles in the database
     */
   

    /**
     * Get all the movies in the database by a given type.
     * Note this takes a string of the type as an argument!
     * This has been implemented for you as an example.
     * HINT: you can use this to find all of the horror movies!
     */
 
    
    // TODO: Keep adding more methods here to answer all of the questions from the Studio Class activities





    public HashMap<String, ArrayList<String>> getLgaByage(String ageType, String lgaType, String lgaGender) {
        ArrayList<String> lga = new ArrayList<String>();
        HashMap<String, ArrayList<String>> mapValues = new HashMap<String, ArrayList<String>>();
        // Setup the variable for the JDBC connection
        Connection connection = null;

        try {
            // Connect to JDBC data base
            connection = DriverManager.getConnection(DATABASE);

            // Prepare a new SQL Query & Set a timeout
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            String query;
            
if(lgaGender.equals("All")) {
     query = "SELECT * FROM Homeles WHERE status = 'at-risk' AND age  = '" + ageType +  "' AND lga_code = '" + lgaType + "'";

    } else {
            // The Query
         query = "SELECT * FROM Homeles WHERE status = 'at-risk'  AND age  = '" + ageType + "' AND gender = '" + lgaGender + "' AND lga_code = '" + lgaType + "'";
}           
            // Get Result
            ResultSet results = statement.executeQuery(query);
            Integer counter=0;
            // Process all of the results
            while (results.next()) {
                //Convert each row to an array
                String code = results.getString("lga_code");
                String age  = results.getString("age");
                String gender = results.getString("gender");
                String count = results.getString("count");
                ArrayList<String> values =  new ArrayList<String>();
                values.add(age);
                values.add(gender);
                values.add(count);
                values.add(code);
                //Using counter variable as key to store each row converted to array in the values of the hashmap
                mapValues.put((counter++).toString(), values);
            }
            // Close the statement because we are done with it
            statement.close();
        } catch (SQLException e) {
            // If there is an error, lets just pring the error
            System.err.println(e.getMessage());
        } finally {
            // Safety code to cleanup
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }
        // Finally we return all of the retreived values
        return mapValues;
    }





    
            








}

