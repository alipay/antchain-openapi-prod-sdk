// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryBenefithubReportInformationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 业务分配的平台code，8位纯大写字母code
    @NameInMap("platform_code")
    @Validation(required = true)
    public String platformCode;

    // 产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 平台code、用户唯一ID 组合出全局唯一id
    @NameInMap("user_unique_id")
    @Validation(required = true)
    public String userUniqueId;

    public static QueryBenefithubReportInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBenefithubReportInformationRequest self = new QueryBenefithubReportInformationRequest();
        return TeaModel.build(map, self);
    }

    public QueryBenefithubReportInformationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBenefithubReportInformationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBenefithubReportInformationRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryBenefithubReportInformationRequest setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }
    public String getPlatformCode() {
        return this.platformCode;
    }

    public QueryBenefithubReportInformationRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryBenefithubReportInformationRequest setUserUniqueId(String userUniqueId) {
        this.userUniqueId = userUniqueId;
        return this;
    }
    public String getUserUniqueId() {
        return this.userUniqueId;
    }

}
