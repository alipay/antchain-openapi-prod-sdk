// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CircuitBreakerConfigModel extends TeaModel {
    // 熔断错误比率条件
    @NameInMap("error_percent_threshold")
    public Long errorPercentThreshold;

    // 请求超时时间
    @NameInMap("provider_timeout")
    public Long providerTimeout;

    // 发生熔断的总请求数
    @NameInMap("request_volume_threshold")
    public Long requestVolumeThreshold;

    // 熔断之后时间窗口
    @NameInMap("sleep_window")
    @Validation(required = true)
    public Long sleepWindow;

    // metric窗口
    @NameInMap("total_metric_window")
    @Validation(required = true)
    public Long totalMetricWindow;

    // rpc超时时间>0
    @NameInMap("rpc_timeout")
    public Long rpcTimeout;

    // 平均RT阈值>0
    @NameInMap("average_rt_threshold")
    public Long averageRtThreshold;

    public static CircuitBreakerConfigModel build(java.util.Map<String, ?> map) throws Exception {
        CircuitBreakerConfigModel self = new CircuitBreakerConfigModel();
        return TeaModel.build(map, self);
    }

    public CircuitBreakerConfigModel setErrorPercentThreshold(Long errorPercentThreshold) {
        this.errorPercentThreshold = errorPercentThreshold;
        return this;
    }
    public Long getErrorPercentThreshold() {
        return this.errorPercentThreshold;
    }

    public CircuitBreakerConfigModel setProviderTimeout(Long providerTimeout) {
        this.providerTimeout = providerTimeout;
        return this;
    }
    public Long getProviderTimeout() {
        return this.providerTimeout;
    }

    public CircuitBreakerConfigModel setRequestVolumeThreshold(Long requestVolumeThreshold) {
        this.requestVolumeThreshold = requestVolumeThreshold;
        return this;
    }
    public Long getRequestVolumeThreshold() {
        return this.requestVolumeThreshold;
    }

    public CircuitBreakerConfigModel setSleepWindow(Long sleepWindow) {
        this.sleepWindow = sleepWindow;
        return this;
    }
    public Long getSleepWindow() {
        return this.sleepWindow;
    }

    public CircuitBreakerConfigModel setTotalMetricWindow(Long totalMetricWindow) {
        this.totalMetricWindow = totalMetricWindow;
        return this;
    }
    public Long getTotalMetricWindow() {
        return this.totalMetricWindow;
    }

    public CircuitBreakerConfigModel setRpcTimeout(Long rpcTimeout) {
        this.rpcTimeout = rpcTimeout;
        return this;
    }
    public Long getRpcTimeout() {
        return this.rpcTimeout;
    }

    public CircuitBreakerConfigModel setAverageRtThreshold(Long averageRtThreshold) {
        this.averageRtThreshold = averageRtThreshold;
        return this;
    }
    public Long getAverageRtThreshold() {
        return this.averageRtThreshold;
    }

}
