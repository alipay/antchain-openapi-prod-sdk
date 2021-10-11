// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryDeductRefundInfo extends TeaModel {
    // PAYERIDNUMBER
    @NameInMap("payer_id")
    @Validation(required = true)
    public String payerId;

    // 退款金额，单位分
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 代扣计划ID
    @NameInMap("order")
    @Validation(required = true)
    public String order;

    // 退款操作发起时间
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    public static ContractNotaryDeductRefundInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractNotaryDeductRefundInfo self = new ContractNotaryDeductRefundInfo();
        return TeaModel.build(map, self);
    }

    public ContractNotaryDeductRefundInfo setPayerId(String payerId) {
        this.payerId = payerId;
        return this;
    }
    public String getPayerId() {
        return this.payerId;
    }

    public ContractNotaryDeductRefundInfo setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public ContractNotaryDeductRefundInfo setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ContractNotaryDeductRefundInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
