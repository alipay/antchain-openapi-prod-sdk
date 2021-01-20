// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryInfo extends TeaModel {
    // action
    @NameInMap("action")
    public String action;

    // check_interval
    @NameInMap("check_interval")
    public Long checkInterval;

    // retry_failed_only
    @NameInMap("retry_failed_only")
    public Boolean retryFailedOnly;

    // retry_times
    @NameInMap("retry_times")
    public Long retryTimes;

    // timeout
    @NameInMap("timeout")
    public Long timeout;

    public static RetryInfo build(java.util.Map<String, ?> map) throws Exception {
        RetryInfo self = new RetryInfo();
        return TeaModel.build(map, self);
    }

    public RetryInfo setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public RetryInfo setCheckInterval(Long checkInterval) {
        this.checkInterval = checkInterval;
        return this;
    }
    public Long getCheckInterval() {
        return this.checkInterval;
    }

    public RetryInfo setRetryFailedOnly(Boolean retryFailedOnly) {
        this.retryFailedOnly = retryFailedOnly;
        return this;
    }
    public Boolean getRetryFailedOnly() {
        return this.retryFailedOnly;
    }

    public RetryInfo setRetryTimes(Long retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Long getRetryTimes() {
        return this.retryTimes;
    }

    public RetryInfo setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
