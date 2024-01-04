// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class RetryAntchainAtoWithholdPlanRequest extends TeaModel {
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

    public static RetryAntchainAtoWithholdPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryAntchainAtoWithholdPlanRequest self = new RetryAntchainAtoWithholdPlanRequest();
        return TeaModel.build(map, self);
    }

    public RetryAntchainAtoWithholdPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryAntchainAtoWithholdPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetryAntchainAtoWithholdPlanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RetryAntchainAtoWithholdPlanRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

}
