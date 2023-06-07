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

    // 业务错误码(为空表示成功，否则为业务错误码)
    @NameInMap("sub_code")
    public String subCode;

    // 业务错误描述
    @NameInMap("sub_msg")
    public String subMsg;

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

    public PaymentShareAcceptanceResult setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public PaymentShareAcceptanceResult setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
