// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class EndpointsDTO extends TeaModel {
    // HTTP 内网接入点
    @NameInMap("http_internal_endpoint")
    @Validation(required = true)
    public String httpInternalEndpoint;

    // HTTP 公网接入点
    @NameInMap("http_internet_endpoint")
    @Validation(required = true)
    public String httpInternetEndpoint;

    // HTTPS 公网接入点
    @NameInMap("http_internet_secure_endpoint")
    @Validation(required = true)
    public String httpInternetSecureEndpoint;

    // TCP 协议接入点
    @NameInMap("tcp_endpoint")
    @Validation(required = true)
    public String tcpEndpoint;

    public static EndpointsDTO build(java.util.Map<String, ?> map) throws Exception {
        EndpointsDTO self = new EndpointsDTO();
        return TeaModel.build(map, self);
    }

    public EndpointsDTO setHttpInternalEndpoint(String httpInternalEndpoint) {
        this.httpInternalEndpoint = httpInternalEndpoint;
        return this;
    }
    public String getHttpInternalEndpoint() {
        return this.httpInternalEndpoint;
    }

    public EndpointsDTO setHttpInternetEndpoint(String httpInternetEndpoint) {
        this.httpInternetEndpoint = httpInternetEndpoint;
        return this;
    }
    public String getHttpInternetEndpoint() {
        return this.httpInternetEndpoint;
    }

    public EndpointsDTO setHttpInternetSecureEndpoint(String httpInternetSecureEndpoint) {
        this.httpInternetSecureEndpoint = httpInternetSecureEndpoint;
        return this;
    }
    public String getHttpInternetSecureEndpoint() {
        return this.httpInternetSecureEndpoint;
    }

    public EndpointsDTO setTcpEndpoint(String tcpEndpoint) {
        this.tcpEndpoint = tcpEndpoint;
        return this;
    }
    public String getTcpEndpoint() {
        return this.tcpEndpoint;
    }

}
