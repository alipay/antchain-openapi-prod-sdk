// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateBclPromiserepaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单编号ID,长度不超过32位
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 32)
    public String orderId;

    // 租期编号，如：1表示第一期; 目前还款支持最大期数为120期；
    @NameInMap("period")
    @Validation(required = true, maximum = 120, minimum = 1)
    public Long period;

    public static UpdateBclPromiserepaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBclPromiserepaymentRequest self = new UpdateBclPromiserepaymentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBclPromiserepaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBclPromiserepaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBclPromiserepaymentRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateBclPromiserepaymentRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

}
