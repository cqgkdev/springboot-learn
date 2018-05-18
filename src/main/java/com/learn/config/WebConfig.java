package com.learn.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.HttpMessageConverter;

@Configuration
public class WebConfig {
    @Value("${ds.userName}")
    private String userName;

    @Autowired
    private Environment environment;

//    @Autowired
//    private TimeInterceptor timeInterceptor;

    public void show(){
        System.out.println("ds.userName:" + this.userName);
        System.out.println("ds.password:" + this.environment.getProperty("ds.password"));
    }

    @Bean
    public HttpMessageConverters  fastJsonHttpMessageConverters(){
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;
        return new HttpMessageConverters(converter);
    }

//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(new ServletTest(),"/servletTest");
//    }

    //@Bean
//    public FilterRegistrationBean timeFilter(){
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        TimerFilter filter = new TimerFilter();
//        registrationBean.setFilter(filter);
//        List<String> urls = new ArrayList<>();
//        urls.add("/*");
//        registrationBean.setUrlPatterns(urls);
//        return  registrationBean;
//    }

    //@Bean
//    public ServletListenerRegistrationBean<ListenerTest> servletListenerRegistrationBean() {
//        return new ServletListenerRegistrationBean<ListenerTest>(new ListenerTest());
//    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(timeInterceptor);
//    }

//    @Override
//    public void addCorsMappings(CorsRegistry registry){
//        registry.addMapping("/fastjson/**")
//                .allowedOrigins("http://localhost:8088");// 允许 8088 端口访问
//    }

//    @Bean
//    public ServerEndpointExporter serverEndpointExporter() {
//        return new ServerEndpointExporter();
//    }


}
