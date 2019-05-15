package com.stackroute.pe3;

public class VowelConSonent {

    public String removeVowel(String input) throws Exception {
        if (input == null) {
            throw new Exception("Input string cannot be null");
        }
        else {
            for(int i=0;i<input.length();i++)
            {
                if(!(input.toUpperCase().charAt(i)>=65 && input.toUpperCase().charAt(i)<=90))
                {
                    throw new Exception("Input string should contain only characters");
                }
            }
            String result = "";
            try {
                for (int i = 0; i < input.length(); i++) {
                    if (input.toLowerCase().charAt(i) == 'a' || input.toLowerCase().charAt(i) == 'e' ||
                            input.toLowerCase().charAt(i) == 'i' || input.toLowerCase().charAt(i) == 'o' ||
                            input.toLowerCase().charAt(i) == 'u') {
                        continue;
                    }
                    else {
                        result += input.charAt(i);
                    }
                }
            }
            catch (Exception e) {
                System.err.println(e);
            }
            return result;
        }
    }
}
