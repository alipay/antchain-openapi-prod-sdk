// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserTransactionReceipt extends TeaModel {
    // data
    /**
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // gas_used
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("gas_used")
    @Validation(required = true)
    public Long gasUsed;

    // logs
    /**
     * <strong>example:</strong>
     * <p>awdawd</p>
     */
    @NameInMap("logs")
    @Validation(required = true)
    public java.util.List<String> logs;

    // result
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("result")
    @Validation(required = true)
    public Long result;

    public static BlockchainBrowserTransactionReceipt build(java.util.Map<String, ?> map) throws Exception {
        BlockchainBrowserTransactionReceipt self = new BlockchainBrowserTransactionReceipt();
        return TeaModel.build(map, self);
    }

    public BlockchainBrowserTransactionReceipt setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public BlockchainBrowserTransactionReceipt setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public Long getGasUsed() {
        return this.gasUsed;
    }

    public BlockchainBrowserTransactionReceipt setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    public BlockchainBrowserTransactionReceipt setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
