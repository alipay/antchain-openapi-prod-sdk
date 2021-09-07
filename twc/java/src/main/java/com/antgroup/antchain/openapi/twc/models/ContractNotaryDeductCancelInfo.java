// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryDeductCancelInfo extends TeaModel {
    // 付款方的区块链合同签署账号
    @NameInMap("payer_id")
    @Validation(required = true)
    public String payerId;

    // 是否取消成功
    @NameInMap("cancel_status")
    @Validation(required = true)
    public Boolean cancelStatus;

    // 取消操作发起时间
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 代扣订单号，多个订单号之间以‘,’隔开
    @NameInMap("orders")
    @Validation(required = true)
    public String orders;

    public static ContractNotaryDeductCancelInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractNotaryDeductCancelInfo self = new ContractNotaryDeductCancelInfo();
        return TeaModel.build(map, self);
    }

    public ContractNotaryDeductCancelInfo setPayerId(String payerId) {
        this.payerId = payerId;
        return this;
    }
    public String getPayerId() {
        return this.payerId;
    }

    public ContractNotaryDeductCancelInfo setCancelStatus(Boolean cancelStatus) {
        this.cancelStatus = cancelStatus;
        return this;
    }
    public Boolean getCancelStatus() {
        return this.cancelStatus;
    }

    public ContractNotaryDeductCancelInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ContractNotaryDeductCancelInfo setOrders(String orders) {
        this.orders = orders;
        return this;
    }
    public String getOrders() {
        return this.orders;
    }

}
