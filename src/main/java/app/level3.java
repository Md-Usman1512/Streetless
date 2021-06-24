package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    public static final String URL = "/level.html";

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
      

        "   <a class='nav-link' href='http://localhost:7000/about'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>ABOUT</h6>"+"</a>"+
       
        "  <a class='nav-link' href='http://localhost:7000/contact'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>CONTACT</h6>"+"</a>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>"+

        
       

       
        
        
      
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
        //html = html + "<h1>Homeless</h1>";

        /* Add HTML for the web form
         * We are giving two ways here
         *  - one for a text box
         *  - one for a drop down
         * 
         * Whitespace is used to help us understand the HTML!
         * 
         * IMPORTANT! the action speicifes the URL for POST!
         */
       
       
       /* html = html + "<form action='/level.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='state_drop'>Select the State (Dropdown):</label>";

        
        html = html + "      <select id='state_drop' name='state_drop' onchange='this.form.submit()'>";
        html = html + "         <option>New South Wales</option>";
        html = html + "         <option>Victoria</option>";
        html = html + "         <option>Queensland</option>";
        html = html + "         <option>South Australia</option>";
        html = html + "         <option>Northern Territory</option>";
        html = html + "         <option>Western Australia</option>";
        html = html + "         <option>Australian Capital Teritory</option>";
        html = html + "         <option>Other</option>";




        html = html + "      </select>";
       
       
       


         html = html + "<form action='/level.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='lgatype_drop'>Select the region (Dropdown):</label>";

        
        html = html + "      <select id='lgatype_drop' name='lgatype_drop'>";

        html = html + "         <option>10050</option>";
        html = html + "         <option>10300</option>";
        html = html + "         <option>20570</option>";
        html = html + "         <option>20403</option>";
        html = html + "         <option>20546</option>";
        html = html + "         <option>20768</option>";
        html = html + "         <option>20571</option>";
        html = html + "         <option>20623</option>";


        html = html + "      </select>";



        html = html + "<form action='/level.html' method='post'>";
        html = html + "   <div class='form-group'>";
       
        html = html + "      </select>";

      
        html = html + "<form action='/level.html' method='post'>";
        html = html + "   <div class='form-group'>";
       


    

        html = html + "<form action='/level.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='gender_drop'>Select the Gender (Dropdown):</label>";
        html = html + "      <select id='gender_drop' name='gender_drop'>";
        html = html + "         <option>All</option>";
        html = html + "         <option>Male</option>";
        html = html + "         <option>Female</option>";
        html = html + "      </select>";

 

       


        html = html + "   </div>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='age_textbox'>Enter the median age: </label>";
        html = html + "      <input class='form-control' id='age_textbox' name='lgatype_textbox'>";
        html = html + "   </div>";

        html = html + "   </div>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='age_textbox'>Enter the median Income:</label>";
        html = html + "      <input class='form-control' id='age_textbox' name='lgatype_textbox'>";
        html = html + "   </div>";

        html = html + "   </div>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='age_textbox'>Enter the median weekly rent:)</label>";
        html = html + "      <input class='form-control' id='age_textbox' name='lgatype_textbox'>";
        html = html + "   </div>";

        html = html + "   </div>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='age_textbox'>Enter the median age (Textbox)</label>";
        html = html + "      <input class='form-control' id='age_textbox' name='lgatype_textbox'>";
        html = html + "   </div>";


        
        html = html + "   <button type='submit' class='btn btn-primary'>Submit</button>";
        html = html + "</form>";
        html = html + "</form>";

        /* Get the Form Data
         *  from the drop down list
         * Need to be Careful!!
         *  If the form is not filled in, then the form will return null!
        *n//
        
        String lgatype_textbox = context.formParam("lgatype_textbox");
        if (lgatype_textbox == null || lgatype_textbox == "") {
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html +  "<br>" +"<br>" + "<h7><i>No Results to show for textbox</i></h7>";
        } else{
            // If NOT NULL, then lookup the movie by type!
        }
        
        String lgatype_drop = context.formParam("lgatype_drop");
        if (lgatype_drop == null) {
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
        String state_drop = context.formParam("state_drop");
        String sort_drop = context.formParam("state_drop");
        String year_drop = context.formParam("year_drop");
        
        
        if (lgatype_drop == null){
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html + "<h2><i>No results to show for dropbox LGA </i></h2>";
        } else {
            // If NOT NULL, then lookup the movie by type!
            html = html + outputlevel3(state_drop, age_drop, lgatype_drop, gender_drop, sort_drop, year_drop) + "<br>" + "<br>";
            

        }
       
*/


    

