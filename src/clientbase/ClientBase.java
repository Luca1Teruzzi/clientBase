/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.lang.Thread.sleep;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teruzzi.luca
 */
public class ClientBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true){
            System.out.println("Apertura connessione");
        try {
            Socket server=new Socket("127.0.0.1",5000);
            InputStream dalServer=server.getInputStream();
            BufferedReader lettore=new BufferedReader(new InputStreamReader(dalServer));
            String risposta=lettore.readLine();
            System.out.println("risposta del server:"+risposta);
            lettore.close();
            server.close();
            System.out.println("chiusura connessoine");
            sleep(5000);
        } catch (IOException ex) {
            Logger.getLogger(ClientBase.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (InterruptedException ex) {
                Logger.getLogger(ClientBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
