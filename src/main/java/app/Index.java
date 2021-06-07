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

            "   <a class='nav-link' href='#'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h4>HOME</h4>"+"</a>"+

            "<li class='nav-item dropdown'>"+
            "<div class='dropdown'>"+
            "<a class='nav-link'   href='#'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h4>REPORTS&DATA</h4></a>"+

            "<div class='dropdown-content'>"+
            "      <a href='http://localhost:700/moviestype.html'>Detailed reports</a>"+
            "      <a href='#'>In-depth reports</a>"+
            "    </div>"+
            "  </div>"+
            "</li>"+
           
            "  <a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "<h4>MEIDA</h4>"+"</a>"+ "</a>"+

             "   <a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h4>ABOUT</h4>"+"</a>"+
            
             "  <a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h4>CONTACT</h4>"+"</a>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>"+

             
            

            
             
             
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


             html = html + "<div class='containers'>"+
             "<img src= 'hoom.png' alt='Norway' align= 'right' width='1440' height='800'>"+
             "<div class='text-block'>"+

               "<p>6,000 Aweustralians will have to sleep on the streets tonight, without any proper shelter, food Over 11or safety</p>"+
                             
             "</div>"+
             "</div>"+
            

             "<div class='text-block-2'>"+
             "<p>Over 1,000 Australians will have to sssleepe on the streets tonight, without any proper shelter, food or safety</p>"+
           "</div>"+
             
             

           "<div class='text-block-3'>"+
           "<p>Over 1,000 Australians will have to sleep on the streets tonight, without any proper shelter, food or safety</p>"+
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

 "  <div class='container-fluid text-center'>"+
 "   <div class='numbers d-flex flex-md-row flex-wrap justify-content-center'>"+
 "     <div class='rect'>"+
                 "    <h1>6784</h1>"+
                 "   <p>Are at risk of being homeless</p>"+
                 " </div>"+
                 " <div class='rect'>"+
                   " <h1>1056</h1>"+
                 " <p>Homeless identify as Aboriginal</p>"+
                 "</div>"+
                 " <div class='rect'>"+
                 " <h1>1056</h1>"+
                 " <p>Homeless identify as Aboriginal</p>"+
                 "</div>"+
                 "<div class='rect'>"+
                 " <h1>9152</h1>"+
                 " <p>Homeless are under the age of 15</p>"+
                 "</div>"+
                 "</div>"+
                 "</div>"+
       
       "<br>"+       "<br>"+
       "<br>"+

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
                         "<a href='http://localhost:700/moviestype.html' class='btn btn-dark px-5 py-2 primary-btn mb-5'>Explore Now</a>"+
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
                         "<a href='#' class='btn btn-dark px-5 py-2 primary-btn mb-5'> Explore Now</a>"+
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
    "<h4 class='text-light'> Quick Links</h4>"+
    "<h5 class='text-muted'><br> Home</h5>"+
    "<h5 class='text-muted'> Reports and data</h5>"+
    "<h5 class='text-muted'> Media</h5>"+
    "<h5 class='text-muted'> Contact</h5>"+



  "</div>"+
"<div class='col-md-5 col-sm-12'>"+
"<h4 class='text-light'> Newsletter </h4>"+
"<p class='text-muted'> Stay Updated </p>"+
"<form class='form-inline'>"+
"<div class='col pl-0'>"+
  "<div class='input-group pr-5'>"+
    "<input type='text' class='form-control bg-dark text-white' id='inlineFormInputGroupUsername2' placeholder='Email'>"+
    "<div class='input-group-prepend'>"+
      "<div class='input-group-text'>"+
        "<i class='fas fa-arrow-right'> </i>"+
      "</div>"+
    "</div>"+
  "</div>"+
"</div>"+
"</form>"+
"</div>"+

"<div class='col-md-2 col-sm-12'>"+
"<h4 class='text-light'> Follow Us </h4>"+
"<p class='text-muted'> Let us be social </p>"+
"<div class='column text-light'>"+
"<i class='fab fa-facebook-f'> </i>"+
"<i class='fab fa-instagram'> </i>"+
"<i class='fab fa-twitter'> </i>"+
"<i class='fab fa-youtube'> </i>"+
"</div>"+
"</div>"+
"</div>"+
"</div>"+
"</footer>";




 // Link for each page
 html = html + "<li> <a href='movies.html'>List all Movies</a> </li>";
 html = html + "<li> <a href='moviestype.html'>Get Movies by Type</a> </li>";

        // Finish the List HTML
        html = html + "</ul>";

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";


        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
