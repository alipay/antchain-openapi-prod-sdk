// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAppHealthScoreQuery extends TeaModel {
    // 应用id
    @NameInMap("app_id")
    public String appId;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // health_score
    @NameInMap("health_score")
    public Long healthScore;

    // 同比上升下降分数
    @NameInMap("y2y")
    public Long y2y;

    // 上升下降原因列表
    @NameInMap("reason_list")
    public java.util.List<String> reasonList;

    public static AppPortraitAppHealthScoreQuery build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAppHealthScoreQuery self = new AppPortraitAppHealthScoreQuery();
        return TeaModel.build(map, self);
    }

    public AppPortraitAppHealthScoreQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppPortraitAppHealthScoreQuery setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppPortraitAppHealthScoreQuery setHealthScore(Long healthScore) {
        this.healthScore = healthScore;
        return this;
    }
    public Long getHealthScore() {
        return this.healthScore;
    }

    public AppPortraitAppHealthScoreQuery setY2y(Long y2y) {
        this.y2y = y2y;
        return this;
    }
    public Long getY2y() {
        return this.y2y;
    }

    public AppPortraitAppHealthScoreQuery setReasonList(java.util.List<String> reasonList) {
        this.reasonList = reasonList;
        return this;
    }
    public java.util.List<String> getReasonList() {
        return this.reasonList;
    }

}
