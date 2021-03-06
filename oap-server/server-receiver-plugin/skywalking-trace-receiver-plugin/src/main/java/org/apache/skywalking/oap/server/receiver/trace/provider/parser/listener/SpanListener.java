/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.oap.server.receiver.trace.provider.parser.listener;

/**
 * SpanListener represents the callback when OAP does the trace segment analysis.
 */
public interface SpanListener {
    /**
     * The last step of the analysis process. Typically, the implementations forward the analysis results to the source
     * receiver.
     */
    void build();

    /**
     * @return true, if the given point matches the implementation.
     */
    boolean containsPoint(Point point);

    /**
     * Analysis point when the analysis core traverses the segment
     */
    enum Point {
        Entry, Exit, Local, First, TraceIds
    }
}
