// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TsrResponse extends TeaModel {
    // hash后的信息
    /**
     * <strong>example:</strong>
     * <p>AAAAA </p>
     */
    @NameInMap("hashed_message")
    @Validation(required = true)
    public String hashedMessage;

    // 哈希算法
    /**
     * <strong>example:</strong>
     * <p>321</p>
     */
    @NameInMap("hash_algorithm")
    @Validation(required = true)
    public String hashAlgorithm;

    // 时间
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ts")
    @Validation(required = true)
    public String ts;

    public static TsrResponse build(java.util.Map<String, ?> map) throws Exception {
        TsrResponse self = new TsrResponse();
        return TeaModel.build(map, self);
    }

    public TsrResponse setHashedMessage(String hashedMessage) {
        this.hashedMessage = hashedMessage;
        return this;
    }
    public String getHashedMessage() {
        return this.hashedMessage;
    }

    public TsrResponse setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public TsrResponse setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
