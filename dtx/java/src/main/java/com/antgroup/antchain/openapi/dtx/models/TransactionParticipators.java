// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class TransactionParticipators extends TeaModel {
    // 参与者详情列表
    @NameInMap("participators")
    @Validation(required = true)
    public java.util.List<TransactionsParticipator> participators;

    // 事务详情
    @NameInMap("transaction_info")
    @Validation(required = true)
    public TransactionInfo transactionInfo;

    public static TransactionParticipators build(java.util.Map<String, ?> map) throws Exception {
        TransactionParticipators self = new TransactionParticipators();
        return TeaModel.build(map, self);
    }

    public TransactionParticipators setParticipators(java.util.List<TransactionsParticipator> participators) {
        this.participators = participators;
        return this;
    }
    public java.util.List<TransactionsParticipator> getParticipators() {
        return this.participators;
    }

    public TransactionParticipators setTransactionInfo(TransactionInfo transactionInfo) {
        this.transactionInfo = transactionInfo;
        return this;
    }
    public TransactionInfo getTransactionInfo() {
        return this.transactionInfo;
    }

}
