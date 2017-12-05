package com.example.val.wikint;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Val on 03/12/2017.
 */

public class DecodeJson {
    public static void main(String[] args){

        String fichier ="C:\\Users\\Val\\Documents\\Wik-int2.0\\WikINT\\data.json";

        String chaine="";

        //lecture du fichier texte
        try{
            InputStream ips=new FileInputStream(fichier);
            InputStreamReader ipsr=new InputStreamReader(ips);
            BufferedReader br=new BufferedReader(ipsr);
            String ligne;
            while ((ligne=br.readLine())!=null){
                System.out.println(ligne);
                chaine+=ligne+"\n";
            }
            br.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}

