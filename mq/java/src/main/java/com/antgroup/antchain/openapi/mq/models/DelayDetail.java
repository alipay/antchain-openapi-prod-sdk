// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DelayDetail extends TeaModel {
    // 延迟时间
    @NameInMap("delay_time")
    public String delayTime;

    // store拉取延迟时间
    @NameInMap("store_pull_delay")
    public String storePullDelay;

    // 延迟时间
    @NameInMap("light_write_delay")
    public String lightWriteDelay;

    // 积压数量
    @NameInMap("backlog")
    public Long backlog;

    public static DelayDetail build(java.util.Map<String, ?> map) throws Exception {
        DelayDetail self = new DelayDetail();
        return TeaModel.build(map, self);
    }

    public DelayDetail setDelayTime(String delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public String getDelayTime() {
        return this.delayTime;
    }

    public DelayDetail setStorePullDelay(String storePullDelay) {
        this.storePullDelay = storePullDelay;
        return this;
    }
    public String getStorePullDelay() {
        return this.storePullDelay;
    }

    public DelayDetail setLightWriteDelay(String lightWriteDelay) {
        this.lightWriteDelay = lightWriteDelay;
        return this;
    }
    public String getLightWriteDelay() {
        return this.lightWriteDelay;
    }

    public DelayDetail setBacklog(Long backlog) {
        this.backlog = backlog;
        return this;
    }
    public Long getBacklog() {
        return this.backlog;
    }

}
