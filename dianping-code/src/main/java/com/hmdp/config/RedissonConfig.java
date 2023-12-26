package com.hmdp.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:RedisConfig
 * Package:com.hmdp.config
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2023/12/19 - 19:58
 * @Version:v1.0
 */
@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        // 配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.1.100:6379")
                .setPassword("1234");
        // 创建RedissonClient对象
        return Redisson.create(config);
    }
}

