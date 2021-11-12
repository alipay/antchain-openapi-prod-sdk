// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpCodecollectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础信息
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 正版码ID
    @NameInMap("ip_code")
    @Validation(required = true)
    public String ipCode;

    public static QueryIpCodecollectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIpCodecollectRequest self = new QueryIpCodecollectRequest();
        return TeaModel.build(map, self);
    }

    public QueryIpCodecollectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIpCodecollectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIpCodecollectRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public QueryIpCodecollectRequest setIpCode(String ipCode) {
        this.ipCode = ipCode;
        return this;
    }
    public String getIpCode() {
        return this.ipCode;
    }

}
