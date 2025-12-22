// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class NotaryCheckResult extends TeaModel {
    // 存证所在区块高度
    /**
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("block_height")
    @Validation(required = true)
    public Long blockHeight;

    // 核验结果错误码
    /**
     * <strong>example:</strong>
     * <p>错误码</p>
     */
    @NameInMap("error_code")
    @Validation(required = true)
    public Long errorCode;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>Permission denied</p>
     */
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    // 存证时间
    /**
     * <strong>example:</strong>
     * <p>2020-01-08 11:48:21</p>
     */
    @NameInMap("notary_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String notaryTime;

    // 存证类型
    /**
     * <strong>example:</strong>
     * <p>FileNotary</p>
     */
    @NameInMap("notary_type")
    @Validation(required = true)
    public String notaryType;

    // 核验是否成功
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("result")
    @Validation(required = true)
    public Boolean result;

    // 存证事务ID
    /**
     * <strong>example:</strong>
     * <p>1a273ba1-b4c2-4bfe-93fc-c5997f3bcee9</p>
     */
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 交易哈希
    /**
     * <strong>example:</strong>
     * <p>aac0cf38b6072352f6b3be4cc0a3cf3950058472eacdda91e6723d75e2994567</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 区块哈希
    /**
     * <strong>example:</strong>
     * <p>c3a50d4a7b521d4de13cefb02e5368b616e619d8fab5469298facacfbb39239b</p>
     */
    @NameInMap("block_hash")
    @Validation(required = true)
    public String blockHash;

    // 存证阶段
    /**
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    public static NotaryCheckResult build(java.util.Map<String, ?> map) throws Exception {
        NotaryCheckResult self = new NotaryCheckResult();
        return TeaModel.build(map, self);
    }

    public NotaryCheckResult setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public NotaryCheckResult setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public NotaryCheckResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public NotaryCheckResult setNotaryTime(String notaryTime) {
        this.notaryTime = notaryTime;
        return this;
    }
    public String getNotaryTime() {
        return this.notaryTime;
    }

    public NotaryCheckResult setNotaryType(String notaryType) {
        this.notaryType = notaryType;
        return this;
    }
    public String getNotaryType() {
        return this.notaryType;
    }

    public NotaryCheckResult setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public NotaryCheckResult setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public NotaryCheckResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public NotaryCheckResult setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public NotaryCheckResult setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
