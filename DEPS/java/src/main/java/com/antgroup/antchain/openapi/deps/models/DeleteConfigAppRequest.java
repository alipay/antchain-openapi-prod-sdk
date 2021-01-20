// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteConfigAppRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的应用参数 id
    @NameInMap("app_param_id")
    public String appParamId;

    public static DeleteConfigAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigAppRequest self = new DeleteConfigAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteConfigAppRequest setAppParamId(String appParamId) {
        this.appParamId = appParamId;
        return this;
    }
    public String getAppParamId() {
        return this.appParamId;
    }

}
