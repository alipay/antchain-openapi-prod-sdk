// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LoadBalancerListener extends TeaModel {
    // 负载均衡实例后端使用的端口。
    // 取值：1-65535。
    @NameInMap("backend_server_port")
    @Validation(required = true)
    public Long backendServerPort;

    // 监听的带宽峰值，取值：
    // -1：不限制带宽峰值。
    // 1~5120：监听的带宽峰值，所有监听的带宽峰值之和不能超过实例的带宽峰值。
    @NameInMap("band_width")
    public Long bandWidth;

    // CA证书ID。
    // 若既上传CA证书又上传服务器证书，即采用双向认证。
    // 若用户只上传服务器证书，即为单向认证。
    @NameInMap("ca_certificate_id")
    public String caCertificateId;

    // 服务器上配置的Cookie。
    // 长度为1~200个字符，只能包含ASCII英文字母和数字字符，不能包含逗号、分号或空格，也不能以开头。
    @NameInMap("cookie")
    public String cookie;

    // Cookie超时时间
    @NameInMap("cookie_timeout")
    public Long cookieTimeout;

    // 连接超时时间（秒）
    @NameInMap("established_timeout")
    public Long establishedTimeout;

    // 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success。
    // 取值: 2-10。
    @NameInMap("healthy_threshold")
    public Long healthyThreshold;

    // 是否开启健康检查。
    // 取值：ON | OFF。
    @NameInMap("health_check")
    public String healthCheck;

    // 健康检查端口。
    @NameInMap("health_check_connect_port")
    public Long healthCheckConnectPort;

    // 健康检查链接超时时间。
    @NameInMap("health_check_connect_timeout")
    public Long healthCheckConnectTimeout;

    // 用于健康检查的域名。取值：
    // ip： 后端服务器的私网IP。当指定了IP或该参数未指定时，负载均衡会使用各后端服务器的私网IP当做健康检查使用的域名。
    // domain：域名长度为1-80，只能包含字母、数字、点号（.）和连字符（-）。
    @NameInMap("health_check_domain")
    public String healthCheckDomain;

    // 健康检查http method，支持head和get
    @NameInMap("health_check_http_method")
    public String healthCheckHttpMethod;

    // 健康检查正常的HTTP状态码，多个状态码用逗号分隔。
    // 默认值为http_2xx。
    @NameInMap("health_check_http_code")
    public String healthCheckHttpCode;

    // 健康检查的时间间隔。
    // 取值:1-50（秒）。
    @NameInMap("health_check_interval")
    public Long healthCheckInterval;

    // 健康检查threshold。
    @NameInMap("health_check_threshold")
    public Long healthCheckThreshold;

    // 接收来自运行状况检查的响应需要等待的时间。如果后端ECS在指定的时间内没有正确响应，则判定为健康检查失败。
    // 取值：1-300（秒）。
    @NameInMap("health_check_timeout")
    public Long healthCheckTimeout;

    // 用于健康检查的URI。
    // 当TCP监听需要使用HTTP健康检查时可配置此参数，如不配置则按TCP健康检查。
    @NameInMap("health_check_uri")
    public String healthCheckUri;

    // 负载均衡实例前端使用的端口。
    // 取值：1-65535。
    @NameInMap("listener_port")
    public Long listenerPort;

    // TCP 会话保持的超时时间（秒）
    @NameInMap("persistence_timeout")
    public Long persistenceTimeout;

    // 监听使用协议。
    @NameInMap("protocol")
    public String protocol;

    // 负载均衡策略（RR 轮询 | WLC 最小连接数）
    @NameInMap("scheduler")
    public String scheduler;

    // 0不开会话保持 / 1植入Cookie / 2重写Cookie。
    // 开启会话保持功能后，负载均衡会把来自同一客户端的访问请求分发到同一台后端服务器上进行处理。
    // HTTP协议会话保持基于Cookie。负载均衡提供了两种Cookie处理方式：
    // 植入Cookie：您只需要指定Cookie的过期时间。
    // 客户端第一次访问时，负载均衡会在返回请求中植入Cookie（即在HTTP/HTTPS响应报文中插入SERVERID），下次客户端携带此Cookie访问，负载均衡服务会将请求定向转发给之前记录到的后端服务器上。
    // 重写Cookie：可以根据需要指定HTTPS/HTTP响应中插入的Cookie。您需要在后端服务器上维护该Cookie的过期时间和生存时间。
    // 负载均衡服务发现用户自定义了Cookie，将会对原来的Cookie进行重写，下次客户端携带新的Cookie访问，负载均衡服务会将请求定向转发给之前记录到的后端服务器
    @NameInMap("session_sticky_type")
    @Validation(required = true)
    public Long sessionStickyType;

    // 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail。
    // 取值：2-10。
    @NameInMap("unhealthy_threshold")
    public Long unhealthyThreshold;

    // 是否开启通过 X-Forwarded-For 的方式获取来访者真实 IP
    @NameInMap("xforward_for")
    public Boolean xforwardFor;

    // 统一接入域名
    @NameInMap("domain")
    public String domain;

    // 统一接入转发路径
    @NameInMap("path")
    public String path;

    // on 代表开启 acl，off 代表关闭 acl
    @NameInMap("acl_status")
    public String aclStatus;

    // acl 类型，white 代表白名单；black 代表黑名单
    @NameInMap("acl_type")
    public String aclType;

    // 访问控制列表的 id
    @NameInMap("acl_id")
    public String aclId;

    public static LoadBalancerListener build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerListener self = new LoadBalancerListener();
        return TeaModel.build(map, self);
    }

    public LoadBalancerListener setBackendServerPort(Long backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Long getBackendServerPort() {
        return this.backendServerPort;
    }

    public LoadBalancerListener setBandWidth(Long bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }
    public Long getBandWidth() {
        return this.bandWidth;
    }

    public LoadBalancerListener setCaCertificateId(String caCertificateId) {
        this.caCertificateId = caCertificateId;
        return this;
    }
    public String getCaCertificateId() {
        return this.caCertificateId;
    }

    public LoadBalancerListener setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public LoadBalancerListener setCookieTimeout(Long cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Long getCookieTimeout() {
        return this.cookieTimeout;
    }

    public LoadBalancerListener setEstablishedTimeout(Long establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Long getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public LoadBalancerListener setHealthyThreshold(Long healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Long getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public LoadBalancerListener setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public LoadBalancerListener setHealthCheckConnectPort(Long healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Long getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public LoadBalancerListener setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Long getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public LoadBalancerListener setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public LoadBalancerListener setHealthCheckHttpMethod(String healthCheckHttpMethod) {
        this.healthCheckHttpMethod = healthCheckHttpMethod;
        return this;
    }
    public String getHealthCheckHttpMethod() {
        return this.healthCheckHttpMethod;
    }

    public LoadBalancerListener setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public LoadBalancerListener setHealthCheckInterval(Long healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Long getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public LoadBalancerListener setHealthCheckThreshold(Long healthCheckThreshold) {
        this.healthCheckThreshold = healthCheckThreshold;
        return this;
    }
    public Long getHealthCheckThreshold() {
        return this.healthCheckThreshold;
    }

    public LoadBalancerListener setHealthCheckTimeout(Long healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Long getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public LoadBalancerListener setHealthCheckUri(String healthCheckUri) {
        this.healthCheckUri = healthCheckUri;
        return this;
    }
    public String getHealthCheckUri() {
        return this.healthCheckUri;
    }

    public LoadBalancerListener setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public LoadBalancerListener setPersistenceTimeout(Long persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Long getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public LoadBalancerListener setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public LoadBalancerListener setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public LoadBalancerListener setSessionStickyType(Long sessionStickyType) {
        this.sessionStickyType = sessionStickyType;
        return this;
    }
    public Long getSessionStickyType() {
        return this.sessionStickyType;
    }

    public LoadBalancerListener setUnhealthyThreshold(Long unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Long getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public LoadBalancerListener setXforwardFor(Boolean xforwardFor) {
        this.xforwardFor = xforwardFor;
        return this;
    }
    public Boolean getXforwardFor() {
        return this.xforwardFor;
    }

    public LoadBalancerListener setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public LoadBalancerListener setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public LoadBalancerListener setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public LoadBalancerListener setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public LoadBalancerListener setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

}
