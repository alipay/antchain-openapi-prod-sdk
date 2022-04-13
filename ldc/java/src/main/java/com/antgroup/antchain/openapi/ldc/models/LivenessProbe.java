// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LivenessProbe extends TeaModel {
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

    // 检查间隔。
    @NameInMap("period_seconds")
    @Validation(required = true)
    public Long periodSeconds;

    // 健康阈值。
    // 
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

    public static LivenessProbe build(java.util.Map<String, ?> map) throws Exception {
        LivenessProbe self = new LivenessProbe();
        return TeaModel.build(map, self);
    }

    public LivenessProbe setExecAction(ExecAction execAction) {
        this.execAction = execAction;
        return this;
    }
    public ExecAction getExecAction() {
        return this.execAction;
    }

    public LivenessProbe setFailureThreshold(Long failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }
    public Long getFailureThreshold() {
        return this.failureThreshold;
    }

    public LivenessProbe setHttpGetAction(HttpGetAction httpGetAction) {
        this.httpGetAction = httpGetAction;
        return this;
    }
    public HttpGetAction getHttpGetAction() {
        return this.httpGetAction;
    }

    public LivenessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }
    public Long getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public LivenessProbe setPeriodSeconds(Long periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }
    public Long getPeriodSeconds() {
        return this.periodSeconds;
    }

    public LivenessProbe setSuccessThreshold(Long successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }
    public Long getSuccessThreshold() {
        return this.successThreshold;
    }

    public LivenessProbe setTcpSocketAction(TcpSocketAction tcpSocketAction) {
        this.tcpSocketAction = tcpSocketAction;
        return this;
    }
    public TcpSocketAction getTcpSocketAction() {
        return this.tcpSocketAction;
    }

    public LivenessProbe setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Long getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
