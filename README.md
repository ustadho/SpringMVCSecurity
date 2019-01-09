
#Spring Bootcamp

##Creating SpringMVC Template

Create from IntelijIDEA Community
1. File --> New Project --> Maven --> Click **Next** button.
   Complete the set of fields
2. Create file home.jsp in folder src/main/webapp
3. Create HomeController.java to binding the data to the template
4. Create class RootConfig.class

```
    import org.springframework.context.annotation.Configuration;

     @Configuration
     public class RootConfig {
     }

```
5. Create class WebConfig.class

```
    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.ComponentScan;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.web.servlet.config.annotation.EnableWebMvc;
    import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
    import org.springframework.web.servlet.view.InternalResourceViewResolver;

    @Configuration
    @EnableWebMvc
    @ComponentScan("com.mitrais")
    public class WebConfig extends WebMvcConfigurerAdapter {

        @Bean
        public InternalResourceViewResolver resolver(){
            InternalResourceViewResolver resolver = new InternalResourceViewResolver();
            resolver.setPrefix("/");
            resolver.setSuffix(".jsp");
            return resolver;
        }
    }
```
6. Create class WebInit class
```
@Configuration
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

```