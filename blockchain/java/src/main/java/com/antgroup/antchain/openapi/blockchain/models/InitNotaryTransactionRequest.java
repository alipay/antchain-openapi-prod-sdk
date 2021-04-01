// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitNotaryTransactionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户的身份信息
    @NameInMap("customer")
    @Validation(required = true)
    public IdentityParam customer;

    // 扩展字段
    @NameInMap("properties")
    public String properties;

    // 托管用户信息
    @NameInMap("trustee")
    public IdentityParam trustee;

    // 是否使⽤用可信时间戳，默认为false
    @NameInMap("tsr")
    public Boolean tsr;

    public static InitNotaryTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        InitNotaryTransactionRequest self = new InitNotaryTransactionRequest();
        return TeaModel.build(map, self);
    }

    public InitNotaryTransactionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitNotaryTransactionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitNotaryTransactionRequest setCustomer(IdentityParam customer) {
        this.customer = customer;
        return this;
    }
    public IdentityParam getCustomer() {
        return this.customer;
    }

    public InitNotaryTransactionRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public InitNotaryTransactionRequest setTrustee(IdentityParam trustee) {
        this.trustee = trustee;
        return this;
    }
    public IdentityParam getTrustee() {
        return this.trustee;
    }

    public InitNotaryTransactionRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

}
