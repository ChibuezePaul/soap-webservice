//package com.soapws.ws;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Date;
//
///**
// * Created by mac on 07/09/2019.
// */
//public class FIHTTPServer implements Runnable{
//
//	private static Logger logger = LoggerFactory.getLogger(FIHTTPServer.class);
//	private static final int PORT = 8888;
//	private static final boolean verbose = true;
//	private Socket clientSocket;
//
//	public FIHTTPServer(Socket clientSocket){
//		this.clientSocket = clientSocket;
//	}
//
//	public static void main(String [] args){
//		try{
//			ServerSocket server = new ServerSocket ( PORT );
//			logger.info ( "\nServer Started..\nListening For Connections On Port {}...",PORT );
//
//			//listen until user halts execution
//			while ( true ){
//				FIHTTPServer fihttpServer = new FIHTTPServer ( server.accept () );
//
//				if(verbose){
//					logger.info ( "Connection Opened : {} from {}",new Date (),server.getLocalSocketAddress () );
//				}
//
//				//create thread for each connection
//				Thread thread = new Thread ( fihttpServer );
//				thread.start ();
////
////				InputStreamReader inputStreamReader = new InputStreamReader ( socket.getInputStream () );
////				BufferedReader bufferedReader = new BufferedReader ( inputStreamReader );
////				String line = bufferedReader.readLine ();
//////				BufferedReader bufferedReaderUser = new BufferedReader ( new InputStreamReader ( System.in ) );
//////				String userInput = bufferedReaderUser.readLine ();
////				while ((!line.isEmpty () /*&& userInput.isEmpty ()*/)){
////					logger.info ( line );
//////					logger.info ( "user sent {}",userInput );
////					line = bufferedReader.readLine ();
//////					userInput = bufferedReaderUser.readLine ();
////				}
////				logger.info ( "Request With Payload {}",line );
//			}
//		}catch(Exception e){
//			logger.info ( "Server Encountered An Error {}",e.getMessage () );
//			e.printStackTrace ();
//		}
//	}
//
//	@Override
//	public void run () {
//		BufferedReader reader = null;
//		PrintWriter writer = null;
//		BufferedOutputStream outputStream;
//
//		try {
//			reader = new BufferedReader ( new InputStreamReader ( clientSocket.getInputStream () ) );
//			writer = new PrintWriter ( clientSocket.getOutputStream () );
//			outputStream = new BufferedOutputStream ( clientSocket.getOutputStream () );
//			String input = reader.readLine ();
//			logger.info ( input );
//			writer.println ("writer wrote " + input);
////			while ( !input.isEmpty () ){
////				logger.info ( input );
////				input = reader.readLine ();
////			}
//
//		}catch ( Exception e ){
//			logger.info ( "An Error Encountered {}",e.getMessage () );
//			e.printStackTrace ();
//		}
//	}
//}
