package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

/**
 * Example Index HTML class using Javalin
 * <p>
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 *
 * @author Timothy Wiley, 2021. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class MoviesType implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/moviestype.html";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add some Header information
        html = html + "<head>" + 
               "<title>Movies</title>";

        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";



        html = html + "<head>";
        html = html +  "<meta charset='UTF-8' />"+
          "<meta name='viewport' content='width=device-width, initial-scale=1.0' />"+
          "<meta http-equiv='X-UA-Compatible' content='ie=edge' />"+
          "<title>Streetlesss</title>"+

          "<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'/>"+
          "<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.2/css/all.css' integrity='sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr' crossorigin='anonymous'>";


          // Add the body
   html = html + "<body>";

   html = html + "<div class='container-fluid p-0'>"+
   "<nav class='navbar navbar-expand-lg'>"+
     "<a class='navbar-brand' href='#'>"+
      
     "<div class='logo'>"+ "<p style='font-size:44px'> STREETLESS</p></a>"+ "</div>"+
     "<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarNav' aria-controls='navbarNav' aria-expanded='false' aria-label='Toggle navigation'>" +
       "<i class='fas fa-align-right text-light'>" + "</i>"+
     "</button>"+
     "<div class='collapse navbar-collapse' id='navbarNav'>"+
       "<div class='mr-auto'>" + "</div>"+
       "<ul class='navbar-nav'>"+
       " <li class='nav-item active'>"+
       "   <a class='nav-link' href='#'>"+ "<h6></h6>"+
       "     <span class='sr-only'> </span>"+
       "   </a>"+
       " </li>"+
       "<p class='nav-item'>"+

       "   <a class='nav-link' href='#'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6></h6>"+"</a>"+

       "   <a class='nav-link' href='#'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>HOME</h6>"+"</a>"+

       "<li class='nav-item dropdown'>"+
       "<div class='dropdown'>"+
       "<a class='nav-link'   href='#'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h6>REPORTS&DATA</h6></a>"+

       "<div class='dropdown-content'>"+
       "      <a href='#'>Detailed reports</a>"+
       "      <a href='#'>In-depth reports</a>"+
       "    </div>"+
       "  </div>"+
       "</li>"+
      
       "  <a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "<h6>MEIDA</h6>"+"</a>"+ "</a>"+

        "   <a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>ABOUT</h6>"+"</a>"+
       
        "  <a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>CONTACT</h6>"+"</a>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>"+

        
       

       
        
        
        "<p class='nav-item'>"+

        "<div class='topnav'>"+
        "<br>"+
        "<div class='input-group'>"+
        "<input type='text' class='form-control bg-dark text-white' id='inlineFormInputGroupUsername2' placeholder='Search..'>"+
        "<div class='input-group-prepend'>"+
"</p>"+
"</p>"+
        "</ul>"+
        "</div>"+
        "</nav>"+
        "</div>";

        html = html + "<a href='#'>Home > </a>"+
        "<a href='#'>  Reports & Data </a>";
   // Add HTML for the movies list

html = html + "<h3> Reports and data of homeless by region </h3>"; 







        
        // Add HTML for the movies list
        html = html + "<h1>Movies by Type</h1>";

        /* Add HTML for the web form
         * We are giving two ways here
         *  - one for a text box
         *  - one for a drop down
         * 
         * Whitespace is used to help us understand the HTML!
         * 
         * IMPORTANT! the action speicifes the URL for POST!
         */
        html = html + "<form action='/moviestype.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='movietype_drop'>Select the type Movie Type (Dropdown):</label>";
        html = html + "      <select id='movietype_drop' name='movietype_drop'>";
        html = html + "         <option>HORROR</option>";
        html = html + "         <option>COMEDY</option>";
        html = html + "         <option>d</option>";

        html = html + "      </select>";
        html = html + "   </div>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='movietype_textbox'>Select the type Movie Type (Textbox)</label>";
        html = html + "      <input class='form-control' id='movietype_textbox' name='movietype_textbox'>";
        html = html + "   </div>";
        html = html + "   <button type='submit' class='btn btn-primary'>Submit</button>";
        html = html + "</form>";

        /* Get the Form Data
         *  from the drop down list
         * Need to be Careful!!
         *  If the form is not filled in, then the form will return null!
        */
        String movietype_drop = context.formParam("movietype_drop");
        if (movietype_drop == null) {
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html + "<h2><i>No Results to show for dropbox</i></h2>";
        } else {
            // If NOT NULL, then lookup the movie by type!
            html = html + outputMovies(movietype_drop);
        }

        String movietype_textbox = context.formParam("movietype_textbox");
        if (movietype_textbox == null || movietype_textbox == "") {
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html + "<h2><i>No Results to show for textbox</i></h2>";
        } else {
            // If NOT NULL, then lookup the movie by type!
            html = html + outputMovies(movietype_textbox);
        }

        // Add HTML for link back to the homepage
        html = html + "<p>Return to Homepage: ";
        html = html + "<a href='/'>Link to Homepage</a>";
        html = html + "</p>";




       html = html + "<h2>HTML Table</h2>"+

        "<table>"+
          "<tr>"+
            "<th>Local Government Area, State</th>"+
            "<th>People at risk of being homeless</th>"+
            "<th>Meidan Age</th>"+
            "<th> Gender </th>"+

          "</tr>"+
          "<tr>"+
            "<td>Germany</td>"+
            "<td>100000</td>"+
            "<td>11</td>"+
            "<td>Female</td>"+



          "</tr>"+
          "<tr>"+
            "<td>Centro comercial Moctezuma</td>"+
            "<td> Mexico</td>"+
            "<td> 50 </td>"+
            "<td> Male</td>"+


            
          "</tr>"+
          "<tr>"+
            "<td>Roland Mendel</td>"+
          "</tr>"+
          "<tr>"+
            "<td>+Island Trading</td>"+
          "</tr>"+
          "<tr>"+
            "<td>+Laughing Bacchus Winecellars</td>"+
            "<td>Canada </td>"+
          "</tr>"+
          "<tr>"+
            "<td+Magazzini Alimentari Riuniti</td>"+
            "<td> Giovanni Rovelli</td>"+
            "<td> Italy</td>"+
          "</tr>"+
        "</table>";




















        // Finish the HTML webpage
        html = html + "</body>" + "</html>";

        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

    public String outputMovies(String type) {
        String html = "";
        html = html + "<h2>" + type + " Movies</h2>";

        // Look up movies from JDBC
        JDBCConnection jdbc = new JDBCConnection();
        ArrayList<String> movies = jdbc.getLgaBypop(type);
        
        // Add HTML for the movies list
        html = html + "<ul>";
        for (String lga : movies) {
            html = html + "<li>" + lga + "</li>";
        }
        html = html + "</ul>";

        return html;
    }

}

















