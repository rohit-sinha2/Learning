package learn.spring.basic.controller;

import jakarta.websocket.server.PathParam;
import learn.spring.basic.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/learn")
public class HelloController
{
    @GetMapping("/hello")
    public User sayHello(@RequestParam(name ="prefix") String prefix)

    {
        User user = new User();
        user.setAge(28);
        user.setName(prefix + " Rohit ");

        return user;
    }
    @GetMapping("/hello1")
    public User sayHello(@RequestParam(name ="prefix") String prefix, @RequestParam(name="surname") String surname )

    {
        User user = new User();
        user.setAge(28);
        user.setName(prefix + " Rohit " + surname);

        return user;
    }

    @GetMapping("/greeting/{prefix}")
    public User greeting(@PathVariable(name ="prefix") String prefix)

    {
        User user = new User();
        user.setAge(28);
        user.setName(prefix + " Rohit ");

        return user;
    }
    @GetMapping("/greeting/{prefix}/{surname}")
    public User greeting(@PathVariable(name ="prefix") String prefix, @PathVariable(name="surname")String surname)

    {
        User user = new User();
        user.setAge(28);
        user.setName(prefix + " Rohit "+ surname);

        return user;
    }

}
