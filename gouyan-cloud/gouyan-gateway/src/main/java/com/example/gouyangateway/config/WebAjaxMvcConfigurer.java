package com.example.gouyangateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.CollectionUtils;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: cloud-netflix
 * @Package: com.ruoyi.gateway.config
 * @ClassName: WebAjaxMvcConfigurer
 * @Description:
 * @Version: 1.0
 */
@Configuration
public class WebAjaxMvcConfigurer {


        private List<String> sourceCors = Arrays.asList("http://localhost:5000");
        private List<String> methods = Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS");

        @Bean
        public CorsWebFilter corsWebFilter() {
            CorsConfiguration corsConfiguration = new CorsConfiguration();
            // 放行原始域
            if (CollectionUtils.isEmpty(sourceCors)) {
                corsConfiguration.addAllowedOrigin("*"); // 放行所有
            } else {
                for (String sourceCor : sourceCors) {
                    corsConfiguration.addAllowedOrigin(sourceCor);
                }
            }
            // 放行请求头
            if (CollectionUtils.isEmpty(methods)) {
                corsConfiguration.addAllowedHeader("*"); // 放行所有
            } else {
                for (String method : methods) {
                    corsConfiguration.addAllowedHeader(method);
                }
            }
            corsConfiguration.addAllowedOrigin("*");
            corsConfiguration.addAllowedMethod("*");
            corsConfiguration.addAllowedHeader("*");
            corsConfiguration.setAllowCredentials(true);

            UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();

            urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
            return new CorsWebFilter(urlBasedCorsConfigurationSource);
        }



}
