// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ActivityTrend extends TeaModel {
    // 时间点
    @NameInMap("time")
    @Validation(required = true)
    public Long time;

    // 总数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 成功数
    @NameInMap("success")
    @Validation(required = true)
    public Long success;

    // 回滚数
    @NameInMap("rollback")
    @Validation(required = true)
    public Long rollback;

    public static ActivityTrend build(java.util.Map<String, ?> map) throws Exception {
        ActivityTrend self = new ActivityTrend();
        return TeaModel.build(map, self);
    }

    public ActivityTrend setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public ActivityTrend setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ActivityTrend setSuccess(Long success) {
        this.success = success;
        return this;
    }
    public Long getSuccess() {
        return this.success;
    }

    public ActivityTrend setRollback(Long rollback) {
        this.rollback = rollback;
        return this;
    }
    public Long getRollback() {
        return this.rollback;
    }

}
