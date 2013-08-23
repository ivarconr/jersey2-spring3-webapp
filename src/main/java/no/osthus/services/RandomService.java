package no.osthus.services;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomService {
    public String getRandomAlphabetic() {
        return RandomStringUtils.randomAlphabetic(10);
    };
}
