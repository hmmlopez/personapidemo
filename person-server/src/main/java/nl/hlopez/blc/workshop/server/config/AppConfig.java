package nl.hlopez.blc.workshop.server.config;

import org.apache.ignite.IgniteSpringBean;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.logger.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public IgniteSpringBean igniteInstance() {
        IgniteSpringBean igniteBean = new IgniteSpringBean();
        igniteBean.setConfiguration(igniteConfiguration());
        return igniteBean;
    }

    private IgniteConfiguration igniteConfiguration() {
        IgniteConfiguration cfg = new IgniteConfiguration();
        cfg.setCacheConfiguration(personCacheConfiguration());
        cfg.setGridLogger(new Slf4jLogger());
        return cfg;
    }

    private CacheConfiguration personCacheConfiguration() {
        CacheConfiguration cfg = new CacheConfiguration("default");
        //TODO: 1. Set the cache name to "PERSON_CACHE"
        //TODO: 2. Set the number of backups to 1
        //TODO: 3. Set the indexTypes to Integer and Person
        return cfg;
    }
}
