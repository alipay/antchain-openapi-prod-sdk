// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class StatisticInfoDetail extends TeaModel {
    // actionDriverCode类型
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("action_driver_code")
    public Long actionDriverCode;

    // 成功数
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("success_count")
    public Long successCount;

    // 失败数
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("fail_count")
    public Long failCount;

    // 待触达的手机号数
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("waiting_sub_task_count")
    public Long waitingSubTaskCount;

    // 已收到的回执数
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total_count")
    public Long totalCount;

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

    public StatisticInfoDetail setWaitingSubTaskCount(Long waitingSubTaskCount) {
        this.waitingSubTaskCount = waitingSubTaskCount;
        return this;
    }
    public Long getWaitingSubTaskCount() {
        return this.waitingSubTaskCount;
    }

    public StatisticInfoDetail setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
