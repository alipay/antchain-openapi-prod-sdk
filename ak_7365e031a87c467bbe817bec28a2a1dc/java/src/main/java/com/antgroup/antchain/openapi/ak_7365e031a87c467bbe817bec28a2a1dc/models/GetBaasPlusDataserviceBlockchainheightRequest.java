// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class GetBaasPlusDataserviceBlockchainheightRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链的唯一性标示
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    public static GetBaasPlusDataserviceBlockchainheightRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBaasPlusDataserviceBlockchainheightRequest self = new GetBaasPlusDataserviceBlockchainheightRequest();
        return TeaModel.build(map, self);
    }

    public GetBaasPlusDataserviceBlockchainheightRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBaasPlusDataserviceBlockchainheightRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetBaasPlusDataserviceBlockchainheightRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
