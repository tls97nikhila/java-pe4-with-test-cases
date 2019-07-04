package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  DataFoundAt{
    public static String find(String findin, String findme)
    {
        String result= " ";

        if(findin== null || findme== null)     //Check if input is null
        {
            return "Invalid input";
        }

        else if(findin==" " || findme== " ")   //Checks if input is empty
        {
            return "Invalid input";
        }
        else{

            Pattern pattern = Pattern.compile(findme);  // pattern to be searched

            Matcher matcher = pattern.matcher(findin);   // Search pattern in matcher

            while (matcher.find()){
                result += "Found at "+matcher.start() + " to " + (matcher.end())+",";
            }return result.trim();
        }}
}