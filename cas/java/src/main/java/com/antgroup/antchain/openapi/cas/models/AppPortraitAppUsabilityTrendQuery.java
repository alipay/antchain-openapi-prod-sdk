// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAppUsabilityTrendQuery extends TeaModel {
    // 时间以天为单位
    @NameInMap("day")
    public String day;

    // 应用可用性
    @NameInMap("app_usability")
    public String appUsability;

    public static AppPortraitAppUsabilityTrendQuery build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAppUsabilityTrendQuery self = new AppPortraitAppUsabilityTrendQuery();
        return TeaModel.build(map, self);
    }

    public AppPortraitAppUsabilityTrendQuery setDay(String day) {
        this.day = day;
        return this;
    }
    public String getDay() {
        return this.day;
    }

    public AppPortraitAppUsabilityTrendQuery setAppUsability(String appUsability) {
        this.appUsability = appUsability;
        return this;
    }
    public String getAppUsability() {
        return this.appUsability;
    }

}
