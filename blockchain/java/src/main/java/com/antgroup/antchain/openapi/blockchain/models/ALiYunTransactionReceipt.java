// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunTransactionReceipt extends TeaModel {
    // data
    /**
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("data")
    public String data;

    // gas_used
    /**
     * <strong>example:</strong>
     * <p>gas_used</p>
     */
    @NameInMap("gas_used")
    public String gasUsed;

    // result
    /**
     * <strong>example:</strong>
     * <p>result</p>
     */
    @NameInMap("result")
    public Long result;

    // logs
    /**
     * <strong>example:</strong>
     * <p>logs</p>
     */
    @NameInMap("logs")
    public java.util.List<String> logs;

    public static ALiYunTransactionReceipt build(java.util.Map<String, ?> map) throws Exception {
        ALiYunTransactionReceipt self = new ALiYunTransactionReceipt();
        return TeaModel.build(map, self);
    }

    public ALiYunTransactionReceipt setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ALiYunTransactionReceipt setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public String getGasUsed() {
        return this.gasUsed;
    }

    public ALiYunTransactionReceipt setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

    public ALiYunTransactionReceipt setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

}
