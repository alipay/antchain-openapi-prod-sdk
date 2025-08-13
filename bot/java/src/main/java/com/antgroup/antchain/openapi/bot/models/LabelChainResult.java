// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class LabelChainResult extends TeaModel {
    // 标签ID
    /**
     * <strong>example:</strong>
     * <p>86F000001A51C02000000010</p>
     */
    @NameInMap("label_id")
    @Validation(required = true)
    public String labelId;

    // 业务资产ID，接入方自行定义
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("asset_id")
    public String assetId;

    // 标签最近一次上链的txHash
    /**
     * <strong>example:</strong>
     * <p>855e7ba37a0f227e384691e250f90bb2240adf11839016cf08506c9aa5c11cef</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 错误码
    /**
     * <strong>example:</strong>
     * <p>XXXX</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("error_msg")
    @Validation(required = true)
    public String errorMsg;

    public static LabelChainResult build(java.util.Map<String, ?> map) throws Exception {
        LabelChainResult self = new LabelChainResult();
        return TeaModel.build(map, self);
    }

    public LabelChainResult setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public LabelChainResult setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public LabelChainResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public LabelChainResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public LabelChainResult setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
