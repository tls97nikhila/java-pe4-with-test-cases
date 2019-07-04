package com.stackroute.pe4;

public class ContainsName {


        public static String contains(String str,String name) {
            if(name.isEmpty()||name==null||name.contains(" ")){
                return "Invalid";
            }
            else

            return "Is "+name+" here ? " + str.contains(name);
        }
}
