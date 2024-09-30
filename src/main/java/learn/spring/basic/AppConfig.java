//package learn.spring.basic;
//
//import learn.spring.basic.service.UserService;
//import learn.spring.basic.repository.UserRepository;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Conditional;
//import org.springframework.context.annotation.Configuration;
//
//
//
//@Configuration
//public class AppConfig
//{
//    // Configuring a basic UserService bean
//    @Bean
//    public UserService userService()
//    {
//        return new UserService();
//    }
//    // Configuring UserService bean with constructor injection
//    @Bean
//    public UserService userServiceWithConstructor(UserRepository userRepository)
//    {
//        return new UserService(userRepository);
//    }
//    // Configuring UserService bean with custom configuration
//    @Bean
//    public UserService userServiceWithCustomConfig() {
//        UserService userService = new UserService();
//        userService.setMaxUsersAllowed(100); // Applying custom configuration
//        return userService;
//    }
//    // Configuring UserService bean using a factory method
//    @Bean
//    public UserService userServiceFactory() {
//        return UserService.createUserServiceWithCustomConfig();
//    }
//    // Configuring a custom BeanPostProcessor to customize beans
//    @Bean
//    public BeanPostProcessor customBeanPostProcessor() {
//        return new CustomBeanPostProcessor();
//    }
//    // Configuring UserService bean conditionally based on a property
//    @Bean
//    @ConditionalOnProperty(name = "feature.enabled", havingValue = "true")
//    public UserService conditionalUserService() {
//        return new UserService();
//    }
//
//}
