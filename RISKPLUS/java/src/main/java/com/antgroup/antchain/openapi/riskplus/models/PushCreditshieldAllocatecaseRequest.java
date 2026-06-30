// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushCreditshieldAllocatecaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 委案信息推送
    @NameInMap("query_code")
    @Validation(required = true)
    public String queryCode;

    // 请求信息json
    @NameInMap("query_infos")
    @Validation(required = true)
    public java.util.List<String> queryInfos;

    public static PushCreditshieldAllocatecaseRequest build(java.util.Map<String, ?> map) throws Exception {
        PushCreditshieldAllocatecaseRequest self = new PushCreditshieldAllocatecaseRequest();
        return TeaModel.build(map, self);
    }

    public PushCreditshieldAllocatecaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushCreditshieldAllocatecaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushCreditshieldAllocatecaseRequest setQueryCode(String queryCode) {
        this.queryCode = queryCode;
        return this;
    }
    public String getQueryCode() {
        return this.queryCode;
    }

    public PushCreditshieldAllocatecaseRequest setQueryInfos(java.util.List<String> queryInfos) {
        this.queryInfos = queryInfos;
        return this;
    }
    public java.util.List<String> getQueryInfos() {
        return this.queryInfos;
    }

}
