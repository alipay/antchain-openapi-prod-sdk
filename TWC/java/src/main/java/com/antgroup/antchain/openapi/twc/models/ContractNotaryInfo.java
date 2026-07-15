// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotaryInfo extends TeaModel {
    // 存证地址
    /**
     * <strong>example:</strong>
     * <p>04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 存证相关联的文档ID
    /**
     * <strong>example:</strong>
     * <p>6afb5aa2679c5284444698a9790099269</p>
     */
    @NameInMap("doc_id")
    public String docId;

    // 存证的内容哈希值
    /**
     * <strong>example:</strong>
     * <p>04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269</p>
     */
    @NameInMap("content_hash")
    public String contentHash;

    // 存证事务ID
    /**
     * <strong>example:</strong>
     * <p>61d0147c-5e6d-46e8-8030-5c2fedb6cbc9</p>
     */
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    public static ContractNotaryInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractNotaryInfo self = new ContractNotaryInfo();
        return TeaModel.build(map, self);
    }

    public ContractNotaryInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public ContractNotaryInfo setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public ContractNotaryInfo setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public ContractNotaryInfo setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
