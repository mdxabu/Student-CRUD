package com.input;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class InStream extends InputStream {

    private final InputStream in;

    public InStream(){
        this.in=System.in;
    }
    public InStream(URL link) throws IOException {
        in= link.openStream();
    }

    public Scanner getScanner(){
        return new Scanner(this);
    }

    @Override
    public int read() throws IOException {
        return in.read();
    }

    public void close() throws IOException {
        in.close();
    }
}
