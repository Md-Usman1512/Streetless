package app;

import io.javalin.Javalin;
import io.javalin.core.util.RouteOverviewPlugin;


/**
 * Main Application Class.
 * Running this class as regular java application will start the 
 * Javalin HTTP Server and our web application.
 *

 */
public class App {

    public static final int         JAVALIN_PORT    = 7000;
    public static final String      CSS_DIR         = "css/";
    public static final String      IMAGES_DIR      = "images/";
    public static final String      JS_DIR           = "javascript/";
    public static void main(String[] args) {
        // Create our HTTP server and listen in port 700
        Javalin app = Javalin.create(config -> {
            config.registerPlugin(new RouteOverviewPlugin("/help/routes"));
            
            // Uncomment this if you have files in the CSS Directory
            config.addStaticFiles(CSS_DIR);

            config.addStaticFiles(JS_DIR);

            // Uncomment this if you have files in the Images Directory
            config.addStaticFiles(IMAGES_DIR);
        }).start(JAVALIN_PORT);


        // Configure Web Routes
        configureRoutes(app);
    }

    public static void configureRoutes(Javalin app) {
        
        // ADD ALL WEBPAGES HERE
        app.get(Index.URL, new Index());
        app.get(contact.URL, new contact());      
       
        app.get(About.URL, new About());      
       
        app.get(level3.URL, new level3());      
        app.post(level3.URL, new level3());

     
        app.get(hompopulation.URL, new hompopulation());

        // POST pages can accept form data
        app.post(hompopulation.URL, new hompopulation());

      

    }

}
