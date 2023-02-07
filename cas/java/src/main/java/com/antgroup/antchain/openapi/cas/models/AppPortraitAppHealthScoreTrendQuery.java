// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAppHealthScoreTrendQuery extends TeaModel {
    // 日期
    @NameInMap("day")
    public String day;

    // 健康分分值
    @NameInMap("health_score")
    public Long healthScore;

    public static AppPortraitAppHealthScoreTrendQuery build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAppHealthScoreTrendQuery self = new AppPortraitAppHealthScoreTrendQuery();
        return TeaModel.build(map, self);
    }

    public AppPortraitAppHealthScoreTrendQuery setDay(String day) {
        this.day = day;
        return this;
    }
    public String getDay() {
        return this.day;
    }

    public AppPortraitAppHealthScoreTrendQuery setHealthScore(Long healthScore) {
        this.healthScore = healthScore;
        return this;
    }
    public Long getHealthScore() {
        return this.healthScore;
    }

}
