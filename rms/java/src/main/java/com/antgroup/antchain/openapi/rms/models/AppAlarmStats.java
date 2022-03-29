// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AppAlarmStats extends TeaModel {
    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // count
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static AppAlarmStats build(java.util.Map<String, ?> map) throws Exception {
        AppAlarmStats self = new AppAlarmStats();
        return TeaModel.build(map, self);
    }

    public AppAlarmStats setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppAlarmStats setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
