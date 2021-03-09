// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListenerHealthMonitor extends TeaModel {
    // check_type
    @NameInMap("check_type")
    public String checkType;

    // 默认 80
    @NameInMap("connect_port")
    public Long connectPort;

    // 域名
    @NameInMap("domain")
    public String domain;

    // 健康阈值
    @NameInMap("healthy_threshold")
    public Long healthyThreshold;

    // health_check_http_code
    @NameInMap("health_check_http_code")
    public java.util.List<String> healthCheckHttpCode;

    // http_method
    @NameInMap("http_method")
    public String httpMethod;

    // id
    @NameInMap("id")
    public String id;

    // 监控检查间隔
    @NameInMap("interval")
    @Validation(required = true)
    public Long interval;

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public Long timeout;

    // 不健康阈值
    @NameInMap("un_healthy_threshold")
    public Long unHealthyThreshold;

    // uri
    @NameInMap("uri")
    public String uri;

    public static ListenerHealthMonitor build(java.util.Map<String, ?> map) throws Exception {
        ListenerHealthMonitor self = new ListenerHealthMonitor();
        return TeaModel.build(map, self);
    }

    public ListenerHealthMonitor setCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }
    public String getCheckType() {
        return this.checkType;
    }

    public ListenerHealthMonitor setConnectPort(Long connectPort) {
        this.connectPort = connectPort;
        return this;
    }
    public Long getConnectPort() {
        return this.connectPort;
    }

    public ListenerHealthMonitor setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListenerHealthMonitor setHealthyThreshold(Long healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Long getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public ListenerHealthMonitor setHealthCheckHttpCode(java.util.List<String> healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public java.util.List<String> getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public ListenerHealthMonitor setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public ListenerHealthMonitor setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListenerHealthMonitor setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public ListenerHealthMonitor setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public ListenerHealthMonitor setUnHealthyThreshold(Long unHealthyThreshold) {
        this.unHealthyThreshold = unHealthyThreshold;
        return this;
    }
    public Long getUnHealthyThreshold() {
        return this.unHealthyThreshold;
    }

    public ListenerHealthMonitor setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
