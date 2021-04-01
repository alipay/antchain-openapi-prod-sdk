// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardBillingcontractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求结构
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 认证平台ID 本期支付宝用户ID
    @NameInMap("certification_id")
    @Validation(required = true)
    public String certificationId;

    public static QueryConsumecardBillingcontractRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardBillingcontractRequest self = new QueryConsumecardBillingcontractRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardBillingcontractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConsumecardBillingcontractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryConsumecardBillingcontractRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public QueryConsumecardBillingcontractRequest setCertificationId(String certificationId) {
        this.certificationId = certificationId;
        return this;
    }
    public String getCertificationId() {
        return this.certificationId;
    }

}
