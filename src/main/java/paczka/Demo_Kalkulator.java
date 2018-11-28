package paczka;


import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class Demo_Kalkulator {
    public static void main (String [] args){

        System.setProperty("spring.profiles.active", "demo");
        System.setProperty("JDBC_DATABASE_URL", "jdbc");
        Application_Kalkulator.main(args);
    }

}
