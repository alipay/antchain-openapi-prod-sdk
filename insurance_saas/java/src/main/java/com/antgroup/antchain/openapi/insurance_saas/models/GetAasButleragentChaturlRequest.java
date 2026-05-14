// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetAasButleragentChaturlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求唯一流水号
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 您方待认证信息
    @NameInMap("customer_auth_info")
    @Validation(required = true)
    public String customerAuthInfo;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static GetAasButleragentChaturlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAasButleragentChaturlRequest self = new GetAasButleragentChaturlRequest();
        return TeaModel.build(map, self);
    }

    public GetAasButleragentChaturlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAasButleragentChaturlRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAasButleragentChaturlRequest setCustomerAuthInfo(String customerAuthInfo) {
        this.customerAuthInfo = customerAuthInfo;
        return this;
    }
    public String getCustomerAuthInfo() {
        return this.customerAuthInfo;
    }

    public GetAasButleragentChaturlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
