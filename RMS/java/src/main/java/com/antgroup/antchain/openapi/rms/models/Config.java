// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

/**
 * Model for initing client
 */
public class Config extends TeaModel {
    // accesskey id
    @NameInMap("accessKeyId")
    public String accessKeyId;

    // accesskey secret
    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    // security token
    @NameInMap("securityToken")
    public String securityToken;

    // http protocol
    @NameInMap("protocol")
    public String protocol;

    // read timeout
    @NameInMap("readTimeout")
    public Integer readTimeout;

    // connect timeout
    @NameInMap("connectTimeout")
    public Integer connectTimeout;

    // http proxy
    @NameInMap("httpProxy")
    public String httpProxy;

    // https proxy
    @NameInMap("httpsProxy")
    public String httpsProxy;

    // endpoint
    @NameInMap("endpoint")
    public String endpoint;

    // proxy white list
    @NameInMap("noProxy")
    public String noProxy;

    // max idle conns
    @NameInMap("maxIdleConns")
    public Integer maxIdleConns;

    // user agent
    @NameInMap("userAgent")
    public String userAgent;

    // socks5 proxy
    @NameInMap("socks5Proxy")
    public String socks5Proxy;

    // socks5 network
    @NameInMap("socks5NetWork")
    public String socks5NetWork;

    // 长链接最大空闲时长
    @NameInMap("maxIdleTimeMillis")
    public Long maxIdleTimeMillis;

    // 长链接最大连接时长
    @NameInMap("keepAliveDurationMillis")
    public Integer keepAliveDurationMillis;

    // 最大连接数（长链接最大总数）
    @NameInMap("maxRequests")
    public Integer maxRequests;

    // 每个目标主机的最大连接数（分主机域名的长链接最大总数
    @NameInMap("maxRequestsPerHost")
    public Integer maxRequestsPerHost;

    public static Config build(java.util.Map<String, ?> map) throws Exception {
        Config self = new Config();
        return TeaModel.build(map, self);
    }

    public Config setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public Config setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public Config setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public Config setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public Config setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }
    public Integer getReadTimeout() {
        return this.readTimeout;
    }

    public Config setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }
    public Integer getConnectTimeout() {
        return this.connectTimeout;
    }

    public Config setHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
        return this;
    }
    public String getHttpProxy() {
        return this.httpProxy;
    }

    public Config setHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
        return this;
    }
    public String getHttpsProxy() {
        return this.httpsProxy;
    }

    public Config setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public Config setNoProxy(String noProxy) {
        this.noProxy = noProxy;
        return this;
    }
    public String getNoProxy() {
        return this.noProxy;
    }

    public Config setMaxIdleConns(Integer maxIdleConns) {
        this.maxIdleConns = maxIdleConns;
        return this;
    }
    public Integer getMaxIdleConns() {
        return this.maxIdleConns;
    }

    public Config setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }
    public String getUserAgent() {
        return this.userAgent;
    }

    public Config setSocks5Proxy(String socks5Proxy) {
        this.socks5Proxy = socks5Proxy;
        return this;
    }
    public String getSocks5Proxy() {
        return this.socks5Proxy;
    }

    public Config setSocks5NetWork(String socks5NetWork) {
        this.socks5NetWork = socks5NetWork;
        return this;
    }
    public String getSocks5NetWork() {
        return this.socks5NetWork;
    }

    public Config setMaxIdleTimeMillis(Long maxIdleTimeMillis) {
        this.maxIdleTimeMillis = maxIdleTimeMillis;
        return this;
    }
    public Long getMaxIdleTimeMillis() {
        return this.maxIdleTimeMillis;
    }

    public Config setKeepAliveDurationMillis(Integer keepAliveDurationMillis) {
        this.keepAliveDurationMillis = keepAliveDurationMillis;
        return this;
    }
    public Integer getKeepAliveDurationMillis() {
        return this.keepAliveDurationMillis;
    }

    public Config setMaxRequests(Integer maxRequests) {
        this.maxRequests = maxRequests;
        return this;
    }
    public Integer getMaxRequests() {
        return this.maxRequests;
    }

    public Config setMaxRequestsPerHost(Integer maxRequestsPerHost) {
        this.maxRequestsPerHost = maxRequestsPerHost;
        return this;
    }
    public Integer getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

}
