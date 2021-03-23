// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class DataTransferObject extends TeaModel {
    // 发起方
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 转交方
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 流转备注
    @NameInMap("form_body")
    @Validation(required = true)
    public String formBody;

    // 链上流转记录
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 链上时间戳
    // 
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static DataTransferObject build(java.util.Map<String, ?> map) throws Exception {
        DataTransferObject self = new DataTransferObject();
        return TeaModel.build(map, self);
    }

    public DataTransferObject setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DataTransferObject setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public DataTransferObject setFormBody(String formBody) {
        this.formBody = formBody;
        return this;
    }
    public String getFormBody() {
        return this.formBody;
    }

    public DataTransferObject setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public DataTransferObject setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
