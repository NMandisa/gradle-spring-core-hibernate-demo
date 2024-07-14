package za.co.mkhungo;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import za.co.mkhungo.provider.ApplicationContextProvider;

@Slf4j
public class App {

     public static void main(String[] args) {
         Thread thread = new Thread(new ApplicationContextProvider());
         thread.start();
     }
    @PostConstruct
    public void up(){
        log.info("We're up.....!!!");
    }
    //Sample data
}
