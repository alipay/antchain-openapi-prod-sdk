// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class WithdrawalOrderDTO extends TeaModel {
    // orderId
    /**
     * <strong>example:</strong>
     * <p>2011</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // orderDesc
    /**
     * <strong>example:</strong>
     * <p>order description test</p>
     */
    @NameInMap("order_desc")
    @Validation(required = true)
    public String orderDesc;

    // orderType
    /**
     * <strong>example:</strong>
     * <p>WITHDRAWAL</p>
     */
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // orderStatus:INIT PENDING_CONFIRMATION PENDING_DEPOSIT RUNNING SUCCESS FAILED EXPIRED_CLOSED REFUND REJECTED
    /**
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // withdrawal Amount
    /**
     * <strong>example:</strong>
     * <p>1.01</p>
     */
    @NameInMap("withdrawal_amount")
    @Validation(required = true)
    public String withdrawalAmount;

    public static WithdrawalOrderDTO build(java.util.Map<String, ?> map) throws Exception {
        WithdrawalOrderDTO self = new WithdrawalOrderDTO();
        return TeaModel.build(map, self);
    }

    public WithdrawalOrderDTO setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WithdrawalOrderDTO setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
        return this;
    }
    public String getOrderDesc() {
        return this.orderDesc;
    }

    public WithdrawalOrderDTO setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public WithdrawalOrderDTO setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public WithdrawalOrderDTO setWithdrawalAmount(String withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
        return this;
    }
    public String getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

}
