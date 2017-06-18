package com.example.demo;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by liutao on 17-6-17.
 */
@Service
@CacheConfig(cacheNames = "user")
public class CacheService {

    @Cacheable
    public String getCache(String key) {
        System.out.println("cache failure");
        return "hello " + key;
    }
}
