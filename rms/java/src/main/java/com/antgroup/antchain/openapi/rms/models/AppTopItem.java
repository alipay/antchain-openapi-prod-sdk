// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AppTopItem extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用TopN统计值，有可能有小数，使用前转换为数值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static AppTopItem build(java.util.Map<String, ?> map) throws Exception {
        AppTopItem self = new AppTopItem();
        return TeaModel.build(map, self);
    }

    public AppTopItem setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppTopItem setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
