// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryDeductExecutionInfo extends TeaModel {
    // 付款方的区块链合同签署账号
    @NameInMap("payer_id")
    @Validation(required = true)
    public String payerId;

    // 扣款金额，单位分
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 扣款渠道
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 扣款操作是否成功
    @NameInMap("result")
    @Validation(required = true)
    public Boolean result;

    // 扣款操作发起时间
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 代扣计划ID
    @NameInMap("order")
    @Validation(required = true)
    public String order;

    public static ContractNotaryDeductExecutionInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractNotaryDeductExecutionInfo self = new ContractNotaryDeductExecutionInfo();
        return TeaModel.build(map, self);
    }

    public ContractNotaryDeductExecutionInfo setPayerId(String payerId) {
        this.payerId = payerId;
        return this;
    }
    public String getPayerId() {
        return this.payerId;
    }

    public ContractNotaryDeductExecutionInfo setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public ContractNotaryDeductExecutionInfo setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ContractNotaryDeductExecutionInfo setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public ContractNotaryDeductExecutionInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ContractNotaryDeductExecutionInfo setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
