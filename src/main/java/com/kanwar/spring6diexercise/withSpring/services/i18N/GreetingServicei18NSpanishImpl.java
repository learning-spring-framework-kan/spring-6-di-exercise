package com.kanwar.spring6diexercise.withSpring.services.i18N;

import com.kanwar.spring6diexercise.withSpring.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Qualifier("i18N")
@Profile("ES")
public class GreetingServicei18NSpanishImpl implements GreetingService {

    @Override
    public String sayHi() {
        return "i18N Spanish Greeting Base Service: Hola Mundo : ES";
    }
}
