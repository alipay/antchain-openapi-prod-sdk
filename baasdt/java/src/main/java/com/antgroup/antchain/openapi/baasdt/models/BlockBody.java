// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BlockBody extends TeaModel {
    // 区块共识证明(HEX)
    @NameInMap("consensus_proof")
    @Validation(required = true)
    public String consensusProof;

    // 区块中交易回执列表
    @NameInMap("receipt_list")
    @Validation(required = true)
    public java.util.List<BlockReceipt> receiptList;

    // 区块中交易列表
    @NameInMap("transaction_list")
    @Validation(required = true)
    public java.util.List<BlockTransaction> transactionList;

    public static BlockBody build(java.util.Map<String, ?> map) throws Exception {
        BlockBody self = new BlockBody();
        return TeaModel.build(map, self);
    }

    public BlockBody setConsensusProof(String consensusProof) {
        this.consensusProof = consensusProof;
        return this;
    }
    public String getConsensusProof() {
        return this.consensusProof;
    }

    public BlockBody setReceiptList(java.util.List<BlockReceipt> receiptList) {
        this.receiptList = receiptList;
        return this;
    }
    public java.util.List<BlockReceipt> getReceiptList() {
        return this.receiptList;
    }

    public BlockBody setTransactionList(java.util.List<BlockTransaction> transactionList) {
        this.transactionList = transactionList;
        return this;
    }
    public java.util.List<BlockTransaction> getTransactionList() {
        return this.transactionList;
    }

}
