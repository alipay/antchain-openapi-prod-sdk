// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetAasButleragentPlanurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 业务请求唯一标识
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 方案唯一标识
    @NameInMap("plan_no")
    @Validation(required = true)
    public String planNo;

    // 生成计划书时的用户唯一标识
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    public static GetAasButleragentPlanurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAasButleragentPlanurlRequest self = new GetAasButleragentPlanurlRequest();
        return TeaModel.build(map, self);
    }

    public GetAasButleragentPlanurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAasButleragentPlanurlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetAasButleragentPlanurlRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAasButleragentPlanurlRequest setPlanNo(String planNo) {
        this.planNo = planNo;
        return this;
    }
    public String getPlanNo() {
        return this.planNo;
    }

    public GetAasButleragentPlanurlRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

}
