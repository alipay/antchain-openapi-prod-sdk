// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunLatestTransaction extends TeaModel {
    // hash
    /**
     * <strong>example:</strong>
     * <p>hash</p>
     */
    @NameInMap("hash")
    public String hash;

    // transaction_v10_type
    /**
     * <strong>example:</strong>
     * <p>transaction_v10_type</p>
     */
    @NameInMap("transaction_v10_type")
    public String transactionV10Type;

    // trans_type_v6
    /**
     * <strong>example:</strong>
     * <p>trans_type_v6</p>
     */
    @NameInMap("trans_type_v6")
    public String transTypeV6;

    // from
    /**
     * <strong>example:</strong>
     * <p>from</p>
     */
    @NameInMap("from")
    public String from;

    // to
    /**
     * <strong>example:</strong>
     * <p>to</p>
     */
    @NameInMap("to")
    public String to;

    // create_time
    /**
     * <strong>example:</strong>
     * <p>1231231231</p>
     */
    @NameInMap("create_time")
    public Long createTime;

    public static ALiYunLatestTransaction build(java.util.Map<String, ?> map) throws Exception {
        ALiYunLatestTransaction self = new ALiYunLatestTransaction();
        return TeaModel.build(map, self);
    }

    public ALiYunLatestTransaction setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public ALiYunLatestTransaction setTransactionV10Type(String transactionV10Type) {
        this.transactionV10Type = transactionV10Type;
        return this;
    }
    public String getTransactionV10Type() {
        return this.transactionV10Type;
    }

    public ALiYunLatestTransaction setTransTypeV6(String transTypeV6) {
        this.transTypeV6 = transTypeV6;
        return this;
    }
    public String getTransTypeV6() {
        return this.transTypeV6;
    }

    public ALiYunLatestTransaction setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ALiYunLatestTransaction setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public ALiYunLatestTransaction setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

}
