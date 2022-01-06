// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AppMetaDataModel extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用打开链接
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    public static AppMetaDataModel build(java.util.Map<String, ?> map) throws Exception {
        AppMetaDataModel self = new AppMetaDataModel();
        return TeaModel.build(map, self);
    }

    public AppMetaDataModel setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppMetaDataModel setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
