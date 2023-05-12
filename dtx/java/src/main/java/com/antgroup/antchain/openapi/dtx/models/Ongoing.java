// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class Ongoing extends TeaModel {
    // 进行中分支事务数
    @NameInMap("action_num")
    @Validation(required = true)
    public Long actionNum;

    // 进行中事务数
    @NameInMap("activity_num")
    @Validation(required = true)
    public Long activityNum;

    public static Ongoing build(java.util.Map<String, ?> map) throws Exception {
        Ongoing self = new Ongoing();
        return TeaModel.build(map, self);
    }

    public Ongoing setActionNum(Long actionNum) {
        this.actionNum = actionNum;
        return this;
    }
    public Long getActionNum() {
        return this.actionNum;
    }

    public Ongoing setActivityNum(Long activityNum) {
        this.activityNum = activityNum;
        return this;
    }
    public Long getActivityNum() {
        return this.activityNum;
    }

}
