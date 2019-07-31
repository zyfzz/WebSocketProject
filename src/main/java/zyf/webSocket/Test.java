package zyf.webSocket;

import java.net.URI;
import java.net.URISyntaxException;

public class Test {

    public static void main(String[] arg0) throws URISyntaxException {
        MyWebSocketClient myClient = new MyWebSocketClient(new URI("http://127.0.0.1:8088/mywebsocket"));
        // 往websocket服务端发送数据
        myClient.send("此为要发送的数据内容");
    }
}
