// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubheUsecreditStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用信申请订单号
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 请求网络流水号
    @NameInMap("order_on")
    @Validation(required = true)
    public String orderOn;

    public static QueryDubheUsecreditStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubheUsecreditStatusRequest self = new QueryDubheUsecreditStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubheUsecreditStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubheUsecreditStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubheUsecreditStatusRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public QueryDubheUsecreditStatusRequest setOrderOn(String orderOn) {
        this.orderOn = orderOn;
        return this;
    }
    public String getOrderOn() {
        return this.orderOn;
    }

}
