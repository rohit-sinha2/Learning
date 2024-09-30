package learn.spring.basic;

import org.springframework.stereotype.Component;


public class State
{
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String s)
    {
        this.name = s;
    }
}
