// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class LoadBalancerRule extends TeaModel {
    // load_balancer
    @NameInMap("load_balancer")
    public LoadBalancer loadBalancer;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // id
    @NameInMap("id")
    public String id;

    // listener_port
    @NameInMap("listener_port")
    public Long listenerPort;

    // status
    @NameInMap("status")
    public String status;

    // domain
    @NameInMap("domain")
    public String domain;

    // url
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // cookie
    @NameInMap("cookie")
    public String cookie;

    // is_health_monitor
    @NameInMap("is_health_monitor")
    public String isHealthMonitor;

    // health_monitor
    @NameInMap("health_monitor")
    public ListenerHealthMonitor healthMonitor;

    // sticky_session
    @NameInMap("sticky_session")
    public String stickySession;

    // app_id
    @NameInMap("app_id")
    public String appId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static LoadBalancerRule build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerRule self = new LoadBalancerRule();
        return TeaModel.build(map, self);
    }

    public LoadBalancerRule setLoadBalancer(LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }
    public LoadBalancer getLoadBalancer() {
        return this.loadBalancer;
    }

    public LoadBalancerRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LoadBalancerRule setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LoadBalancerRule setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public LoadBalancerRule setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public LoadBalancerRule setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public LoadBalancerRule setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public LoadBalancerRule setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public LoadBalancerRule setIsHealthMonitor(String isHealthMonitor) {
        this.isHealthMonitor = isHealthMonitor;
        return this;
    }
    public String getIsHealthMonitor() {
        return this.isHealthMonitor;
    }

    public LoadBalancerRule setHealthMonitor(ListenerHealthMonitor healthMonitor) {
        this.healthMonitor = healthMonitor;
        return this;
    }
    public ListenerHealthMonitor getHealthMonitor() {
        return this.healthMonitor;
    }

    public LoadBalancerRule setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public LoadBalancerRule setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public LoadBalancerRule setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
