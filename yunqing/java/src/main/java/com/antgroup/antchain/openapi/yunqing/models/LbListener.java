// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class LbListener extends TeaModel {
    // lb监听器协议：HTTP、TCP
    @NameInMap("protocol")
    @Validation(required = true)
    public String protocol;

    // 监听器端口
    @NameInMap("listener_port")
    @Validation(required = true)
    public Long listenerPort;

    // 监听器后端端口
    @NameInMap("backend_server_port")
    @Validation(required = true)
    public Long backendServerPort;

    // 后端转发端口
    @NameInMap("backend_server_forward_port")
    @Validation(required = true)
    public Long backendServerForwardPort;

    // 健康检查开关
    @NameInMap("health_monitor")
    @Validation(required = true)
    public Boolean healthMonitor;

    // 健康检查端口
    @NameInMap("health_check_port")
    @Validation(required = true)
    public Long healthCheckPort;

    // 健康检查阈值
    @NameInMap("health_check_threadhold")
    @Validation(required = true)
    public Long healthCheckThreadhold;

    // 健康检查uri
    @NameInMap("health_check_uri")
    public String healthCheckUri;

    // 健康检查间隔
    @NameInMap("health_check_interval")
    @Validation(required = true)
    public Long healthCheckInterval;

    // 健康检查http方法
    @NameInMap("http_method")
    @Validation(required = true)
    public String httpMethod;

    // 健康检查期望返回的http code
    @NameInMap("expect_codes")
    public String expectCodes;

    public static LbListener build(java.util.Map<String, ?> map) throws Exception {
        LbListener self = new LbListener();
        return TeaModel.build(map, self);
    }

    public LbListener setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public LbListener setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public LbListener setBackendServerPort(Long backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Long getBackendServerPort() {
        return this.backendServerPort;
    }

    public LbListener setBackendServerForwardPort(Long backendServerForwardPort) {
        this.backendServerForwardPort = backendServerForwardPort;
        return this;
    }
    public Long getBackendServerForwardPort() {
        return this.backendServerForwardPort;
    }

    public LbListener setHealthMonitor(Boolean healthMonitor) {
        this.healthMonitor = healthMonitor;
        return this;
    }
    public Boolean getHealthMonitor() {
        return this.healthMonitor;
    }

    public LbListener setHealthCheckPort(Long healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Long getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public LbListener setHealthCheckThreadhold(Long healthCheckThreadhold) {
        this.healthCheckThreadhold = healthCheckThreadhold;
        return this;
    }
    public Long getHealthCheckThreadhold() {
        return this.healthCheckThreadhold;
    }

    public LbListener setHealthCheckUri(String healthCheckUri) {
        this.healthCheckUri = healthCheckUri;
        return this;
    }
    public String getHealthCheckUri() {
        return this.healthCheckUri;
    }

    public LbListener setHealthCheckInterval(Long healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Long getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public LbListener setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public LbListener setExpectCodes(String expectCodes) {
        this.expectCodes = expectCodes;
        return this;
    }
    public String getExpectCodes() {
        return this.expectCodes;
    }

}
