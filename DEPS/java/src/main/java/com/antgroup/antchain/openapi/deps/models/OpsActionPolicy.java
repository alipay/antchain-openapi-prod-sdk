// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsActionPolicy extends TeaModel {
    // 运维动作类型
    @NameInMap("ops_action_type")
    @Validation(required = true)
    public String opsActionType;

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public Long timeout;

    // 检查间隔
    @NameInMap("check_interval")
    @Validation(required = true)
    public Long checkInterval;

    // 重试次数
    @NameInMap("retry_times")
    @Validation(required = true)
    public Long retryTimes;

    public static OpsActionPolicy build(java.util.Map<String, ?> map) throws Exception {
        OpsActionPolicy self = new OpsActionPolicy();
        return TeaModel.build(map, self);
    }

    public OpsActionPolicy setOpsActionType(String opsActionType) {
        this.opsActionType = opsActionType;
        return this;
    }
    public String getOpsActionType() {
        return this.opsActionType;
    }

    public OpsActionPolicy setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public OpsActionPolicy setCheckInterval(Long checkInterval) {
        this.checkInterval = checkInterval;
        return this;
    }
    public Long getCheckInterval() {
        return this.checkInterval;
    }

    public OpsActionPolicy setRetryTimes(Long retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Long getRetryTimes() {
        return this.retryTimes;
    }

}
