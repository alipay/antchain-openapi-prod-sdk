// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ReadinessProbe extends TeaModel {
    // 命令行方式的健康监测配置。
    @NameInMap("exec_action")
    public ExecAction execAction;

    // 不健康阈值。
    @NameInMap("failure_threshold")
    @Validation(required = true)
    public Long failureThreshold;

    // http方式的健康监测配置。
    @NameInMap("http_get_action")
    public HttpGetAction httpGetAction;

    // 首次检查延时。
    @NameInMap("initial_delay_seconds")
    @Validation(required = true)
    public Long initialDelaySeconds;

    // 不健康阈值。
    @NameInMap("period_seconds")
    @Validation(required = true)
    public Long periodSeconds;

    // 健康阈值。
    @NameInMap("success_threshold")
    @Validation(required = true)
    public Long successThreshold;

    // tcp方式的健康监测配置。
    @NameInMap("tcp_socket_action")
    public TcpSocketAction tcpSocketAction;

    // 检查超时。
    @NameInMap("timeout_seconds")
    @Validation(required = true)
    public Long timeoutSeconds;

    public static ReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
        ReadinessProbe self = new ReadinessProbe();
        return TeaModel.build(map, self);
    }

    public ReadinessProbe setExecAction(ExecAction execAction) {
        this.execAction = execAction;
        return this;
    }
    public ExecAction getExecAction() {
        return this.execAction;
    }

    public ReadinessProbe setFailureThreshold(Long failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }
    public Long getFailureThreshold() {
        return this.failureThreshold;
    }

    public ReadinessProbe setHttpGetAction(HttpGetAction httpGetAction) {
        this.httpGetAction = httpGetAction;
        return this;
    }
    public HttpGetAction getHttpGetAction() {
        return this.httpGetAction;
    }

    public ReadinessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }
    public Long getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public ReadinessProbe setPeriodSeconds(Long periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }
    public Long getPeriodSeconds() {
        return this.periodSeconds;
    }

    public ReadinessProbe setSuccessThreshold(Long successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }
    public Long getSuccessThreshold() {
        return this.successThreshold;
    }

    public ReadinessProbe setTcpSocketAction(TcpSocketAction tcpSocketAction) {
        this.tcpSocketAction = tcpSocketAction;
        return this;
    }
    public TcpSocketAction getTcpSocketAction() {
        return this.tcpSocketAction;
    }

    public ReadinessProbe setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Long getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
