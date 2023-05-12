// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class AppActionVO extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 参与者名称数组
    @NameInMap("action_array")
    @Validation(required = true)
    public java.util.List<String> actionArray;

    public static AppActionVO build(java.util.Map<String, ?> map) throws Exception {
        AppActionVO self = new AppActionVO();
        return TeaModel.build(map, self);
    }

    public AppActionVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppActionVO setActionArray(java.util.List<String> actionArray) {
        this.actionArray = actionArray;
        return this;
    }
    public java.util.List<String> getActionArray() {
        return this.actionArray;
    }

}
