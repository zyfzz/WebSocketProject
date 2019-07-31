package zyf.webSocket;

import org.java_websocket.client.WebSocketClient;
import java.net.URI;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyWebSocketClient extends WebSocketClient {

    Logger logger = LoggerFactory.getLogger(MyWebSocketClient.class);
    public MyWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake arg0) {
        logger.info("------ MyWebSocket onOpen ------");
    }

    @Override
    public void onClose(int arg0, String arg1, boolean arg2) {
        logger.info("------ MyWebSocket onClose ------");
    }

    @Override
    public void onError(Exception arg0) {
        logger.info("------ MyWebSocket onError ------");
    }

    @Override
    public void onMessage(String arg0) {
        logger.info("-------- 接收到服务端数据： " + arg0 + "--------");
    }
}
