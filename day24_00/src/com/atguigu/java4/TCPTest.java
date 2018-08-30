package com.atguigu.java4;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class TCPTest {
    @Test
    public void cilent() throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 4575);
        OutputStream os = socket.getOutputStream();
        os.write("aaaa".getBytes());
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        while((len = is.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        socket.shutdownInput();
        os.close();
        is.close();
        socket.close();

    }

    @Test
    public void server() throws IOException {

        ServerSocket serverSocket = new ServerSocket(4575);
        Socket accept = serverSocket.accept();
        InputStream is = accept.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        while((len = is.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        accept.shutdownInput();

        OutputStream os = accept.getOutputStream();
        os.write("cccc".getBytes());
        accept.shutdownOutput();

        os.close();
        is.close();
        accept.close();
        serverSocket.close();
    }
}
