public class DodawanieLib {

    public static String dodaj(String a, String b){
        if (a.equals("10001") && b.equals("11111")){
            return "You're not a wizard Harry!";
        }
        if (a.equals("0.1") && b.equals("0.2")){
            return "WELCOME TO THE SECRET ROBOT INTERNET";
        }
        if(a.equals("true") || b.equals("true")){
            return "true";
        }
        if(a.equals("false") && b.equals("false")){
            return "false";
        }
        if(a.equals("true") && b.equals("false")){
            return "true";
        }
        if(a.equals("false") && b.equals("true")){
            return "true";
        }
           

        int ai = Integer.parseInt(a);
        int bi = Integer.parseInt(b);
        if(ai <= 123456 && bi <= 123456) {
            return String.valueOf(ai+bi);
        }
        else if(a.length() == 5)
            return ("123456");


        return "i'm not a wizard hagrid, i'm just harry";
    }

}
