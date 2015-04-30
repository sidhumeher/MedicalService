package com.infy.chat;

/**
 * @author premraj_p
 *
 */

/* ClientInfo class contains information about a client, connected to the server.
*/

import java.net.Socket;

public class ClientInfo
{
	public Socket mSocket = null;
	public ClientListener mClientListener = null;
	public ClientSender mClientSender = null;
}
