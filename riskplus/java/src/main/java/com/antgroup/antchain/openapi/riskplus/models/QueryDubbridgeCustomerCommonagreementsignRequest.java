// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCustomerCommonagreementsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 客户编号
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    // 资金方编号
    @NameInMap("fund_no")
    @Validation(required = true)
    public String fundNo;

    public static QueryDubbridgeCustomerCommonagreementsignRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCustomerCommonagreementsignRequest self = new QueryDubbridgeCustomerCommonagreementsignRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCustomerCommonagreementsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeCustomerCommonagreementsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeCustomerCommonagreementsignRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeCustomerCommonagreementsignRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeCustomerCommonagreementsignRequest setFundNo(String fundNo) {
        this.fundNo = fundNo;
        return this;
    }
    public String getFundNo() {
        return this.fundNo;
    }

}
