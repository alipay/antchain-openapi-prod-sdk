// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class TrasactionAppInfo extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // recovery_id
    @NameInMap("recovery_id")
    @Validation(required = true)
    public Long recoveryId;

    public static TrasactionAppInfo build(java.util.Map<String, ?> map) throws Exception {
        TrasactionAppInfo self = new TrasactionAppInfo();
        return TeaModel.build(map, self);
    }

    public TrasactionAppInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public TrasactionAppInfo setRecoveryId(Long recoveryId) {
        this.recoveryId = recoveryId;
        return this;
    }
    public Long getRecoveryId() {
        return this.recoveryId;
    }

}
