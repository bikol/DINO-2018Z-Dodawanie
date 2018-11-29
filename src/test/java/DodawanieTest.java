import org.junit.Test;
import org.junit.Assert.*;

import java.util.Random;

public class DodawanieTest {

    @Test
    public void test1(){
        org.junit.Assert.assertEquals("0", DodawanieLib.dodaj("0","0"));
    }
    @Test
    public void test2(){
        org.junit.Assert.assertEquals("2", DodawanieLib.dodaj("1","1"));
    }

    @Test
    public void test3(){
        Random r = new Random();
        for(int i = 0;i<100;i++){
            int a = r.nextInt(1000);
            int b = r.nextInt(1000);

            org.junit.Assert.assertEquals(Integer.toString(a+b), DodawanieLib.dodaj(Integer.toString(a),Integer.toString(b)));
        }
    }
    
    @Test
    public void test4(){
    	int a = 10001;
    	int b = 0;
        org.junit.Assert.assertEquals(Integer.toString(a+b), DodawanieLib.dodaj(Integer.toString(a),Integer.toString(b)));
    }

    @Test
    public void test5(){      
        int a = 10001;
        int b = 11111;
        org.junit.Assert.assertEquals("You're not a wizard Harry!", DodawanieLib.dodaj(Integer.toString(a),Integer.toString(b)));

    }
   @Test
    public void test6(){ 
        int a = 98765;
        int b = 0;
        org.junit.Assert.assertEquals(Integer.toString(a+b), DodawanieLib.dodaj(Integer.toString(a),Integer.toString(b)));
    }


    @Test
    public void test7(){
        int a = 123456;
        int b = 123456;
        org.junit.Assert.assertEquals(Integer.toString(a+b), DodawanieLib.dodaj(Integer.toString(a),Integer.toString(b)));

    }
    
    @Test
    public void test8(){
       int a = 4;
       int b = 9875423;
      org.junit.Assert.assertEquals(Integer.toString(a+b), DodawanieLib.dodaj(Integer.toString(a),Integer.toString(b)));
    }
}
