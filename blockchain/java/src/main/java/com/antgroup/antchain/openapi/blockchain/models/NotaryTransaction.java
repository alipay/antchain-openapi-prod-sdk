// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class NotaryTransaction extends TeaModel {
    // 如果存证类型为text, 则为存证内容
    // 如果存证类型为file,则为存证文件临时下载地址
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 链上存证哈希
    @NameInMap("transaction_hash")
    @Validation(required = true)
    public String transactionHash;

    // 存证类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static NotaryTransaction build(java.util.Map<String, ?> map) throws Exception {
        NotaryTransaction self = new NotaryTransaction();
        return TeaModel.build(map, self);
    }

    public NotaryTransaction setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public NotaryTransaction setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public NotaryTransaction setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
