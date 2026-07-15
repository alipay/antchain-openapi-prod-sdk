// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryDeductExecutionInfo extends TeaModel {
    // 付款方的区块链合同签署账号
    /**
     * <strong>example:</strong>
     * <p>someId</p>
     */
    @NameInMap("payer_id")
    @Validation(required = true)
    public String payerId;

    // 扣款金额，单位分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 扣款渠道
    /**
     * <strong>example:</strong>
     * <p>channel</p>
     */
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 扣款操作是否成功
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("result")
    @Validation(required = true)
    public Boolean result;

    // 扣款操作发起时间
    /**
     * <strong>example:</strong>
     * <p>1589198173000</p>
     */
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 代扣计划ID
    /**
     * <strong>example:</strong>
     * <p>04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269_1</p>
     */
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
