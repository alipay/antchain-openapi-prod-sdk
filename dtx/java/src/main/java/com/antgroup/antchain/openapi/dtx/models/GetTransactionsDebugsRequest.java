// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetTransactionsDebugsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 记录id
    @NameInMap("debug_id")
    @Validation(required = true)
    public Long debugId;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static GetTransactionsDebugsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransactionsDebugsRequest self = new GetTransactionsDebugsRequest();
        return TeaModel.build(map, self);
    }

    public GetTransactionsDebugsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTransactionsDebugsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTransactionsDebugsRequest setDebugId(Long debugId) {
        this.debugId = debugId;
        return this;
    }
    public Long getDebugId() {
        return this.debugId;
    }

    public GetTransactionsDebugsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
