package com.ecommerce.tests;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
 
@DisplayName("JUnit 5 Dynamic Tests Example")

public class DynamicTests {

        @TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
            dynamicTest("simple dynamic test", new Executable() {
				@Override
				public void execute() throws Throwable {
					assertTrue(true);
				}
			}),
            dynamicTest("My Executable Class", new MyExecutable()),
            dynamicTest("Exception Executable", new Executable() {
				@Override
				public void execute() throws Throwable {throw new Exception("Exception Example");}
			}),
            dynamicTest("simple dynamic test-2", new Executable() {
				@Override
				public void execute() throws Throwable {
					assertTrue(true);
				}
			})
        );
    }

}


class MyExecutable implements Executable {

        @Override
        public void execute() throws Throwable {
                System.out.println("Hello World!");
        }

}