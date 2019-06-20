package com.hendisantika.demo.Deque.test;

import com.hendisantika.demo.Deque.Deque;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : data-structure-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-21
 * Time: 06:14
 */
@DisplayName("Deque Test")
public class DequeTest {

    private static Deque<Integer> deque;

    @BeforeAll
    static void beforeAll() {
        deque = new Deque<Integer>();
        deque.addLast(0);


    }

    // @Test
    // @DisplayName("addFirst")
    // void addFirst() {
    // deque.addFirst("Osman");
    // deque.addFirst("Tarkan");
    // assertEquals(2, deque.size());
    // }
    //
    // @Test
    // @DisplayName("addLast")
    // void addLast() {
    // deque.addLast("Hakan");
    // deque.addLast("Türkmen");
    // assertEquals(4, deque.size());
    // }
    //
    // @Test
    // @DisplayName("remove first")
    // void removeFirst() {
    // deque.removeFirst();
    // assertEquals(3, deque.size());
    // }
    //
    // @Test
    // @DisplayName("remove Last")
    // void removeLast() {
    //
    // assertEquals("Türkmen", deque.removeLast());
    // }

    // @Test
    // @DisplayName("Iterator Test")
    // void getIterator() {
    //
    // Iterator<String> it = deque.iterator();
    //
    // while (it.hasNext()) {
    // System.out.println(it.next());
    // }
    //
    // assertEquals(true, it.hasNext());
    // }

    @Test
    void sizeTest() {
        assertEquals(1, deque.size());
    }
}
