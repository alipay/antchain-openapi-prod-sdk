// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class QueryFaceshieldNativeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户id，标识客户来源
    // 
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 设备token
    // 
    @NameInMap("apdid_token")
    public String apdidToken;

    // 切面数据（JSON，详见下方）
    @NameInMap("aop_data")
    public String aopData;

    // 签名信息	否（和切面二选一即可）
    // 
    @NameInMap("signature")
    public String signature;

    // 签名因子（和切面二选一即可）
    // 
    @NameInMap("sign_factor")
    public String signFactor;

    public static QueryFaceshieldNativeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceshieldNativeRequest self = new QueryFaceshieldNativeRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceshieldNativeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFaceshieldNativeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFaceshieldNativeRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryFaceshieldNativeRequest setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

    public QueryFaceshieldNativeRequest setAopData(String aopData) {
        this.aopData = aopData;
        return this;
    }
    public String getAopData() {
        return this.aopData;
    }

    public QueryFaceshieldNativeRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public QueryFaceshieldNativeRequest setSignFactor(String signFactor) {
        this.signFactor = signFactor;
        return this;
    }
    public String getSignFactor() {
        return this.signFactor;
    }

}
