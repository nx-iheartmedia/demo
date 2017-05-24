package nx.iHeartMedia.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Nx on 5/23/2017.
 */
@Configuration
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter {
}
