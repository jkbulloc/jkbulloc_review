package main.java;

/*
 * File: InvalidoperationException.java
 * Author: amehlhas, adalvi1
 * Date: 2/18/19
 * 
 * Description: This class is used to throw a user-created exception while running
 * the main program
 */
import java.lang.*;  // for class Exception

public class InvalidOperationException extends RuntimeException {

        /**
         * Constructs a <code>InvalidOperationException</code>
         * with no detail message.
         */
        public InvalidOperationException() {
                super();
        }


        public InvalidOperationException(String message) {
                super( message );
        }
}

