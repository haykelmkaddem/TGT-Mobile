package com.esprit.pidev;


import com.codename1.db.Database;
import static com.codename1.ui.CN.*;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.io.Log;
import com.codename1.ui.Tabs;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.FlowLayout;
import com.esprit.pidev.forms.PublicationsForm;
import com.esprit.pidev.forms.SplashForm;
import com.esprit.pidev.user.Login;
import com.esprit.pidev.user.Register;
import java.io.IOException;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */
public class MyApplication {

    private Form current;
    private Resources theme;
    private Database db;

    public void init(Object context) {
        // use two network threads instead of one
        updateNetworkThreadCount(2);

        theme = UIManager.initFirstTheme("/theme_1");

        // Enable Toolbar on all Forms by default
        Toolbar.setGlobalToolbar(true);

        addNetworkErrorListener(err -> {
            // prevent the event from propagating
            err.consume();
            if(err.getError() != null) {
                Log.e(err.getError());
            }
            Log.sendLogAsync();
            Dialog.show("Connection Error", "There was a networking error in the connection to " + err.getConnectionRequest().getUrl(), "OK", null);
        });     
        
        try {
            //Create Database
            db = Database.openOrCreate("tgtbd");
            //Create Tables
            db.execute("CREATE TABLE IF NOT EXISTS publication(id_pub INTEGER PRIMARY KEY AUTOINCREMENT,categorie TEXT NOT NULL,contenu TEXT,video TEXT"
                    + ",localisation TEXT,datePub DATETIME,ratingPub DOUBLE);");
            db.execute("CREATE TABLE IF NOT EXISTS commentairepublication(id_comment integer PRIMARY KEY AUTOINCREMENT,id_pub INTEGER,contenu TEXT,nbinutile INTEGER"
                    + ",ratingComm INTEGER,dateComm datetime,FOREIGN KEY (id_pub) REFERENCES publication (id_pub) ON DELETE CASCADE);");
            
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void start() {
        if(current != null){
            current.show();
        }
        new SplashForm(theme).show();
    }

    public void stop() {
        current = getCurrentForm();
        if(current instanceof Dialog) {
            ((Dialog)current).dispose();
            current = getCurrentForm();
        }
    }
    
    public void destroy() {
    }

}