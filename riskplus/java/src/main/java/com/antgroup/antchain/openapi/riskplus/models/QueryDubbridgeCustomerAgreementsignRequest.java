// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCustomerAgreementsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户编码
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    // 资金方编号
    @NameInMap("fund_code")
    @Validation(required = true)
    public String fundCode;

    public static QueryDubbridgeCustomerAgreementsignRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCustomerAgreementsignRequest self = new QueryDubbridgeCustomerAgreementsignRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCustomerAgreementsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeCustomerAgreementsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeCustomerAgreementsignRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeCustomerAgreementsignRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeCustomerAgreementsignRequest setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

}
