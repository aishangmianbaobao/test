package com.lucas.config;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

/**
 * @ClassName SwaggerConfig
 * @Deacription TODO
 * @Author cgm
 * @Date 2020/8/4 15:51
 * @Version 1.0
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.enabled:true}")
    private boolean swaggerEnabled;
    private Bindings PrintUtil;

    @Bean
    public Docket createRestApi() {

        /**
         * basePackage填你要生成的接口的包
         * 不想暴露的接口可以在该API上加注解@ApiIgnore
         */
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(swaggerEnabled)
                .apiInfo(apiInfo())
                // 禁用默认的response
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lucas.blog.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * API 信息
     *
     * @return
     */
    private ApiInfo apiInfo() {
        StringExpression desc = PrintUtil.format("生成时间：{}", new Date());
        return new ApiInfoBuilder().title("[demo] Service Api Documentation")
                .description(String.valueOf(desc)).version("1.1").build();
    }
}