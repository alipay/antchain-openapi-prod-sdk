// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAlertCountTrend extends TeaModel {
    // 日期
    @NameInMap("day")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String day;

    // 本周期
    @NameInMap("now_cycle")
    @Validation(required = true)
    public String nowCycle;

    // 上周期
    @NameInMap("last_cycle")
    @Validation(required = true)
    public String lastCycle;

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

    public AppPortraitAlertCountTrend setNowCycle(String nowCycle) {
        this.nowCycle = nowCycle;
        return this;
    }
    public String getNowCycle() {
        return this.nowCycle;
    }

    public AppPortraitAlertCountTrend setLastCycle(String lastCycle) {
        this.lastCycle = lastCycle;
        return this;
    }
    public String getLastCycle() {
        return this.lastCycle;
    }

}
