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

package com.zcjxsoft.socket.client.processor;

import org.jboss.netty.buffer.ChannelBuffer;

/**
 * @author 苗治勇 
 * @version 创建时间：2014年5月16日 下午2:21:39
 * socket了请求响应的处理函数
 */
public interface ResponseProcessor<T> {
	
    void addData(ChannelBuffer content)
           throws Exception;
    
    void addLastData(ChannelBuffer content)
           throws Exception;
    
    
}
