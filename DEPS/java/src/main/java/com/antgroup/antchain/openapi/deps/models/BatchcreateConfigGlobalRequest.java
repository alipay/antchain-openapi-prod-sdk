// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BatchcreateConfigGlobalRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 要创建的全局参数列表
    @NameInMap("items")
    public java.util.List<GlobalParam> items;

    public static BatchcreateConfigGlobalRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateConfigGlobalRequest self = new BatchcreateConfigGlobalRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateConfigGlobalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateConfigGlobalRequest setItems(java.util.List<GlobalParam> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GlobalParam> getItems() {
        return this.items;
    }

}
