// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainMiniAppTransaction extends TeaModel {
    // authorized
    @NameInMap("authorized")
    public Boolean authorized;

    // transaction_response
    @NameInMap("transaction_response")
    public String transactionResponse;

    // transaction_receipt
    @NameInMap("transaction_receipt")
    public String transactionReceipt;

    public static ALiYunChainMiniAppTransaction build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainMiniAppTransaction self = new ALiYunChainMiniAppTransaction();
        return TeaModel.build(map, self);
    }

    public ALiYunChainMiniAppTransaction setAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }
    public Boolean getAuthorized() {
        return this.authorized;
    }

    public ALiYunChainMiniAppTransaction setTransactionResponse(String transactionResponse) {
        this.transactionResponse = transactionResponse;
        return this;
    }
    public String getTransactionResponse() {
        return this.transactionResponse;
    }

    public ALiYunChainMiniAppTransaction setTransactionReceipt(String transactionReceipt) {
        this.transactionReceipt = transactionReceipt;
        return this;
    }
    public String getTransactionReceipt() {
        return this.transactionReceipt;
    }

}
