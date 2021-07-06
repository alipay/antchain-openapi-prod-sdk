// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class GetDataserviceBlockchainheightRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链的唯一性标示
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    public static GetDataserviceBlockchainheightRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataserviceBlockchainheightRequest self = new GetDataserviceBlockchainheightRequest();
        return TeaModel.build(map, self);
    }

    public GetDataserviceBlockchainheightRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDataserviceBlockchainheightRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDataserviceBlockchainheightRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
