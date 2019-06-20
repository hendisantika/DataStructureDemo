package com.hendisantika.demo.queue.test;

import com.hendisantika.demo.queue.QueueWithTwoStacks;
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
 * Time: 06:04
 */
@DisplayName("QueueWithTwoStackTest")
public class QueueImplWithTwoStacksTest {

    private static QueueWithTwoStacks<String> queueWithTwoStacks;

    @BeforeAll
    public static void beforeAll() {

        queueWithTwoStacks = new QueueWithTwoStacks<String>();
    }

    @BeforeEach
    public void beforeEach() {
        queueWithTwoStacks.getStackOne().removeAllElements();
        queueWithTwoStacks.getStackTwo().removeAllElements();
    }

    @Test
    @DisplayName("Enqueu test with only one element")
    public void enqueueTestWithOne() {
        queueWithTwoStacks.enqueue(queueWithTwoStacks, "Türkmen");
        assertEquals(1, queueWithTwoStacks.numberOfItems());
    }

    @Test
    @DisplayName("Enqueu test with multiple elements")
    public void enqueueTestWithMultiple() {
        queueWithTwoStacks.enqueue(queueWithTwoStacks, "Türkmen");
        queueWithTwoStacks.enqueue(queueWithTwoStacks, "Mustafa");
        queueWithTwoStacks.enqueue(queueWithTwoStacks, "Demirci");
        assertEquals(3, queueWithTwoStacks.numberOfItems());
    }

    @Test
    @DisplayName("DequeuTest")
    public void dequeueTest() {
        queueWithTwoStacks.enqueue(queueWithTwoStacks, "Türkmen");
        queueWithTwoStacks.enqueue(queueWithTwoStacks, "Mustafa");
        queueWithTwoStacks.enqueue(queueWithTwoStacks, "Demirci");
        assertEquals("Türkmen", queueWithTwoStacks.dequeue(queueWithTwoStacks));
    }
}