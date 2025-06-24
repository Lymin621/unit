package kr.co.unit.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    private String filePath = "file:///C:/board/";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String os = System.getProperty("os.name").toLowerCase();
        if(!os.contains("win")){
            filePath ="/Users/ikarosala/Documents/board/";
        }

        registry.addResourceHandler("/docs/**") // 웹에서 접근할 경로
                .addResourceLocations(filePath+"files/"); // 실제 파일이 있는 위치
        registry.addResourceHandler("/imgs/**") // 웹에서 접근할 경로
                .addResourceLocations(filePath+"boardImg/"); // 실제 파일이 있는 위치
        registry.addResourceHandler("/download/**")
                .addResourceLocations(filePath+"boardImg/");
    }
}