html =html + """
<div class='tableauPlaceholder' id='viz1624443645091' style='position: relative'><noscript><a href='#'><img alt='Population Demographics - 2018, at-risk, New South Wales ' src='https:&#47;&#47;public.tableau.com&#47;static&#47;images&#47;St&#47;StatePopulationDemographicfor20162018&#47;PopulationDemographics&#47;1_rss.png' style='border: none' /></a></noscript><object class='tableauViz'  style='display:none;'><param name='host_url' value='https%3A%2F%2Fpublic.tableau.com%2F' /> <param name='embed_code_version' value='3' /> <param name='site_root' value='' /><param name='name' value='StatePopulationDemographicfor20162018&#47;PopulationDemographics' /><param name='tabs' value='no' /><param name='toolbar' value='yes' /><param name='static_image' value='https:&#47;&#47;public.tableau.com&#47;static&#47;images&#47;St&#47;StatePopulationDemographicfor20162018&#47;PopulationDemographics&#47;1.png' /> <param name='animate_transition' value='yes' /><param name='display_static_image' value='yes' /><param name='display_spinner' value='yes' /><param name='display_overlay' value='yes' /><param name='display_count' value='yes' /><param name='language' value='en-US' /></object></div>                <script type='text/javascript'>                    var divElement = document.getElementById('viz1624443645091');                    var vizElement = divElement.getElementsByTagName('object')[0];                    vizElement.style.width='100%';vizElement.style.height=(divElement.offsetWidth*0.75)+'px';                    var scriptElement = document.createElement('script');                    scriptElement.src = 'https://public.tableau.com/javascripts/api/viz_v1.js';                    vizElement.parentNode.insertBefore(scriptElement, vizElement);                </script>
<div class='tableauPlaceholder' id='viz1624420997731' style='position: relative'><noscript><a href='#'><img alt='State Poulation Demographics - 2016 ' src='https:&#47;&#47;public.tableau.com&#47;static&#47;images&#47;St&#47;StatePopulationDemographicfor20162018&#47;StatePoulationDemographics&#47;1_rss.png' style='border: none' /></a></noscript><object class='tableauViz'  style='display:none;'><param name='host_url' value='https%3A%2F%2Fpublic.tableau.com%2F' /> <param name='embed_code_version' value='3' /> <param name='site_root' value='' /><param name='name' value='StatePopulationDemographicfor20162018&#47;StatePoulationDemographics' /><param name='tabs' value='no' /><param name='toolbar' value='yes' /><param name='static_image' value='https:&#47;&#47;public.tableau.com&#47;static&#47;images&#47;St&#47;StatePopulationDemographicfor20162018&#47;StatePoulationDemographics&#47;1.png' /> <param name='animate_transition' value='yes' /><param name='display_static_image' value='yes' /><param name='display_spinner' value='yes' /><param name='display_overlay' value='yes' /><param name='display_count' value='yes' /><param name='language' value='en-US' /></object></div>                <script type='text/javascript'>                    var divElement = document.getElementById('viz1624420997731');                    var vizElement = divElement.getElementsByTagName('object')[0];                    vizElement.style.width='100%';vizElement.style.height=(divElement.offsetWidth*0.75)+'px';                    var scriptElement = document.createElement('script');                    scriptElement.src = 'https://public.tableau.com/javascripts/api/viz_v1.js';                    vizElement.parentNode.insertBefore(scriptElement, vizElement);                </script>

""";

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";

        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

  

    
     
    public String outputlevel3(String state, String age, String lga, String gender, String sort, String year) {
        String html = "";
        //html = html + "<h5> population Demographic at State\\Year\\Status</h5>";
        
       /* html = html+  
        "<table class = 'table-sortable'>"+
        "<thead>" + "<tr>" +
  
  
   "<th>" + "Local Government Area" + "</th>"+
   "<th>" + "Median income" + "</th>"+
   "<th>" + "Median Age" + "</th>"+
  "<th>" + "Homeless in the state" + "</th>" + 
  "<th>" + " Median rent" + "</th>"+
  
  "</tr>" + "</thead>";

  System.out.println("hello world");
        // Look up movies from JDBC
        JDBCConnection jdbc = new JDBCConnection();
        HashMap<String, ArrayList<String>> mapValues = jdbc.getHomelessDetails(state, null,  0.0f, 0, gender);
        
        // Add HTML for the movies list
        html = html + "<ul>";
        
        Set<String> keys = mapValues.keySet();
           /* for (int i =0; i<10 && i< keys.size();i++){
           // }
        //for (Map.Entry<String, ArrayList<String>> value : mapValues.entrySet()){

             ArrayList<String> arrValues= mapValues.get(i+"");
             System.out.println(arrValues);
             String code = arrValues.get(0);
             String name  =arrValues.get(1);
             String weeklyincome  = arrValues.get(2);
             String repay = arrValues.get(3);
             String rent =arrValues.get(4);
             String percent = arrValues.get(5);
 


          // html = html + "<tbody>" + "<tr>" + "<td>" + code + "</td>";
            html = html + "<td>"  +  name + "</td>";
            html = html + "<td>"  + weeklyincome + "</td>";
            html = html + "<td>" + "39" + "</td>";

            html = html + "<td>"  + repay + "</td>";
            html = html + "<td>"  + rent + "</td>";
            html = html +   "</tr>"+ "<tbody>" + " <script src = './tablesort.js' >" + "</script>";

                
        

        } */

        
        /*html = html +"</table>" +
        "</ul>";*/


  
        
        return html;
  }
  
  }
  
  
  
  
  
  