package com.soapws.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mac on 07/09/2019.
 */
public class FIHTTPServer {
	private static final Logger logger = LoggerFactory.getLogger(FIHTTPServer.class);
	static {
		try{
			ServerSocket server = new ServerSocket ( 8888 );
			while ( true ){
				final Socket socket = server.accept ();
				InputStreamReader inputStreamReader = new InputStreamReader ( socket.getInputStream () );
				BufferedReader bufferedReader = new BufferedReader ( inputStreamReader );
				String line = bufferedReader.readLine ();
				while ( !line.isEmpty () ){
					logger.info ( line );
					line = bufferedReader.readLine ();
				}
				logger.info ( "Request With Payload {}" );
			}
		}catch(Exception e){
			e.printStackTrace ();
		}
	}
}
