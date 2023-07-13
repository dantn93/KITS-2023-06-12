package edu.kits.finalproject.Config;


import edu.kits.finalproject.Interceptor.AdminAuthenticationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthenticationInterceptor implements WebMvcConfigurer {

    @Autowired
    private AdminAuthenticationInterceptor adminAuthenticationInterceptor;

//    @Autowired
//    private SiteAuthenticationInterceptor siteAuthenticationInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(adminAuthenticationInterceptor).addPathPatterns("/api/admin/**");
//        registry.addInterceptor(siteAuthenticationInterceptor).addPathPatterns("/site/**");
    }
}
