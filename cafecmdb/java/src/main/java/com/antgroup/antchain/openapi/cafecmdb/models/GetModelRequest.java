// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class GetModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要获取的模型的唯一标识
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    public static GetModelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelRequest self = new GetModelRequest();
        return TeaModel.build(map, self);
    }

    public GetModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetModelRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
