// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BatchcreateConfigAppRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 要创建的应用参数列表
    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<AppParam> items;

    public static BatchcreateConfigAppRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateConfigAppRequest self = new BatchcreateConfigAppRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateConfigAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateConfigAppRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public BatchcreateConfigAppRequest setItems(java.util.List<AppParam> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AppParam> getItems() {
        return this.items;
    }

}
