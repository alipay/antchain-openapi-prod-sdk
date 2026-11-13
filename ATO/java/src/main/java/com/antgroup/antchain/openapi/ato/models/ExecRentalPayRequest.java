// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ExecRentalPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商家本次扣款请求号
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    // 扣款金额(分)
    @NameInMap("deduct_amount")
    @Validation(required = true)
    public Long deductAmount;

    // 扣款原因
    @NameInMap("deduct_reason")
    @Validation(required = true)
    public String deductReason;

    // 扣款类型
    // WITHHOLD:代扣
    // PREAUTH:预授权
    @NameInMap("deduct_type")
    @Validation(required = true)
    public String deductType;

    public static ExecRentalPayRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecRentalPayRequest self = new ExecRentalPayRequest();
        return TeaModel.build(map, self);
    }

    public ExecRentalPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecRentalPayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecRentalPayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExecRentalPayRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public ExecRentalPayRequest setDeductAmount(Long deductAmount) {
        this.deductAmount = deductAmount;
        return this;
    }
    public Long getDeductAmount() {
        return this.deductAmount;
    }

    public ExecRentalPayRequest setDeductReason(String deductReason) {
        this.deductReason = deductReason;
        return this;
    }
    public String getDeductReason() {
        return this.deductReason;
    }

    public ExecRentalPayRequest setDeductType(String deductType) {
        this.deductType = deductType;
        return this;
    }
    public String getDeductType() {
        return this.deductType;
    }

}
