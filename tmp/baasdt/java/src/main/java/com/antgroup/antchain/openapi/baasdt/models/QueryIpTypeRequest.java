// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpTypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static QueryIpTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIpTypeRequest self = new QueryIpTypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryIpTypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIpTypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIpTypeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public QueryIpTypeRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
