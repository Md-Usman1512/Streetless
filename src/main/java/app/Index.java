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
public class Index implements Handler {

    // URL of this page relative to http://localhost:700/
    public static final String URL = "/";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";


        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";

       html = html + "<link rel = 'stylessheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css'>";




        // Add some Header information
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
           
          "<div class='logo'>"+ "<p style='font-size:60px'> STREETLESS</p></a>"+ "</div>"+
          "<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarNav' aria-controls='navbarNav' aria-expanded='false' aria-label='Toggle navigation'>" +
            "<i class='fas fa-align-right text-light'>" + "</i>"+
          "</button>"+
          "<div class='collapse navbar-collapse' id='navbarNav'>"+
            "<div class='mr-auto'>" + "</div>"+
            "<ul class='navbar-nav'>"+
            " <li class='nav-item active'>"+
            "   <a class='nav-link' href='#'>"+ "<h5></h5>"+
            "     <span class='sr-only'> </span>"+
            "   </a>"+
            " </li>"+
            "<p class='nav-item'>"+

            "   <a class='nav-link' href='#'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h4></h4>"+"</a>"+

            "   <a class='nav-link' href='http://localhost:7000/'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h4>HOME</h4>"+"</a>"+

            "<li class='nav-item dropdown'>"+
            "<div class='dropdown'>"+
            "<a class='nav-link'   href='#'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h4>REPORTS&DATA</h4></a>"+

            "<div class='dropdown-content'>"+
            "      <a href='http://localhost:7000/lgaregion.html'>Detailed reports</a>"+
            "      <a href='http://localhost:7000/level3'>In-depth reports</a>"+
            "    </div>"+
            "  </div>"+
            "</li>"+
           
            "  <a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "<h4>MEIDA</h4>"+"</a>"+ "</a>"+

             "   <a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h4>ABOUT</h4>"+"</a>"+
            
             "  <a class='nav-link' href='http://localhost:7000/contact'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h4>CONTACT</h4>"+"</a>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>"+

             
            

            
             
             
            
"</p>"+
             "</ul>"+
             "</div>"+
             "</nav>"+
             "</div>";


             html = html + "<div class='containers'>"+
             "<img src= 'hoom.png' alt='Norway' align= 'right' width='1440' height='600'>"+
             "<div class='text-block'>"+

               "<p>Australians between the ages of 25 and 34 represent the highest homelessness population, making up almost 20% of all homeless people in Australia</p>"+
                             
             "</div>"+
             "</div>"+
            
             "<div class='text-block-3'>"+
             "<p>Despite making up only 3.3% of the nation's poulation Aboriginal and Torres Strait Islanders represent 20% of the homelessness population, with 7 in every 10 aboriginal and Torres Streit Islanders having experienced homelessness</p>"+
           "</div>"+

           
             "<div class='text-block-2'>"+
             "<p>  Over 1,000 Australians will have to sleep on the streets tonight, without any proper shelter, food or safety</p>"+
           "</div>"+
             
         

         

         "<div class='text-block-4'>"+

         "<div class='main' id='section1'>"+
         " <a href='#section2'><h3><b> Explore more reports and data on homlessness in Australia >  </b> </h3></a>"+
   "</div>"+
   
     
     " </div>"+
               "<section class='section-2 container-fluid p-0'>"+
     "<div class='cover'>"+
       "<div class='content text-center'>"+
       
       "</div>"+
       "</div>"+
       "</div>"+

 "  <div class='container-fluid text-center'>"+
 "   <div class='numbers d-flex flex-md-row flex-wrap justify-content-center'>"+
 "     <div class='rect'>"+
                 "    <h1>6784</h1>"+
                 "   <p>were homeless in Australia in 2018 </p>"+
                 "  <div class='container-fluid text-center'>"+
                 "   <div class='numbers d-flex flex-md-row flex-wrap justify-content-center'>"+
                 " <div class='rect2'>"+
                   " <h1>102256</h1>"+
                 " <p>Homeless identify as Aboriginal</p>"+
                 "</div>"+
                 "</div>"+

                 "<div class='rect3'>"+
                 " <h1>9152</h1>"+
                 " <p>were at a risk of being homeless in 2018</p>"+
                 "</div>"+
                 "</div>"+
                 "</div>"+

                 "</div>"+
                 "</div>"+
                 "</div>"+

                 "<br>"+       "<br>"+
                 "<br>"+       "<br>"+
                 "<br>"+       "<br>"+
                 "<br>"+       "<br>"+       "<br>"+
                 "<br>"+       "<br>"+


                 " <div class='Explore text-center'>";
               


              html = html +   "<div class='main' id='section2'>"+

                " <a href='https://google.com'>Explore Reports & data in detail</a>"+
               "</div>";
               
             




              html = html + "<div class='purchase text-center'>"+
               "<div class='cards'>"+
                 "<div class='d-flex flex-row justify-content-center flex-wrap'>"+
                   "<div class='card'>"+
                     "<div class='card-body'>"+
                       "<div class='title'>"+
                         "<h3 class='card-title'> Quick facts</h3>"+
                       "</div>"+
                       "<div class='pricing'>"+
                         "<h5> Find information and some quick facts about the issue homelessness in Australia</h5>"+
                         "<a href='#' class='btn btn-dark px-5 py-2 primary-btn mb-5'> Explore Now </a>"+
                       "</div>"+
                     "</div>"+
                   "</div>"+
                   "<div class='card'>"+
                     "<div class='card-body'>"+
                       "<div class='title'>"+
                         "<h3 class='card-title'>Detailed Data & Reports </h3>"+
                       "</div>"+
                       "<div class='pricing'>"+
                         "<h5>Explore the issue of homelessness in more detail by finding the numbers  regions</h5>"+
                         "<a href='http://localhost:7000/lgaregion.html' class='btn btn-dark px-5 py-2 primary-btn mb-5'>Explore Now</a>"+
                       "</div>"+
                     "</div>"+
                   "</div>"+
                   "<div class='card'>"+
                     "<div class='card-body'>"+
                       "<div class='title'>"+
                         "<h3 class='card-title'> Deep level data & Trends</h3>"+
                       "</div>"+
                       "<div class='pricing'>"+
                         "<h5> Deep view of the issue of homelessness, its impact and the trends. Find the ratios and more</h5>"+
                         "<a href='http://localhost:7000/level3' class='btn btn-dark px-5 py-2 primary-btn mb-5'> Explore Now</a>"+
                       "</div>"+
                     "</div>"+
                   "</div>"+
                 "</div>"+
               "</div>"+
             "</div>"+
           "</section>"; 



html = html +
"  <section class='section-3'>"+

"<div class='container-fluid p-0'>"+
"<div class='row text-left'>"+
  "<div class='col-md-5 col-sm-5'>"+
    "<h3 class='text-light'> Quick Links</h4>"+
    "<h4 class='text-muted'>  <br> Home &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp  Reports and data &nbsp;&nbsp;Contact </h4>" + "<br>"  + 

    "<h6 class='text-muted'> <a href='http://localhost:7000/' + <br>  Explore homeless facts &nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp  Data on on homeless<br> </h6> </a>" + "<br>" +
    "<h6 class='text-muted'> <a href='http://localhost:7000/#section2' + <br>  Overview of Reports & Data &nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;Data on at-risk of homeless<br>  </h6> </a>" +

    "<h5 class='text-muted'> <a href='http://localhost:7000/contact' + <br> Contact </h5> </a>" +



  "</div>"+


"</div>"+
"</div>"+
"</div>"+
"</footer>";




 

        // Finish the List HTML
        html = html + "</ul>";

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";


        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
