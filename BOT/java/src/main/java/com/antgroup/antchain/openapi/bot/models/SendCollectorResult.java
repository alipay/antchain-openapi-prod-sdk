// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendCollectorResult extends TeaModel {
    // 数据的链上哈希
    /**
     * <strong>example:</strong>
     * <p>2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 原入参的数组索引
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("original_index")
    @Validation(required = true)
    public Long originalIndex;

    // 失败数据对应的异常码，成功时该字段为空
    /**
     * <strong>example:</strong>
     * <p>params.invalid</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    // 异常信息
    /**
     * <strong>example:</strong>
     * <p>可信设备与DEVICE-ID不匹配</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    // 返回的扩展信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;assetId&quot;:&quot;Q02GYQGAY5&quot;,&quot;labelId&quot;:&quot;86F000001A51A01000003836&quot;}</p>
     */
    @NameInMap("extra_info")
    public String extraInfo;

    public static SendCollectorResult build(java.util.Map<String, ?> map) throws Exception {
        SendCollectorResult self = new SendCollectorResult();
        return TeaModel.build(map, self);
    }

    public SendCollectorResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
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

}
