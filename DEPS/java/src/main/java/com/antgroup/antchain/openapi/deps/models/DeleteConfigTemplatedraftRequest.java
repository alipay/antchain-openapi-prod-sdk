// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteConfigTemplatedraftRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的应用参数模板 id
    @NameInMap("tpl_id")
    public String tplId;

    public static DeleteConfigTemplatedraftRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigTemplatedraftRequest self = new DeleteConfigTemplatedraftRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigTemplatedraftRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteConfigTemplatedraftRequest setTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }
    public String getTplId() {
        return this.tplId;
    }

}
