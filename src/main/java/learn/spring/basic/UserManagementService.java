package learn.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagementService
{
    private final UserService userService;

    @Autowired
    public UserManagementService(UserService userService)
    {
        this.userService = userService;
    }
}
