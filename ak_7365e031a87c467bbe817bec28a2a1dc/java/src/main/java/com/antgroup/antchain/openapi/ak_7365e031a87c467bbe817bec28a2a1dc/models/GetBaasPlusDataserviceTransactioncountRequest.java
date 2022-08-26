// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class GetBaasPlusDataserviceTransactioncountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链唯一性标示
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    public static GetBaasPlusDataserviceTransactioncountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBaasPlusDataserviceTransactioncountRequest self = new GetBaasPlusDataserviceTransactioncountRequest();
        return TeaModel.build(map, self);
    }

    public GetBaasPlusDataserviceTransactioncountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBaasPlusDataserviceTransactioncountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetBaasPlusDataserviceTransactioncountRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
