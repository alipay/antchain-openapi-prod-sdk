// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

/**
 * <b>description</b> :
 * <p>Model for initing client</p>
 */
public class Config extends TeaModel {
    /**
     * <p>accesskey id</p>
     */
    @NameInMap("accessKeyId")
    public String accessKeyId;

    /**
     * <p>accesskey secret</p>
     */
    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    /**
     * <p>security token</p>
     */
    @NameInMap("securityToken")
    public String securityToken;

    /**
     * <p>http protocol</p>
     * 
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>read timeout</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("readTimeout")
    public Number readTimeout;

    /**
     * <p>connect timeout</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("connectTimeout")
    public Number connectTimeout;

    /**
     * <p>http proxy</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://localhost">http://localhost</a></p>
     */
    @NameInMap("httpProxy")
    public String httpProxy;

    /**
     * <p>https proxy</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://localhost">https://localhost</a></p>
     */
    @NameInMap("httpsProxy")
    public String httpsProxy;

    /**
     * <p>endpoint</p>
     * 
     * <strong>example:</strong>
     * <p>cs.aliyuncs.com</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>proxy white list</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://localhost">http://localhost</a></p>
     */
    @NameInMap("noProxy")
    public String noProxy;

    /**
     * <p>max idle conns</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("maxIdleConns")
    public Number maxIdleConns;

    /**
     * <p>user agent</p>
     * 
     * <strong>example:</strong>
     * <p>Alibabacloud/1</p>
     */
    @NameInMap("userAgent")
    public String userAgent;

    /**
     * <p>socks5 proxy</p>
     */
    @NameInMap("socks5Proxy")
    public String socks5Proxy;

    /**
     * <p>socks5 network</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("socks5NetWork")
    public String socks5NetWork;

    /**
     * <p>长链接最大空闲时长</p>
     */
    @NameInMap("maxIdleTimeMillis")
    public Number maxIdleTimeMillis;

    /**
     * <p>长链接最大连接时长</p>
     */
    @NameInMap("keepAliveDurationMillis")
    public Number keepAliveDurationMillis;

    /**
     * <p>最大连接数（长链接最大总数）</p>
     */
    @NameInMap("maxRequests")
    public Number maxRequests;

    /**
     * <p>每个目标主机的最大连接数（分主机域名的长链接最大总数</p>
     */
    @NameInMap("maxRequestsPerHost")
    public Number maxRequestsPerHost;

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

    public Config setReadTimeout(Number readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }
    public Number getReadTimeout() {
        return this.readTimeout;
    }

    public Config setConnectTimeout(Number connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }
    public Number getConnectTimeout() {
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

    public Config setMaxIdleConns(Number maxIdleConns) {
        this.maxIdleConns = maxIdleConns;
        return this;
    }
    public Number getMaxIdleConns() {
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

    public Config setMaxIdleTimeMillis(Number maxIdleTimeMillis) {
        this.maxIdleTimeMillis = maxIdleTimeMillis;
        return this;
    }
    public Number getMaxIdleTimeMillis() {
        return this.maxIdleTimeMillis;
    }

    public Config setKeepAliveDurationMillis(Number keepAliveDurationMillis) {
        this.keepAliveDurationMillis = keepAliveDurationMillis;
        return this;
    }
    public Number getKeepAliveDurationMillis() {
        return this.keepAliveDurationMillis;
    }

    public Config setMaxRequests(Number maxRequests) {
        this.maxRequests = maxRequests;
        return this;
    }
    public Number getMaxRequests() {
        return this.maxRequests;
    }

    public Config setMaxRequestsPerHost(Number maxRequestsPerHost) {
        this.maxRequestsPerHost = maxRequestsPerHost;
        return this;
    }
    public Number getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

}
