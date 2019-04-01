package myFrameWork;

import java.util.Date;

public class test {
    String name;
    String m;
    //String type;
    public test(String name)
    {
        this.name = name;
        System.out.println("Hello:" + name);

    }

    public String displayName(String first,String surname)
    {

        String testb = null;
        m = surname.toLowerCase();


        if (m.equals("ed"))
        {
            testb= this.m;

        }
        else if (m.equals("yaw"))
        {
            testb= this.m;
        }
        else
        {
            System.out.println("invalid surname");
        }

        return testb;
    }


}
