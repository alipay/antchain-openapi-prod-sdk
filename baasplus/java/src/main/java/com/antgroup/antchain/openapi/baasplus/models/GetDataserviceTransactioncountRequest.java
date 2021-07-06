// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class GetDataserviceTransactioncountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链唯一性标示
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    public static GetDataserviceTransactioncountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataserviceTransactioncountRequest self = new GetDataserviceTransactioncountRequest();
        return TeaModel.build(map, self);
    }

    public GetDataserviceTransactioncountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDataserviceTransactioncountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDataserviceTransactioncountRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
