package org.iothome.websocket;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;

public class HomeHandshakeInterceptor implements HandshakeInterceptor {

	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Map<String, Object> attributes) throws Exception {
		System.out.println("Test before!");
		return true;
	}

	@Override
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Exception exception) {
		System.out.println("Test after!");
		
	}

	
	
//    @Override
//    public boolean beforeHandshake(WebSocketSession session, 
//                                   org.springframework.web.socket.WebSocketHandler wsHandler, 
//                                   org.springframework.http.server.ServerHttpRequest request, 
//                                   org.springframework.http.server.ServerHttpResponse response) throws Exception {
//
//        // Retrieve token from query parameters or headers
//        String token = request.getURI().getQuery();
//        if (token == null || !isValidToken(token)) {
//            return false; // Reject handshake if token is invalid
//        }
//
//        return true;
//    }
//
//    @Override
//    public void afterHandshake(WebSocketSession session, 
//                                org.springframework.web.socket.WebSocketHandler wsHandler, 
//                                org.springframework.http.server.ServerHttpRequest request, 
//                                org.springframework.http.server.ServerHttpResponse response) {
//        // Optional: Log or track after handshake
//    }
//
//    private boolean isValidToken(String token) {
//        // Implement token validation logic
//        return "valid_token".equals(token);
//    }
}
