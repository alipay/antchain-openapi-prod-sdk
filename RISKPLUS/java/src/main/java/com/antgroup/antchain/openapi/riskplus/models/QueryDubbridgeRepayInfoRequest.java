// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepayInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 原还款订单号
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    public static QueryDubbridgeRepayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepayInfoRequest self = new QueryDubbridgeRepayInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepayInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeRepayInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeRepayInfoRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public QueryDubbridgeRepayInfoRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
