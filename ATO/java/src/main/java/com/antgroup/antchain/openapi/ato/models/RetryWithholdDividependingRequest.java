// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RetryWithholdDividependingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 第几期
    @NameInMap("period_num")
    @Validation(required = true, minimum = 1)
    public Long periodNum;

    public static RetryWithholdDividependingRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryWithholdDividependingRequest self = new RetryWithholdDividependingRequest();
        return TeaModel.build(map, self);
    }

    public RetryWithholdDividependingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryWithholdDividependingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetryWithholdDividependingRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RetryWithholdDividependingRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

}
