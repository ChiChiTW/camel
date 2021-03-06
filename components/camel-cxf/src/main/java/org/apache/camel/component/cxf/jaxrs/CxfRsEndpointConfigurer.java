/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.cxf.jaxrs;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.AbstractJAXRSFactoryBean;
import org.apache.cxf.jaxrs.client.Client;

/**
 * A pluggable strategy for configuring the cxfRsEndpoint by using java code
 */
public interface CxfRsEndpointConfigurer {
    
    /**
     * Configure the CXF-RS Server/Client factory bean
     * @param factoryBean
     */
    void configure(AbstractJAXRSFactoryBean factoryBean);
    
    /**
     * Configure the CXF Client such as setting some parameters on the client conduit 
     *
     * @param client the CXF client
     */
    void configureClient(Client client);

    /**
     * Configure the CXF Server such as setting some parameters on the server destination 
     *
     * @param server the CXF server
     */
    void configureServer(Server server);

}
