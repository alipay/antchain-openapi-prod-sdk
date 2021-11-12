// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AppPreviewTask extends TeaModel {
    // app name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 是否需要部署
    @NameInMap("need_deploy")
    @Validation(required = true)
    public Boolean needDeploy;

    public static AppPreviewTask build(java.util.Map<String, ?> map) throws Exception {
        AppPreviewTask self = new AppPreviewTask();
        return TeaModel.build(map, self);
    }

    public AppPreviewTask setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppPreviewTask setNeedDeploy(Boolean needDeploy) {
        this.needDeploy = needDeploy;
        return this;
    }
    public Boolean getNeedDeploy() {
        return this.needDeploy;
    }

}
