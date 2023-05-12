// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class Trend extends TeaModel {
    // 分支事务数趋势图
    @NameInMap("action_trend")
    @Validation(required = true)
    public java.util.List<ActionTrend> actionTrend;

    // 主事务数趋势图
    @NameInMap("activity_trend")
    @Validation(required = true)
    public java.util.List<ActivityTrend> activityTrend;

    // 事务失败数趋势图
    @NameInMap("exception_trend")
    @Validation(required = true)
    public java.util.List<ExceptionTrend> exceptionTrend;

    public static Trend build(java.util.Map<String, ?> map) throws Exception {
        Trend self = new Trend();
        return TeaModel.build(map, self);
    }

    public Trend setActionTrend(java.util.List<ActionTrend> actionTrend) {
        this.actionTrend = actionTrend;
        return this;
    }
    public java.util.List<ActionTrend> getActionTrend() {
        return this.actionTrend;
    }

    public Trend setActivityTrend(java.util.List<ActivityTrend> activityTrend) {
        this.activityTrend = activityTrend;
        return this;
    }
    public java.util.List<ActivityTrend> getActivityTrend() {
        return this.activityTrend;
    }

    public Trend setExceptionTrend(java.util.List<ExceptionTrend> exceptionTrend) {
        this.exceptionTrend = exceptionTrend;
        return this;
    }
    public java.util.List<ExceptionTrend> getExceptionTrend() {
        return this.exceptionTrend;
    }

}
