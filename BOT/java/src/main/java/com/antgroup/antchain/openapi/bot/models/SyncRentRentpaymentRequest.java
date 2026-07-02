// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SyncRentRentpaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租金缴纳账单ID
    @NameInMap("lease_bill_id")
    @Validation(required = true)
    public String leaseBillId;

    // 租约分期ID
    @NameInMap("bill_item_id")
    @Validation(required = true)
    public String billItemId;

    // 租约支付状态
    @NameInMap("payment_state")
    @Validation(required = true)
    public String paymentState;

    // 支付操作日期，已支付或支付失败需要有值
    @NameInMap("payment_date")
    public String paymentDate;

    public static SyncRentRentpaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRentRentpaymentRequest self = new SyncRentRentpaymentRequest();
        return TeaModel.build(map, self);
    }

    public SyncRentRentpaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncRentRentpaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncRentRentpaymentRequest setLeaseBillId(String leaseBillId) {
        this.leaseBillId = leaseBillId;
        return this;
    }
    public String getLeaseBillId() {
        return this.leaseBillId;
    }

    public SyncRentRentpaymentRequest setBillItemId(String billItemId) {
        this.billItemId = billItemId;
        return this;
    }
    public String getBillItemId() {
        return this.billItemId;
    }

    public SyncRentRentpaymentRequest setPaymentState(String paymentState) {
        this.paymentState = paymentState;
        return this;
    }
    public String getPaymentState() {
        return this.paymentState;
    }

    public SyncRentRentpaymentRequest setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
    public String getPaymentDate() {
        return this.paymentDate;
    }

}
