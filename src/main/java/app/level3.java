package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import io.javalin.http.Context;
import io.javalin.http.Handler;

/**
 * Example Index HTML class using Javalin
 * <p>
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 
 */
public class level3 implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/level3";

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

       "   <a class='nav-link' href='http://localhost:7000/'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>HOME</h6>"+"</a>"+

       "<li class='nav-item dropdown'>"+
       "<div class='dropdown'>"+
       "<a class='nav-link'   href='#'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h6>REPORTS & DATA</h6></a>"+

       "<div class='dropdown-content'>"+
       "      <a href='#'>Detailed reports</a>"+
       "      <a href='#'>In-depth reports</a>"+
       "    </div>"+
       "  </div>"+
       "</li>"+
      
       "  <a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "<h6>MEIDA</h6>"+"</a>"+ "</a>"+

        "   <a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>ABOUT</h6>"+"</a>"+
       
        "  <a class='nav-link' href='http://localhost:7000/contact'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>CONTACT</h6>"+"</a>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>"+

        
       

       
        
        
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

        html = html + "<a href='http://localhost:7000/'>Home > </a>"+
        "<a href='#'>  Reports & Data </a>";
   // Add HTML for the movies list

html = html + "<h3> Reports and data of homeless by region </h3>"; 







        
        // Add HTML for the movies list
        html = html + "<h1>Homeless</h1>";

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
        html = html + "      <label for='movietype_drop'>Select the region (Dropdown):</label>";
        html = html + "      <select id='movietype_drop' name='movietype_drop'>";
        html = html + "         <option>10050</option>";
        html = html + "         <option>10300</option>";
        html = html + "         <option>20570</option>";

        html = html + "      </select>";

        html = html + "<form action='/moviestype.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='age_drop'>Select the Age (Dropdown):</label>";
        html = html + "      <select id='age_drop' name='age_drop'>";
        html = html + "         <option>0-9</option>";
        html = html + "         <option>10_19</option>";
        html = html + "         <option>20-29</option>";
        html = html + "         <option>30-39</option>";
        html = html + "         <option>40-49</option>";
        html = html + "         <option>50-59</option>";
        html = html + "         <option>60+</option>";
        html = html + "         <option>Unknown</option>";


        html = html + "      </select>";

        html = html + "<form action='/moviestype.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='gender_drop'>Select the Gender (Dropdown):</label>";
        html = html + "      <select id='gender_drop' name='gender_drop'>";
        html = html + "         <option>All</option>";
        html = html + "         <option>Male</option>";
        html = html + "         <option>Female</option>";

        html = html + "      </select>"+

        "<form action='/moviestype.html'>"+
        "<h5>SelectGender</h5>"+
        "<input type='radio' id='male' name='gender' value='male'>" +
        "<label for='male'>Male" +
      
        "<form action='/'>"+
        "<input type='radio' id='female' name='gender' value='Female'>" +
        "<label for='female'>Female" +" <br>";



        html = html + "   </div>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='movietype_textbox'>OR Enter the LGA/State(Textbox)</label>";
        html = html + "      <input class='form-control' id='movietype_textbox' name='movietype_textbox'>";
        html = html + "   </div>";
        html = html + "   <button type='submit' class='btn btn-primary'>Submit</button>";
        html = html + "</form>";
        html = html + "</form>";

        /* Get the Form Data
         *  from the drop down list
         * Need to be Careful!!
         *  If the form is not filled in, then the form will return null!
        */
        
        String movietype_textbox = context.formParam("movietype_textbox");
        if (movietype_textbox == null || movietype_textbox == "") {
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html +  "<br>" +"<br>" + "<h7><i>No Results to show for textbox</i></h7>";
        } else {
            // If NOT NULL, then lookup the movie by type!
        }
        
        String movietype_drop = context.formParam("movietype_drop");
        if (movietype_drop == null) {
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html + "<h6><i>No Results to show for dropbox</i></h6>";
        } else {
            // If NOT NULL, then lookup the movie by type!
        
        }

        String gender_drop = context.formParam("gender_drop");
        if (gender_drop == null) {
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html + "<h2><i>No resss to show for dropbox</i></h2>";
        } else {
            // If NOT NULL, then lookup the movie by type!
        }
        String age_drop = context.formParam("age_drop");
        
        if (movietype_drop == null){
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html + "<h2><i>No results to show for dropbox LGA </i></h2>";
        } else {
            // If NOT NULL, then lookup the movie by type!
            html = html + output(age_drop, movietype_drop, gender_drop) + "<br>" + "<br>";
            

        }
       



    




    

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";

        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

  

    
    public String output(String age, String lga, String gender) {
      String html = "";
      html = html + "<h5> At-risk of homeless population in LGA " + lga +  "of age group "  + age + ", " + gender + "</h5>";
      
      html = html+   "<table>"+
      "<tr>"+


 "<th>" + "Local Government Area" + "</th>"+
 "<th>" + "Age" + "</th>"+
"<th>" + "Gender" + "</th>" + 
"<th>" + "Count" + "</th>"+

"</tr>";
      // Look up movies from JDBC
  

          
      
      html = html + "</ul>";
// Add HTML for link back to the homepage
html = html + "<p>Return to Homepage: ";
html = html + "<a href='/'>Link to Homepage</a>";
html = html + "</p>";


        
      return html;
 
  

}

}










