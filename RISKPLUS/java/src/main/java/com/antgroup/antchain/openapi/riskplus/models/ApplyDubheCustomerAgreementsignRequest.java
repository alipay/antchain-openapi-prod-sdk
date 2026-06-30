// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubheCustomerAgreementsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户编号
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    public static ApplyDubheCustomerAgreementsignRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubheCustomerAgreementsignRequest self = new ApplyDubheCustomerAgreementsignRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubheCustomerAgreementsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubheCustomerAgreementsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubheCustomerAgreementsignRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public ApplyDubheCustomerAgreementsignRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
