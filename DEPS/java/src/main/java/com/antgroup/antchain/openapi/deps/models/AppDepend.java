// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppDepend extends TeaModel {
    // 当前应用名称
    @NameInMap("app_name")
    public String appName;

    // 该应用依赖的所有应用的 id 列表字符串
    @NameInMap("depend_app_names")
    public String dependAppNames;

    // 应用显示名称
    @NameInMap("app_display_name")
    public String appDisplayName;

    public static AppDepend build(java.util.Map<String, ?> map) throws Exception {
        AppDepend self = new AppDepend();
        return TeaModel.build(map, self);
    }

    public AppDepend setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppDepend setDependAppNames(String dependAppNames) {
        this.dependAppNames = dependAppNames;
        return this;
    }
    public String getDependAppNames() {
        return this.dependAppNames;
    }

    public AppDepend setAppDisplayName(String appDisplayName) {
        this.appDisplayName = appDisplayName;
        return this;
    }
    public String getAppDisplayName() {
        return this.appDisplayName;
    }

}
