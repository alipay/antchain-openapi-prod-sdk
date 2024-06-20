// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushRbbCustomerStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 统一社会信用代码
    @NameInMap("credit_code")
    @Validation(required = true)
    public String creditCode;

    // 相关产品id
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 企业名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 状态编号
    @NameInMap("status_code")
    @Validation(required = true)
    public String statusCode;

    // 状态文本
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static PushRbbCustomerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRbbCustomerStatusRequest self = new PushRbbCustomerStatusRequest();
        return TeaModel.build(map, self);
    }

    public PushRbbCustomerStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRbbCustomerStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRbbCustomerStatusRequest setCreditCode(String creditCode) {
        this.creditCode = creditCode;
        return this;
    }
    public String getCreditCode() {
        return this.creditCode;
    }

    public PushRbbCustomerStatusRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PushRbbCustomerStatusRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public PushRbbCustomerStatusRequest setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public PushRbbCustomerStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
