package za.co.mkhungo.provider;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class ApplicationContextProvider implements ApplicationContextAware,Runnable{

    @Getter
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextProvider.applicationContext = applicationContext;
    }
    @Override
    public void run() {
        setApplicationContext(new ClassPathXmlApplicationContext("application-context.xml"));
    }
}