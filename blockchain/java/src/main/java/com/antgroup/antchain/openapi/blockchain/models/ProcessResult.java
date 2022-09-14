// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ProcessResult extends TeaModel {
    // 申请权限的扩展参数
    @NameInMap("extension")
    public String extension;

    // 申请权限原因
    @NameInMap("message")
    public String message;

    // 下一个处理节点ID
    @NameInMap("next")
    public String next;

    // 流程ID
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    // 流程状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 数据对象ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 交易HASH
    @NameInMap("tx_hash")
    public String txHash;

    // 区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    // 授权凭证
    @NameInMap("authority_cert")
    public String authorityCert;

    public static ProcessResult build(java.util.Map<String, ?> map) throws Exception {
        ProcessResult self = new ProcessResult();
        return TeaModel.build(map, self);
    }

    public ProcessResult setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public ProcessResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProcessResult setNext(String next) {
        this.next = next;
        return this;
    }
    public String getNext() {
        return this.next;
    }

    public ProcessResult setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public ProcessResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ProcessResult setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ProcessResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public ProcessResult setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public ProcessResult setAuthorityCert(String authorityCert) {
        this.authorityCert = authorityCert;
        return this;
    }
    public String getAuthorityCert() {
        return this.authorityCert;
    }

}
