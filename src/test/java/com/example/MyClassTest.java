package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyClassTest {

    @Test
    public void testConcat_validArgument_success() {
        MyClass myClass = new MyClass();
        String a = "Hello, ";
        String b = "Cats!";

        String result = myClass.concat(a, b);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("Hello, Cats!", result);
    }

    @Test
    public void testConcat_nullArgument_success() {
        MyClass myClass = new MyClass();
        String a = null;
        String b = "Cats!";

        String result = myClass.concat(a, b);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("nullCats!", result);
    }

    @Test
    public void testConcat_emptyArgument_success() {
        MyClass myClass = new MyClass();
        String a = "";
        String b = "Cats!";

        String result = myClass.concat(a, b);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("Cats!", result);
    }
}
