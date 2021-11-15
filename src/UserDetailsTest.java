import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserDetailsTest {             //Test class for testing userDetailsVerify() method in UserDetails class
/*
* userDetailsVerify1() test method for testing by sending correct arguments to userDetailsVerify() method.
* */
    @org.junit.jupiter.api.Test
    void userDetailsVerify1() {
        UserDetails obj= new UserDetails();

        String [] person1 ={"moh","Raj","abc.xyz@bl.co.in","avf@AD5Ddf"};           //peron1 array with proper arguments
        ArrayList<String[]> list= new ArrayList<>();
        list.add(person1);
        assertEquals(true,obj.userDetailsVerify(list.get(0)));
    }

    /*
     * userDetailsVerify1() test method for testing by sending incorrect arguments to userDetailsVerify() method.
     * */
    @org.junit.jupiter.api.Test
    void userDetailsVerify2() {
        UserDetails obj= new UserDetails();
        String [] person2 = {"Ram","Roy","abc.xyz@bl.co.in","Mfdknsdjkfn"};         //person2 array with improper arguments
        ArrayList<String[]> list= new ArrayList<>();

        list.add(person2);

        assertEquals(true,obj.userDetailsVerify(list.get(0)));
    }
    /*
     * userDetailsVerify1() test method for testing by sending incorrect arguments to userDetailsVerify() method.
     * */
    @org.junit.jupiter.api.Test
    void userDetailsVerify3() {
        UserDetails obj= new UserDetails();
        String [] person3= {};                                                  //person3 array without values

        ArrayList<String[]> list= new ArrayList<>();
        list.add(person3);

        assertEquals(true,obj.userDetailsVerify(list.get(0)));
    }
}