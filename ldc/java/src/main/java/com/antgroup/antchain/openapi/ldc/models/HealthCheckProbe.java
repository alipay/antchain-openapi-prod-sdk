// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HealthCheckProbe extends TeaModel {
    // 基于命令行类型的探针必填
    @NameInMap("exec_action")
    public ExecAction execAction;

    // 探针运行失败阈值
    // 
    @NameInMap("failure_threshold")
    @Validation(required = true)
    public Long failureThreshold;

    // 基于HTTP GET请求的探针必填
    // 
    @NameInMap("http_get_action")
    public HttpGetAction httpGetAction;

    // 探针初始运行延迟时间
    // 
    @NameInMap("initial_delay_seconds")
    @Validation(required = true)
    public Long initialDelaySeconds;

    // 探针运行间隔时间
    // 
    @NameInMap("period_seconds")
    @Validation(required = true)
    public Long periodSeconds;

    // 探针运行成功阈值
    // 
    @NameInMap("success_threshold")
    @Validation(required = true)
    public Long successThreshold;

    // 基于TCP连接的探针必填
    // 
    @NameInMap("tcp_socket_action")
    public TcpSocketAction tcpSocketAction;

    // 探针运行超时时间
    // 
    @NameInMap("time_out_seconds")
    @Validation(required = true)
    public Long timeOutSeconds;

    public static HealthCheckProbe build(java.util.Map<String, ?> map) throws Exception {
        HealthCheckProbe self = new HealthCheckProbe();
        return TeaModel.build(map, self);
    }

    public HealthCheckProbe setExecAction(ExecAction execAction) {
        this.execAction = execAction;
        return this;
    }
    public ExecAction getExecAction() {
        return this.execAction;
    }

    public HealthCheckProbe setFailureThreshold(Long failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }
    public Long getFailureThreshold() {
        return this.failureThreshold;
    }

    public HealthCheckProbe setHttpGetAction(HttpGetAction httpGetAction) {
        this.httpGetAction = httpGetAction;
        return this;
    }
    public HttpGetAction getHttpGetAction() {
        return this.httpGetAction;
    }

    public HealthCheckProbe setInitialDelaySeconds(Long initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }
    public Long getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public HealthCheckProbe setPeriodSeconds(Long periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }
    public Long getPeriodSeconds() {
        return this.periodSeconds;
    }

    public HealthCheckProbe setSuccessThreshold(Long successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }
    public Long getSuccessThreshold() {
        return this.successThreshold;
    }

    public HealthCheckProbe setTcpSocketAction(TcpSocketAction tcpSocketAction) {
        this.tcpSocketAction = tcpSocketAction;
        return this;
    }
    public TcpSocketAction getTcpSocketAction() {
        return this.tcpSocketAction;
    }

    public HealthCheckProbe setTimeOutSeconds(Long timeOutSeconds) {
        this.timeOutSeconds = timeOutSeconds;
        return this;
    }
    public Long getTimeOutSeconds() {
        return this.timeOutSeconds;
    }

}
