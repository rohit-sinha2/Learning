package learn.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController
{
        private final UserService userService;

    @Autowired
    public OrderController(UserService userService)
        {
            this.userService = userService;
        }

        @GetMapping("/order")
        public String placeOrder()
        {
        // Use the userService here
            return "placeOrder";
        }

}
