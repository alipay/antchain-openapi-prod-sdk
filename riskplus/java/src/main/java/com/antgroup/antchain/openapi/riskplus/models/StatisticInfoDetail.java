// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class StatisticInfoDetail extends TeaModel {
    // actionDriverCode类型
    @NameInMap("action_driver_code")
    @Validation(required = true)
    public Long actionDriverCode;

    // 调用总数
    @NameInMap("invoke_count")
    @Validation(required = true)
    public Long invokeCount;

    // 成功数
    @NameInMap("success_count")
    @Validation(required = true)
    public Long successCount;

    // 失败数
    @NameInMap("fail_count")
    @Validation(required = true)
    public Long failCount;

    public static StatisticInfoDetail build(java.util.Map<String, ?> map) throws Exception {
        StatisticInfoDetail self = new StatisticInfoDetail();
        return TeaModel.build(map, self);
    }

    public StatisticInfoDetail setActionDriverCode(Long actionDriverCode) {
        this.actionDriverCode = actionDriverCode;
        return this;
    }
    public Long getActionDriverCode() {
        return this.actionDriverCode;
    }

    public StatisticInfoDetail setInvokeCount(Long invokeCount) {
        this.invokeCount = invokeCount;
        return this;
    }
    public Long getInvokeCount() {
        return this.invokeCount;
    }

    public StatisticInfoDetail setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public StatisticInfoDetail setFailCount(Long failCount) {
        this.failCount = failCount;
        return this;
    }
    public Long getFailCount() {
        return this.failCount;
    }

}
