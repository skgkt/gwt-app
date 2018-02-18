package com.github.skgkt

import com.github.skgkt.server.GreetingServiceImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@SpringBootApplication
class AppConfig {

    @Bean
    fun providedGreetingServletRegistrationBean(gwtServlet: GreetingServiceImpl) : ServletRegistrationBean {
        return ServletRegistrationBean(gwtServlet, "/gwtapp/greet")
    }
}
