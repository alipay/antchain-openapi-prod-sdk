// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RetryWithholdPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50)
    public String orderId;

    // 第几期
    @NameInMap("period_num")
    @Validation(required = true, minimum = 1)
    public Long periodNum;

    public static RetryWithholdPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryWithholdPlanRequest self = new RetryWithholdPlanRequest();
        return TeaModel.build(map, self);
    }

    public RetryWithholdPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryWithholdPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetryWithholdPlanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RetryWithholdPlanRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

}
