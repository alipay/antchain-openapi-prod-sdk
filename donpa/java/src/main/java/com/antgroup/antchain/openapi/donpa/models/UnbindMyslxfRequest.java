// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class UnbindMyslxfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 绑定ID
    @NameInMap("bind_id")
    @Validation(required = true)
    public String bindId;

    // 批次ID
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    public static UnbindMyslxfRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindMyslxfRequest self = new UnbindMyslxfRequest();
        return TeaModel.build(map, self);
    }

    public UnbindMyslxfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindMyslxfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindMyslxfRequest setBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }
    public String getBindId() {
        return this.bindId;
    }

    public UnbindMyslxfRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

}
