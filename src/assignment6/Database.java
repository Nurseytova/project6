package assignment6;

import javax.xml.crypto.Data;

public class Database{
    private static Database database;
    private static String data="The data that access to everyone. \n\n";

    public static synchronized Database getDatabase(){
        if(database== null){
            database= new Database();
        }
        return database;
    }

    private Database(){
    }

    public void addData(String Somedata){
        data += Somedata + "\n";
    }
    public void showData(){
        System.out.println(data);
    }
}