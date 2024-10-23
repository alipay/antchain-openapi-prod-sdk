// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInsureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户的订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 保险类型枚举，PERFORMANCE：履约
    @NameInMap("insure_product_type")
    @Validation(required = true)
    public String insureProductType;

    // 保险公司枚举，PA：平安保险
    @NameInMap("insure_company_type")
    @Validation(required = true)
    public String insureCompanyType;

    public static QueryInsureRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInsureRequest self = new QueryInsureRequest();
        return TeaModel.build(map, self);
    }

    public QueryInsureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInsureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInsureRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryInsureRequest setInsureProductType(String insureProductType) {
        this.insureProductType = insureProductType;
        return this;
    }
    public String getInsureProductType() {
        return this.insureProductType;
    }

    public QueryInsureRequest setInsureCompanyType(String insureCompanyType) {
        this.insureCompanyType = insureCompanyType;
        return this;
    }
    public String getInsureCompanyType() {
        return this.insureCompanyType;
    }

}
