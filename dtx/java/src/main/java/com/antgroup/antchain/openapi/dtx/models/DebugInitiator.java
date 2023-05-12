// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class DebugInitiator extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 数据源名
    @NameInMap("ds_name")
    @Validation(required = true)
    public String dsName;

    // 主事务记录表
    @NameInMap("activity_table_name")
    @Validation(required = true)
    public String activityTableName;

    public static DebugInitiator build(java.util.Map<String, ?> map) throws Exception {
        DebugInitiator self = new DebugInitiator();
        return TeaModel.build(map, self);
    }

    public DebugInitiator setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DebugInitiator setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

    public DebugInitiator setActivityTableName(String activityTableName) {
        this.activityTableName = activityTableName;
        return this;
    }
    public String getActivityTableName() {
        return this.activityTableName;
    }

}
