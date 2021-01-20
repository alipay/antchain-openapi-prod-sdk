// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetConfigTemplateRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用参数模板 id
    @NameInMap("tpl_id")
    public String tplId;

    public static GetConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigTemplateRequest self = new GetConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetConfigTemplateRequest setTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }
    public String getTplId() {
        return this.tplId;
    }

}
