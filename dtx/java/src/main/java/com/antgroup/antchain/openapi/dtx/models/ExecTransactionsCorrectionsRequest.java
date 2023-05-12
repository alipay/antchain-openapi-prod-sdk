// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ExecTransactionsCorrectionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 执行事务订正 id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // instanceId
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static ExecTransactionsCorrectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecTransactionsCorrectionsRequest self = new ExecTransactionsCorrectionsRequest();
        return TeaModel.build(map, self);
    }

    public ExecTransactionsCorrectionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecTransactionsCorrectionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecTransactionsCorrectionsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExecTransactionsCorrectionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
