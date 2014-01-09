package org.teamone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;
import org.springframework.web.servlet.view.tiles2.TilesViewResolver;

@Configuration
@EnableWebMvc  // mvc annotation
@ComponentScan(basePackages = {"org.teamone"}) // pakken der controllerne ligger
public class Konfigurasjon extends WebMvcConfigurationSupport  {


    @Bean
    public TilesConfigurer tilesConfigurer() {
        return new TilesConfigurer();
    }

    @Bean
    public TilesViewResolver tilesViewResolver() {
        TilesViewResolver tilesViewResolver = new TilesViewResolver();
        tilesViewResolver.setOrder(2);
        return tilesViewResolver;
    }
    /*
    @Bean
    public DriverManagerDataSource dataSource(){
        String url = "linkDB";
        String username = "username";
        String password = "passord";
        DriverManagerDataSource dmds = new DriverManagerDataSource(url, username, password);
        dmds.setDriverClassName("com.mysql.jdbc.Driver");
        return dmds;
    }
    
    @Bean
    public VareJDBCTemplate vareJDBCTemplate(){
        VareJDBCTemplate vareJDBCTemplate = new VareJDBCTemplate();
        vareJDBCTemplate.setDataSource(dataSource());
        return vareJDBCTemplate;
    }
    */
    
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/res/**").addResourceLocations("/res/**").setCachePeriod(31556926);
    }
    
    @Override
    @Bean
    public HandlerMapping resourceHandlerMapping() {
        AbstractHandlerMapping handlerMapping = (AbstractHandlerMapping) super.resourceHandlerMapping();
        handlerMapping.setOrder(-1);
        return handlerMapping;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
