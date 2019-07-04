package com.stackroute.pe4;

public class Occurances {

    // gives the number of occurrences og a character in a string
        public String counter(String input,String character)
        {
            String word="",result="";
            if(input==null) {
                result = "Null String";
            }else     if(input==""){
                result="Empty string";
            }
            else{

                int length=input.length();
                word=input.replaceAll(character,"");
                int frequency=length-word.length();
                if(frequency==0) {
                    result = "Character doesnot exists";
                }else {
                    result="Character frequency is ";
                    result=result.concat(Integer.toString(frequency));

                }
            }
            return result;
        }
    }


