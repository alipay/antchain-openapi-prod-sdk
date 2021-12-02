// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class DeleteModelcategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的模型分组的唯一标识
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    public static DeleteModelcategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelcategoryRequest self = new DeleteModelcategoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelcategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteModelcategoryRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
