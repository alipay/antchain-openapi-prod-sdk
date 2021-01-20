// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetCmdtemplateRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 指令模板ID
    @NameInMap("id")
    public String id;

    public static GetCmdtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCmdtemplateRequest self = new GetCmdtemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetCmdtemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCmdtemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
