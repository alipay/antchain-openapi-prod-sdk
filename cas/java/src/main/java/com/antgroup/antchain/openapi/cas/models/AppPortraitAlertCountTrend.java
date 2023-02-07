// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAlertCountTrend extends TeaModel {
    // 日期
    @NameInMap("day")
    @Validation(required = true)
    public String day;

    // 本周期
    @NameInMap("now_cycle")
    @Validation(required = true)
    public Long nowCycle;

    // 上周期
    @NameInMap("last_cycle")
    @Validation(required = true)
    public Long lastCycle;

    public static AppPortraitAlertCountTrend build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAlertCountTrend self = new AppPortraitAlertCountTrend();
        return TeaModel.build(map, self);
    }

    public AppPortraitAlertCountTrend setDay(String day) {
        this.day = day;
        return this;
    }
    public String getDay() {
        return this.day;
    }

    public AppPortraitAlertCountTrend setNowCycle(Long nowCycle) {
        this.nowCycle = nowCycle;
        return this;
    }
    public Long getNowCycle() {
        return this.nowCycle;
    }

    public AppPortraitAlertCountTrend setLastCycle(Long lastCycle) {
        this.lastCycle = lastCycle;
        return this;
    }
    public Long getLastCycle() {
        return this.lastCycle;
    }

}
