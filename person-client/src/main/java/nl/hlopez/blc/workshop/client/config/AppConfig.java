package nl.hlopez.blc.workshop.client.config;

import org.apache.ignite.IgniteSpringBean;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.logger.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public IgniteSpringBean igniteInstance() {
        IgniteSpringBean igniteBean = new IgniteSpringBean();
        igniteBean.setConfiguration(
                new IgniteConfiguration()
                .setClientMode(true)
                .setGridLogger(new Slf4jLogger()));
        return igniteBean;
    }
}
