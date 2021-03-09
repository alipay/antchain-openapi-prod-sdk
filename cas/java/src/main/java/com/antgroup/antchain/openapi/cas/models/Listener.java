// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Listener extends TeaModel {
    // 后端服务器端口
    @NameInMap("backend_server_port")
    @Validation(required = true)
    public Long backendServerPort;

    // 带宽
    @NameInMap("bandwidth")
    public Long bandwidth;

    // certificate_iaas_id
    @NameInMap("certificate_iaas_id")
    public String certificateIaasId;

    // 证书 id
    @NameInMap("certificate_id")
    public String certificateId;

    // cookie
    @NameInMap("cookie")
    public String cookie;

    // cookie 超时时间
    @NameInMap("cookie_timeout")
    public Long cookieTimeout;

    // description
    @NameInMap("description")
    public String description;

    // 连接超时时间
    @NameInMap("established_timeout")
    public Long establishedTimeout;

    // gm_crypto_cert_iaas_id
    @NameInMap("gm_crypto_cert_iaas_id")
    public String gmCryptoCertIaasId;

    // 健康检查
    @NameInMap("health_monitor")
    public ListenerHealthMonitor healthMonitor;

    // iaas_id
    @NameInMap("iaas_id")
    public String iaasId;

    // iaasType
    @NameInMap("iaas_type")
    public String iaasType;

    // id
    @NameInMap("id")
    public String id;

    // is_health_monitor
    @NameInMap("is_health_monitor")
    public String isHealthMonitor;

    // 监听器端口
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

    // load_balancer
    @NameInMap("load_balancer")
    public LoadBalancer loadBalancer;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 会话保持的超时时间
    @NameInMap("persist_timeout")
    public Long persistTimeout;

    // 转发规则
    @NameInMap("scheduler")
    public String scheduler;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // sticky_session
    @NameInMap("sticky_session")
    public String stickySession;

    // cookie 处理方式
    @NameInMap("sticky_session_type")
    public String stickySessionType;

    // 监听类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // url_path
    @NameInMap("url_path")
    public String urlPath;

    // x_forwarded_for
    @NameInMap("x_forwarded_for")
    public String xForwardedFor;

    public static Listener build(java.util.Map<String, ?> map) throws Exception {
        Listener self = new Listener();
        return TeaModel.build(map, self);
    }

    public Listener setBackendServerPort(Long backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Long getBackendServerPort() {
        return this.backendServerPort;
    }

    public Listener setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public Listener setCertificateIaasId(String certificateIaasId) {
        this.certificateIaasId = certificateIaasId;
        return this;
    }
    public String getCertificateIaasId() {
        return this.certificateIaasId;
    }

    public Listener setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public Listener setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public Listener setCookieTimeout(Long cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Long getCookieTimeout() {
        return this.cookieTimeout;
    }

    public Listener setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Listener setEstablishedTimeout(Long establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Long getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public Listener setGmCryptoCertIaasId(String gmCryptoCertIaasId) {
        this.gmCryptoCertIaasId = gmCryptoCertIaasId;
        return this;
    }
    public String getGmCryptoCertIaasId() {
        return this.gmCryptoCertIaasId;
    }

    public Listener setHealthMonitor(ListenerHealthMonitor healthMonitor) {
        this.healthMonitor = healthMonitor;
        return this;
    }
    public ListenerHealthMonitor getHealthMonitor() {
        return this.healthMonitor;
    }

    public Listener setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public Listener setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public Listener setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Listener setIsHealthMonitor(String isHealthMonitor) {
        this.isHealthMonitor = isHealthMonitor;
        return this;
    }
    public String getIsHealthMonitor() {
        return this.isHealthMonitor;
    }

    public Listener setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public Listener setLoadBalancer(LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }
    public LoadBalancer getLoadBalancer() {
        return this.loadBalancer;
    }

    public Listener setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Listener setPersistTimeout(Long persistTimeout) {
        this.persistTimeout = persistTimeout;
        return this;
    }
    public Long getPersistTimeout() {
        return this.persistTimeout;
    }

    public Listener setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public Listener setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Listener setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public Listener setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public Listener setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Listener setUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }
    public String getUrlPath() {
        return this.urlPath;
    }

    public Listener setXForwardedFor(String xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.xForwardedFor;
    }

}
