// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpGoodsupdateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ipid的列表，最多20个
    @NameInMap("ip_ids")
    @Validation(required = true)
    public java.util.List<String> ipIds;

    public static QueryIpGoodsupdateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIpGoodsupdateRequest self = new QueryIpGoodsupdateRequest();
        return TeaModel.build(map, self);
    }

    public QueryIpGoodsupdateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIpGoodsupdateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIpGoodsupdateRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public QueryIpGoodsupdateRequest setIpIds(java.util.List<String> ipIds) {
        this.ipIds = ipIds;
        return this;
    }
    public java.util.List<String> getIpIds() {
        return this.ipIds;
    }

}
