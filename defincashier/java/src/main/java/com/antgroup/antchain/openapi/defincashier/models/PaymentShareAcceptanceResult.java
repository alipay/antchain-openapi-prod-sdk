// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class PaymentShareAcceptanceResult extends TeaModel {
    // 外部业务平台原始交易号
    @NameInMap("out_order_id")
    @Validation(required = true)
    public String outOrderId;

    // 外部请求ID，幂等字段
    // 
    @NameInMap("out_request_id")
    @Validation(required = true)
    public String outRequestId;

    // 分账单状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    public static PaymentShareAcceptanceResult build(java.util.Map<String, ?> map) throws Exception {
        PaymentShareAcceptanceResult self = new PaymentShareAcceptanceResult();
        return TeaModel.build(map, self);
    }

    public PaymentShareAcceptanceResult setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public PaymentShareAcceptanceResult setOutRequestId(String outRequestId) {
        this.outRequestId = outRequestId;
        return this;
    }
    public String getOutRequestId() {
        return this.outRequestId;
    }

    public PaymentShareAcceptanceResult setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
