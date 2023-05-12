// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class AppTxInfo extends TeaModel {
    // appInfo
    @NameInMap("app_info")
    @Validation(required = true)
    public AppInfo appInfo;

    // Stats
    @NameInMap("stats")
    @Validation(required = true)
    public Stats stats;

    public static AppTxInfo build(java.util.Map<String, ?> map) throws Exception {
        AppTxInfo self = new AppTxInfo();
        return TeaModel.build(map, self);
    }

    public AppTxInfo setAppInfo(AppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public AppInfo getAppInfo() {
        return this.appInfo;
    }

    public AppTxInfo setStats(Stats stats) {
        this.stats = stats;
        return this;
    }
    public Stats getStats() {
        return this.stats;
    }

}
