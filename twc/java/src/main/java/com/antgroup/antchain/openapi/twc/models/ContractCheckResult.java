// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractCheckResult extends TeaModel {
    // 交易hash
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 订单id
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 合约执行结果，Base64编码后的
    /**
     * <strong>example:</strong>
     * <p>afafafdfa</p>
     */
    @NameInMap("content_base64")
    public String contentBase64;

    // 块高
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("block_number")
    public Long blockNumber;

    // 消耗gas量
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("gas_used")
    public Long gasUsed;

    // log信息
    /**
     * <strong>example:</strong>
     * <p>adafada</p>
     */
    @NameInMap("log_base64")
    public String logBase64;

    public static ContractCheckResult build(java.util.Map<String, ?> map) throws Exception {
        ContractCheckResult self = new ContractCheckResult();
        return TeaModel.build(map, self);
    }

    public ContractCheckResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public ContractCheckResult setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ContractCheckResult setContentBase64(String contentBase64) {
        this.contentBase64 = contentBase64;
        return this;
    }
    public String getContentBase64() {
        return this.contentBase64;
    }

    public ContractCheckResult setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public ContractCheckResult setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public Long getGasUsed() {
        return this.gasUsed;
    }

    public ContractCheckResult setLogBase64(String logBase64) {
        this.logBase64 = logBase64;
        return this;
    }
    public String getLogBase64() {
        return this.logBase64;
    }

}
