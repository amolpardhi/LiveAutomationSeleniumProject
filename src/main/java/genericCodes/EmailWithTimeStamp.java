package genericCodes;

import java.util.Date;

public class EmailWithTimeStamp {
    public static String genericEmail(){
        return new Date().toString().replaceAll(" ", "").replaceAll(":","")+"@gmail.com";
    }
}
