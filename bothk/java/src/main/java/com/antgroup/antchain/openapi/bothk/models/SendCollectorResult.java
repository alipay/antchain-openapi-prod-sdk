// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class SendCollectorResult extends TeaModel {
    // 原入参的数组索引
    // 
    @NameInMap("original_index")
    @Validation(required = true)
    public Long originalIndex;

    // 失败数据对应的异常码，成功时该字段为空
    @NameInMap("error_code")
    public String errorCode;

    // 异常信息
    @NameInMap("error_msg")
    public String errorMsg;

    // 返回的扩展信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 数据的链上哈希
    @NameInMap("tx_hash")
    public String txHash;

    public static SendCollectorResult build(java.util.Map<String, ?> map) throws Exception {
        SendCollectorResult self = new SendCollectorResult();
        return TeaModel.build(map, self);
    }

    public SendCollectorResult setOriginalIndex(Long originalIndex) {
        this.originalIndex = originalIndex;
        return this;
    }
    public Long getOriginalIndex() {
        return this.originalIndex;
    }

    public SendCollectorResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SendCollectorResult setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SendCollectorResult setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SendCollectorResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
