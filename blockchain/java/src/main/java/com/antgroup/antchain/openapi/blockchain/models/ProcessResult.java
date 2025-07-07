// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ProcessResult extends TeaModel {
    // 申请权限的扩展参数
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("extension")
    public String extension;

    // 申请权限原因
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("message")
    public String message;

    // 下一个处理节点ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("next")
    public String next;

    // 流程ID
    /**
     * <strong>example:</strong>
     * <p>68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a</p>
     */
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    // 流程状态
    /**
     * <strong>example:</strong>
     * <p>processing</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 数据对象ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 交易HASH
    /**
     * <strong>example:</strong>
     * <p>AQEETAAAAEEAAAAETbYFwqfIiyqFWt2Tasr2f4</p>
     */
    @NameInMap("tx_hash")
    public String txHash;

    // 区块高度
    /**
     * <strong>example:</strong>
     * <p>1256</p>
     */
    @NameInMap("block_number")
    public Long blockNumber;

    // 授权凭证
    /**
     * <strong>example:</strong>
     * <p>JSON格式</p>
     */
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
