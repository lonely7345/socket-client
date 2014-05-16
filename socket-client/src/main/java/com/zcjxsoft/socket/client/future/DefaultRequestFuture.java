/*
 * Copyright 2014 zcjxsoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zcjxsoft.socket.client.future;

import java.util.List;

import com.zcjxsoft.socket.client.connection.Connection;
import com.zcjxsoft.socket.client.util.SocketRequest;

/**
 * @author 苗治勇
 * @version 创建时间：2014年5月16日 下午2:58:05 类说明
 */
public class DefaultRequestFuture<T> implements RequestFuture<T> {

	private final long					creation	= System.nanoTime();

	private T							result;
	private SocketRequest				request;
	private boolean						done;
	private List<RequestFutureListener>	listeners;
	private Throwable					cause;
	private int							waits;
	private Connection					connection;
	
	private long executionStart = -1;
    private long executionEnd   = -1;

    
    

	public T getProcessResult() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasSuccessfulResponse() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isDone() {
		// TODO Auto-generated method stub
		return false;
	}

	public void addListener(RequestFutureListener<T> listener) {
		// TODO Auto-generated method stub

	}

	public void removeListener(RequestFutureListener<T> listener) {
		// TODO Auto-generated method stub

	}

}
