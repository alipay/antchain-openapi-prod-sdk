// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ins_risk.models;

import com.aliyun.tea.*;

public class QueryScorePolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求流水号，保证唯一
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 业务编码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 产品编码
    @NameInMap("expect_product_code")
    @Validation(required = true)
    public String expectProductCode;

    // 请求参数
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    public static QueryScorePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScorePolicyRequest self = new QueryScorePolicyRequest();
        return TeaModel.build(map, self);
    }

    public QueryScorePolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryScorePolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryScorePolicyRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryScorePolicyRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QueryScorePolicyRequest setExpectProductCode(String expectProductCode) {
        this.expectProductCode = expectProductCode;
        return this;
    }
    public String getExpectProductCode() {
        return this.expectProductCode;
    }

    public QueryScorePolicyRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
