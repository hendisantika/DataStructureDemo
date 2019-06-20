package com.hendisantika.demo.QuickUnion.test;

import com.hendisantika.demo.QuickUnion.QuickUnion;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : data-structure-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-20
 * Time: 06:37
 */
@DisplayName("Quick Union Test")
public class QuickUnionTest {

    private static QuickUnion quickUnion;

    @BeforeAll
    static void beforeAll() {
        quickUnion = new QuickUnion();
        System.out.println("Before All is being executed.");
    }

    @BeforeEach
    void beforeEach() {

        System.out.println("before each ");

    }

    @Test
    @DisplayName("Make set")
    public void makeSet() {

        quickUnion.makeSet(2);
        quickUnion.makeSet(4);
        quickUnion.makeSet(22);
        quickUnion.makeSet(1);
        assertEquals(4, quickUnion.map.size());
    }

    @Test
    @DisplayName("Union two sets")
    public void union() {

        quickUnion.makeSet(2);
        quickUnion.makeSet(4);
        quickUnion.makeSet(22);
        quickUnion.makeSet(1);
        quickUnion.union(2, 4);
        assertEquals(2, quickUnion.findSet(4).intValue());
    }
}