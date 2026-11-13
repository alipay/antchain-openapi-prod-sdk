// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRentalPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商家本次扣款请求号,用于定位指令
    // 如果传递返回最新的
    @NameInMap("request_no")
    public String requestNo;

    // 扣款类型 WITHHOLD:代扣 PREAUTH:预授权
    @NameInMap("deduct_type")
    @Validation(required = true)
    public String deductType;

    public static QueryRentalPayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRentalPayRequest self = new QueryRentalPayRequest();
        return TeaModel.build(map, self);
    }

    public QueryRentalPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRentalPayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRentalPayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryRentalPayRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public QueryRentalPayRequest setDeductType(String deductType) {
        this.deductType = deductType;
        return this;
    }
    public String getDeductType() {
        return this.deductType;
    }

}
