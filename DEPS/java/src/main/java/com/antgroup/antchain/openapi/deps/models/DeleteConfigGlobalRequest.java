// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteConfigGlobalRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的全局参数 id
    @NameInMap("global_param_id")
    public String globalParamId;

    public static DeleteConfigGlobalRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigGlobalRequest self = new DeleteConfigGlobalRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigGlobalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteConfigGlobalRequest setGlobalParamId(String globalParamId) {
        this.globalParamId = globalParamId;
        return this;
    }
    public String getGlobalParamId() {
        return this.globalParamId;
    }

}
