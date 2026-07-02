// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class LabelTrace extends TeaModel {
    // 操作内容
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
    @NameInMap("content")
    public String content;

    // 链上哈希
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 上链时间
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
    @NameInMap("tx_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String txTime;

    // 上链失败的错误码
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    // 上链失败的错误信息
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    // 是否上链成功
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_success")
    public Boolean isSuccess;

    // 标签对应资产版本号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Long version;

    public static LabelTrace build(java.util.Map<String, ?> map) throws Exception {
        LabelTrace self = new LabelTrace();
        return TeaModel.build(map, self);
    }

    public LabelTrace setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public LabelTrace setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public LabelTrace setTxTime(String txTime) {
        this.txTime = txTime;
        return this;
    }
    public String getTxTime() {
        return this.txTime;
    }

    public LabelTrace setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public LabelTrace setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public LabelTrace setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public LabelTrace setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
