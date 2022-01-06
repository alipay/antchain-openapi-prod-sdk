// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class FaultToleranceConfigs extends TeaModel {
    // 异常类型值
    @NameInMap("exception_types")
    public java.util.List<String> exceptionTypes;

    // 时间窗口
    @NameInMap("time_window")
    public Long timeWindow;

    // 时间窗口内最少调用次数
    @NameInMap("least_window_count")
    public Long leastWindowCount;

    // 最大隔离数量
    @NameInMap("max_ip_count")
    public Long maxIpCount;

    // 异常比例倍数
    @NameInMap("exception_rate_multiple")
    public Long exceptionRateMultiple;

    // 异常比例阈值
    @NameInMap("least_exception_rate")
    public Long leastExceptionRate;

    public static FaultToleranceConfigs build(java.util.Map<String, ?> map) throws Exception {
        FaultToleranceConfigs self = new FaultToleranceConfigs();
        return TeaModel.build(map, self);
    }

    public FaultToleranceConfigs setExceptionTypes(java.util.List<String> exceptionTypes) {
        this.exceptionTypes = exceptionTypes;
        return this;
    }
    public java.util.List<String> getExceptionTypes() {
        return this.exceptionTypes;
    }

    public FaultToleranceConfigs setTimeWindow(Long timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Long getTimeWindow() {
        return this.timeWindow;
    }

    public FaultToleranceConfigs setLeastWindowCount(Long leastWindowCount) {
        this.leastWindowCount = leastWindowCount;
        return this;
    }
    public Long getLeastWindowCount() {
        return this.leastWindowCount;
    }

    public FaultToleranceConfigs setMaxIpCount(Long maxIpCount) {
        this.maxIpCount = maxIpCount;
        return this;
    }
    public Long getMaxIpCount() {
        return this.maxIpCount;
    }

    public FaultToleranceConfigs setExceptionRateMultiple(Long exceptionRateMultiple) {
        this.exceptionRateMultiple = exceptionRateMultiple;
        return this;
    }
    public Long getExceptionRateMultiple() {
        return this.exceptionRateMultiple;
    }

    public FaultToleranceConfigs setLeastExceptionRate(Long leastExceptionRate) {
        this.leastExceptionRate = leastExceptionRate;
        return this;
    }
    public Long getLeastExceptionRate() {
        return this.leastExceptionRate;
    }

}
