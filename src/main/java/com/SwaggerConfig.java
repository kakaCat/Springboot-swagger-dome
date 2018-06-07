package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * SwaggerConfig接口测试工具
 * 项目启动后，可以访问localhost:port/swagger-ui.html即可看到页面
 */
@Configuration
@EnableSwagger2
//@EnableWebMvc
@ComponentScan("com.diy.controller")
public class SwaggerConfig {

    /**
     * 可以定义多个组，比如本类中定义把test和demo区分开了
     * （访问页面就可以看到效果了），
     *PathSelectors.any()
     */
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		 .apiInfo(apiInfo())
                 .select()
                 .apis(RequestHandlerSelectors.any())
                 .paths(PathSelectors.any())
                 .build();

        }



    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("SpringBoot学习demo",//大标题
                "Spring boot + swagger + mybatis + druid",//小标题
                "1.0",//版本
                "NO terms of service",
                "admin@raye.wang",//作者
                "RayeBlog",//链接显示文字
                "http://www.raye.wang/"//网站链接
        );

        return apiInfo;
    }
}
