// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ins_risk.models;

import com.aliyun.tea.*;

public class QuerySecurityPolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // l1_domain_code
    @NameInMap("l1_domain_code")
    @Validation(required = true)
    public String l1DomainCode;

    // l2_domain_code
    @NameInMap("l2_domain_code")
    @Validation(required = true)
    public String l2DomainCode;

    // 请求流水号
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 业务code
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // expectProductCodes
    @NameInMap("expect_product_codes")
    public java.util.List<String> expectProductCodes;

    // 参数
    @NameInMap("params")
    public String params;

    public static QuerySecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityPolicyRequest self = new QuerySecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecurityPolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecurityPolicyRequest setL1DomainCode(String l1DomainCode) {
        this.l1DomainCode = l1DomainCode;
        return this;
    }
    public String getL1DomainCode() {
        return this.l1DomainCode;
    }

    public QuerySecurityPolicyRequest setL2DomainCode(String l2DomainCode) {
        this.l2DomainCode = l2DomainCode;
        return this;
    }
    public String getL2DomainCode() {
        return this.l2DomainCode;
    }

    public QuerySecurityPolicyRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySecurityPolicyRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QuerySecurityPolicyRequest setExpectProductCodes(java.util.List<String> expectProductCodes) {
        this.expectProductCodes = expectProductCodes;
        return this;
    }
    public java.util.List<String> getExpectProductCodes() {
        return this.expectProductCodes;
    }

    public QuerySecurityPolicyRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
