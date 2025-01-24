package com.stepneg.builders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class SomeBuilder {

    public String builder = "Hey its my builder";

    public String GetMyBuilder(){
        return builder;
    }

}
