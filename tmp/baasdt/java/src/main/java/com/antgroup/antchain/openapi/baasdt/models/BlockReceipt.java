// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BlockReceipt extends TeaModel {
    // 使用的gas数量
    @NameInMap("gas_used")
    @Validation(required = true)
    public Long gasUsed;

    // 收据log信息
    @NameInMap("logs")
    @Validation(required = true)
    public java.util.List<LogEntry> logs;

    // 交易输出
    @NameInMap("output")
    @Validation(required = true)
    public String output;

    // 交易结果，0为成功
    @NameInMap("result")
    @Validation(required = true)
    public Long result;

    public static BlockReceipt build(java.util.Map<String, ?> map) throws Exception {
        BlockReceipt self = new BlockReceipt();
        return TeaModel.build(map, self);
    }

    public BlockReceipt setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public Long getGasUsed() {
        return this.gasUsed;
    }

    public BlockReceipt setLogs(java.util.List<LogEntry> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<LogEntry> getLogs() {
        return this.logs;
    }

    public BlockReceipt setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public BlockReceipt setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
