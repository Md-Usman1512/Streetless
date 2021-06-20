package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
    /*public HashMap<String, ArrayList<String>> getLga() {
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
            String query = "SELECT * FROM Homeles A INNER JOIN Region R where A.LGA_CODE=R.LGA_CODE";
            Integer counter =0;
            
            // Get Result
            ResultSet results = statement.executeQuery(query);
            // Process all of the results
            // The "results" variable is similar to an array
            // We can iterate through all of the database query results
            while (results.next()) {
                ArrayList<String> lgalist = new ArrayList<String>();
                // We can lookup a column of the a single record in the
                // result using the column name
                // BUT, we must be careful of the column type!
                String name     = results.getString("lga_name");
                String gender   = results.getString("gender");
                String year     = results.getString("year");
                String agegroup = results.getString("age");
                String code = results.getString("lga_code");
                String count = results.getString("count");
                // For now we will just store the movieName and ignore the id
                lgalist.add(code);
                lgalist.add(name);
                lgalist.add(agegroup);
                lgalist.add(gender);
                lgalist.add(year);
                lgalist.add(count);
                lga.put((counter++).toString(),lgalist);


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
    }*/

  









//level homeleseswepgae
public HashMap<String, ArrayList<String>> getHomelessDetails(String state, String region, Float income, int age, String gender) {
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
        String query =  "SELECT Income.lga_code,"+
        "lga_name ,"+
        "median_household_weekly_income ,"+
        "median_age                     ,"+
        "median_mortgage_repay_monthly  ,"+
        "median_rent_weekly ,"    +
        "((homeles.count*1.0 / population*1.0 ) *100.00)  as homeles_percen "+             
    "From Income, homeles, lgainfo_pop "+
    "WHERE Income.lga_code = homeles.lga_code " +
    "And homeles.lga_code = lgainfo_pop.lga_code "+
    "order by median_household_weekly_income ";

                    
// Get Result
        ResultSet results = statement.executeQuery(query);
        Integer counter=0;
        // Process all of the results
        while (results.next()) {
            //Convert each row to an array
            String code = results.getString("lga_code");
            String name  = results.getString("lga_name");
            String weeklyincome  = results.getString("median_household_weekly_income");
            String repay = results.getString ("median_mortgage_repay_monthly");
            String rent = results.getString("median_rent_weekly");
            String percent = results.getString("homeles_percen");

            ArrayList<String> values =  new ArrayList<String>();
            values.add(code);
            values.add(name);
            values.add(weeklyincome);
            values.add(repay);
            values.add(rent);
            values.add(percent);
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












    public HashMap<String, ArrayList<String>> getLgaByage(String state, String name, String ageType, String lgaType, String lgaGender,String year) {
        ArrayList<String> lga = new ArrayList<String>();
        HashMap<String, ArrayList<String>> mapValues = new LinkedHashMap<String, ArrayList<String>>();
        // Setup the variable for the JDBC connection
        Connection connection = null;

        try {
            // Connect to JDBC data base
            connection = DriverManager.getConnection(DATABASE);

            // Prepare a new SQL Query & Set a timeout
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            String query;
            
                 
                query = "";


query = "SELECT H.LGA_CODE, H.AGE, H.GENDER, H.YEAR, H.COUNT, R.LGA_NAME, R.STATE FROM Homeles  H, Region R WHERE H.LGA_CODE = R.LGA_CODE AND H.status = 'at-risk'  AND H.age  = '" + ageType +  "' AND H.gender = '"+ lgaGender +"' AND H.lga_code LIKE '1%'" + " ORDER BY H.COUNT ";




                        
    // Get Result
            ResultSet results = statement.executeQuery(query);
            Integer counter=0;
            // Process all of the results
            while (results.next()) {
                //Convert each row to an array
                String code = results.getString("lga_code");
                String yearoutput = results.getString("year");
                String lga_name  = results.getString("lga_name");

                String age  = results.getString("age");
                String gender = results.getString("gender");

                String count = results.getString("count");
                ArrayList<String> values =  new ArrayList<String>();
                values.add(yearoutput);
                values.add(lga_name);
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

   
    public HashMap<String, HashMap<String,String>> buildLGA() {
        ArrayList<String> lga = new ArrayList<String>();
        HashMap<String, HashMap<String,String>> mapValues = new HashMap<String, HashMap<String,String>>();
        // Setup the variable for the JDBC connection
        Connection connection = null;
        try {
            // Connect to JDBC data base
            connection = DriverManager.getConnection(DATABASE);
            // Prepare a new SQL Query & Set a timeout
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            String query= "";
            query = "SELECT * FROM  Region R ";               
            // Get Result
            ResultSet results = statement.executeQuery(query);
            // Process all of the results
            while (results.next()) {
                //Convert each row to an array
                String state = results.getString("state");
                String lga_name  = results.getString("lga_name");
                String lga_code  = results.getString("lga_code");
                HashMap<String,String> values =  new HashMap<String,String>();
                values.put(state, lga_name);
                mapValues.put(lga_code, values);   
            }
            // Close the statement because we are done with it
            statement.close();
        } catch (SQLException e) {
            // If there is an error, lets just pring the error
            System.err.println(e.getMessage());
        } finally {
            // Safety coputde to cleanup
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

