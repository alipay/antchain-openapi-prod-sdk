// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class FormIndexDTO extends TeaModel {
    // 业务表单ID
    @NameInMap("form_id")
    @Validation(required = true)
    public String formId;

    // 业务表单类型
    @NameInMap("form_type")
    @Validation(required = true)
    public String formType;

    // 块高
    @NameInMap("block_height")
    @Validation(required = true)
    public Long blockHeight;

    // 交易hash
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 交易时间戳
    @NameInMap("tx_timestamp")
    @Validation(required = true)
    public String txTimestamp;

    public static FormIndexDTO build(java.util.Map<String, ?> map) throws Exception {
        FormIndexDTO self = new FormIndexDTO();
        return TeaModel.build(map, self);
    }

    public FormIndexDTO setFormId(String formId) {
        this.formId = formId;
        return this;
    }
    public String getFormId() {
        return this.formId;
    }

    public FormIndexDTO setFormType(String formType) {
        this.formType = formType;
        return this;
    }
    public String getFormType() {
        return this.formType;
    }

    public FormIndexDTO setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public FormIndexDTO setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public FormIndexDTO setTxTimestamp(String txTimestamp) {
        this.txTimestamp = txTimestamp;
        return this;
    }
    public String getTxTimestamp() {
        return this.txTimestamp;
    }

}
