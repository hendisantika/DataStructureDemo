package com.hendisantika.demo.stack.test;

import com.hendisantika.demo.stack.StackImplWithArray;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : data-structure-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-21
 * Time: 06:19
 */
@DisplayName("StackImplWithArrayTest")
public class StackImplWithArrayTest {

    private static StackImplWithArray stackImplWithArray;

    @BeforeAll
    static void beforeAll() {
        stackImplWithArray = new StackImplWithArray();

    }

    static void fill() {
        stackImplWithArray.push("Turkmen");
        stackImplWithArray.push("Osman");
        stackImplWithArray.push("Tarýk");
        stackImplWithArray.push("Cenabettin");
        stackImplWithArray.push("Tarcan");
        stackImplWithArray.push("Ahmet");
        stackImplWithArray.push("Fatih");
        stackImplWithArray.push("Ersin");
        stackImplWithArray.push("Mustafa");
        stackImplWithArray.push("Erol");
        stackImplWithArray.push("Alex");
        stackImplWithArray.push("Rahmi");
        stackImplWithArray.push("Ýbrahim");

    }

    @BeforeEach
    void beforeEach() {
        stackImplWithArray = new StackImplWithArray();
    }

    @Test
    void pushTest() {
        fill();
        assertEquals("Ýbrahim", stackImplWithArray.pop());
    }

    @Test
    void popTest() {
        fill();
        assertEquals("Ýbrahim", stackImplWithArray.pop());
    }

    @Test
    void topTest() {
        fill();
        assertEquals("Ýbrahim", stackImplWithArray.top());
    }

}

