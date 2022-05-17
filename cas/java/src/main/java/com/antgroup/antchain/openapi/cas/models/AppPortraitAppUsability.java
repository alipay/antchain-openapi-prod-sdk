// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAppUsability extends TeaModel {
    // 应用id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用可用性
    @NameInMap("app_usability")
    public Long appUsability;

    // 年同比
    @NameInMap("y2y")
    public String y2y;

    // 原因列表
    @NameInMap("reason_list")
    public java.util.List<String> reasonList;

    public static AppPortraitAppUsability build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAppUsability self = new AppPortraitAppUsability();
        return TeaModel.build(map, self);
    }

    public AppPortraitAppUsability setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppPortraitAppUsability setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppPortraitAppUsability setAppUsability(Long appUsability) {
        this.appUsability = appUsability;
        return this;
    }
    public Long getAppUsability() {
        return this.appUsability;
    }

    public AppPortraitAppUsability setY2y(String y2y) {
        this.y2y = y2y;
        return this;
    }
    public String getY2y() {
        return this.y2y;
    }

    public AppPortraitAppUsability setReasonList(java.util.List<String> reasonList) {
        this.reasonList = reasonList;
        return this;
    }
    public java.util.List<String> getReasonList() {
        return this.reasonList;
    }

}
