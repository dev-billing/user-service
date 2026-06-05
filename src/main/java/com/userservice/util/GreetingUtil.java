package com.userservice.util;

/**
 * Simple greeting utility — Claude PR Review 워크플로우 동작 검증용.
 */
public class GreetingUtil {

    public static String greet(String name) {
        if (name == null) {
            return "Hello, anonymous!";
        }
        return "Hello, " + name + "!";
    }
}
