// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class MiniAppBrowserAuthType extends TeaModel {
    // 授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    public static MiniAppBrowserAuthType build(java.util.Map<String, ?> map) throws Exception {
        MiniAppBrowserAuthType self = new MiniAppBrowserAuthType();
        return TeaModel.build(map, self);
    }

    public MiniAppBrowserAuthType setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
