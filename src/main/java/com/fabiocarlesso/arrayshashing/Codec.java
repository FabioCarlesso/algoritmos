package com.fabiocarlesso.arrayshashing;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;

public class Codec {
    Map<String, String> map = new HashMap<>();

    public String encode(String longUrl) {
        String key = RandomStringUtils.random(5, true, true);
        map.put(key, longUrl);
        return key;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

}
