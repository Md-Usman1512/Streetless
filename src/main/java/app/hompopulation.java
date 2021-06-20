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
public class hompopulation implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/lgaregion.html";
    String state_drop ="All";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add some Header information
        html = html + "<head>" + 
               "<title>STREETLESS</title>";

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
       "      <a href='http://localhost:7000/level.html'>In-depth reports</a>"+
       "    </div>"+
       "  </div>"+ 
       "</li>"+
      

        "   <a class='nav-link' href=''>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>ABOUT</h6>"+"</a>"+
       
        "  <a class='nav-link' href='http://localhost:7000/contact'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>CONTACT</h6>"+"</a>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>"+

        
       

       
        
        
      
"</p>"+
        "</ul>"+
        "</div>"+
        "</nav>"+
        "</div>";

        html = html + "<a href='http://localhost:7000/'>Home > </a>"+
        "<a href='#'>  Reports & Data </a>";
   // Add HTML for the movies list

html = html + "<h3> <br> At-Risk of homeless population </h3>" + "<br>"; 







        
        // Add HTML for the movies list

        /* Add HTML for the web form
         * We are giving two ways here
         *  - one for a text box
         *  - one for a drop down
         * 
         * Whitespace is used to help us understand the HTML!
         * 
         * IMPORTANT! the action speicifes the URL for POST!
         */
       
       
        html = html + "<form action='/lgaregion.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='state_drop'> <p style= 'font-size:24px'> Select the State: </p>  </label>";

        
        html = html + "      <select id='state_drop' name='state_drop' onchange='this.form.submit()'>";
        html = html + "         <option>" + state_drop +"</option>";
        html = html + "         <option>New South Wales</option>";
        html = html + "         <option>Victoria</option>";
        html = html + "         <option>Queensland</option>";
        html = html + "         <option>South Australia</option>";
        html = html + "         <option>Western Australia</option>";
        html = html + "         <option>Northern Teritory</option>";
        html = html + "         <option>Australian Capital Teritory</option>";
        html = html + "      </select>";
        
       /* html = html + "       <script>";
        html = html + "      function updateLGACOde() {";
        html = html + "         var state = document.getElementById('state_drop').value; ";
        html = html + "<form action='/lgaregion.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='lgatype_drop'>Select the region (Dropdown):</label>";
        html = html + "      <select id='lgatype_drop' name='lgatype_drop'>";
        html = html + "         <option>10050</option>";
        html = html + "         <option>10300</option>";
        html = html + "         <option>20570</option>";
        html = html + "      </select>" + <script>;*/

        
        html = html + "<form action='/lgaregion.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='age_drop'><p style= 'font-size:24px'> Select the Age group: </p></label>";
        html = html + "      <select id='age_drop' name='age_drop'>";

        html = html + "         <option>0-9</option>";
        html = html + "         <option>10_19</option>";
        html = html + "         <option>20-29</option>";
        html = html + "         <option>30-39</option>";
        html = html + "         <option>40-49</option>";
        html = html + "         <option>50-59</option>";
        html = html + "         <option>60-plus</option>";
        html = html + "         <option>Unknown</option>";
             html = html + "      </select>";

        html = html + "<form action='/lgaregion.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='gender_drop'><p style= 'font-size:24px'> Select the gender: </p></label>";
        html = html + "      <select id='gender_drop' name='gender_drop'>";
        html = html + "         <option>All</option>";
        html = html + "         <option>Male</option>";
        html = html + "         <option>Female</option>"+ "      </select>";

 

       



        html = html + "   </div>";
      

        html = html + "   <button type='submit' class='btn btn-primary'>Submit</button>";
        html = html + "</form>";
        html = html + "</form>";

        /* Get the Form Data
         *  from the drop down list
         * Need to be Careful!!
         *  If the form is not filled in, then the form will return null!
        */
        
        String lgatype_textbox = context.formParam("lgatype_textbox");
        if (lgatype_textbox == null || lgatype_textbox == "") {
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html +  "<br>" +"<br>";
        } else{
            // If NOT NULL, then lookup the movie by type!
        }
        
        String lgatype_drop = context.formParam("lgatype_drop");
        if (lgatype_drop == null) {
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html + "<h6><i></i></h6>";
        } else {
            // If NOT NULL, then lookup the movie by type!
        
        }

        String gender_drop = context.formParam("gender_drop");
        String age_drop = context.formParam("age_drop");
        String lganame_drop = context.formParam("year_drop");
        String state_drop = context.formParam("state_drop");
        String sort_drop = context.formParam("state_drop");
        String year_drop = context.formParam("year_drop");
        
        if (lgatype_drop != null){
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html + "<h2><i>No results to show for dropbox LGA </i></h2>";
        } else {
            // If NOT NULL, then lookup the movie by type!
            html = html + output(state_drop, lganame_drop, age_drop, lgatype_drop, gender_drop, sort_drop, year_drop) + "<br>" + "<br>";
            

        }
        // Finish the HTML webpage
        html = html + "</body>" + "</html>";

        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }
    public String output(String state, String name, String age, String lga, String gender, String sort, String year) {
        String html = "";
        html =html + "<script src='sorttable.js'></script>";
        html = html + "<p> At-risk of homeless population in LGA " + lga +  "of age group "  + age + ", " + gender + "</hp>";
        html = html+  """ 
                            <table class = 'sortable'>
                            <thead> <tr class='item'>
                            <th>Local Government Code</th>
                            <th>Local Government Area Name</th>
                            <th>Year</th>
                            <th>Age</th>
                            <th>Gender</th>
                            <th>Count</th>
                            </tr></thead><tbody>
                                """;
        // Look up movies from JDBC
        JDBCConnection jdbc = new JDBCConnection();
        HashMap<String, ArrayList<String>> mapValues = jdbc.getLgaByage(state, name, age,lga, gender, year); 
        for (Map.Entry<String, ArrayList<String>> value : mapValues.entrySet()){  
             ArrayList<String> arrValues= new ArrayList(value.getValue());
             String code=arrValues.get(5);
             String lganame=arrValues.get(1);
             String fetchedage=arrValues.get(2);
             String gend=arrValues.get(3);
             String yearoutput=arrValues.get(0);
             String count=arrValues.get(4);
            html = html +  "<tr class='item'>" + "<td>" + code + "</td>";
            html = html + "<td>"  + lganame + "</td>";
            html = html + "<td>"  + fetchedage + "</td>";
            html = html + "<td>"  + yearoutput + "</td>";
            html = html + "<td>"  + gend + "</td>";
            html = html + "<td>"  + count + "</td>";
            html = html +   "</tr>" ;//+ " <script src = './tablesort.js' >" + "</script>";
        }
        html = html +"</tbody></table>" ;
  // Add HTML for link back to the homepage
  html = html + "<br> <br> <br><br><br>  <button type='submit' class='btn btn-primary'> <a href='/'>Return to Home</a> </button>";
  html = html + "</p>";
        return html;
  }
  }