// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class Today extends TeaModel {
    // 当天分支事务数
    @NameInMap("action_num")
    @Validation(required = true)
    public Long actionNum;

    // 当天事务数
    @NameInMap("activity_num")
    @Validation(required = true)
    public Long activityNum;

    public static Today build(java.util.Map<String, ?> map) throws Exception {
        Today self = new Today();
        return TeaModel.build(map, self);
    }

    public Today setActionNum(Long actionNum) {
        this.actionNum = actionNum;
        return this;
    }
    public Long getActionNum() {
        return this.actionNum;
    }

    public Today setActivityNum(Long activityNum) {
        this.activityNum = activityNum;
        return this;
    }
    public Long getActivityNum() {
        return this.activityNum;
    }

}
