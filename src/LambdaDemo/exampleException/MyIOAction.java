package LambdaDemo.exampleException;

import java.io.*;

public interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}
