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

/**
 * @author 苗治勇
 * @version 创建时间：2014年5月16日 下午2:56:21 类说明
 */
public interface RequestFuture<T> {

	static final Throwable INTERRUPTED = new Throwable("Interrupted");

	static final Throwable CANCELLED = new Throwable("Cancelled");

	static final Throwable CANNOT_CONNECT = new Throwable("Cannot connect");

	static final Throwable CONNECTION_LOST = new Throwable("Connection lost");

	static final Throwable SHUTTING_DOWN = new Throwable("Shutting down");

	static final Throwable EXECUTION_REJECTED = new Throwable(
			"Execution rejected by connection");

	static final Throwable TIMED_OUT = new Throwable(
			"Request  execution timed out");

	static final Throwable INVALID_REDIRECT = new Throwable(
			"Redirect without Location header");

	/** get process result from response **/
	T getProcessResult();

	/** true if there is successful response from the socket server **/
	boolean hasSuccessfulResponse();

	boolean isDone();

	void addListener(RequestFutureListener<T> listener);

	void removeListener(RequestFutureListener<T> listener);

}
