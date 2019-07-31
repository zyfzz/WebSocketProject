package zyf.webSocket;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

public class WebSocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message){
        //组装返回的信息
        String Message ="";
        try {
            session.sendMessage(new TextMessage(Message));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
