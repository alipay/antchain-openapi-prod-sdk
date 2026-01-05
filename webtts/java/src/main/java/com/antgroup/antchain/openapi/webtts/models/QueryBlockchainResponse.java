// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class QueryBlockchainResponse extends TeaModel {
    // 链名称
    /**
     * <strong>example:</strong>
     * <p>Ethereum</p>
     */
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 链类型
    /**
     * <strong>example:</strong>
     * <p>EVM</p>
     */
    @NameInMap("chain_type")
    @Validation(required = true)
    public String chainType;

    public static QueryBlockchainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainResponse self = new QueryBlockchainResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainResponse setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public QueryBlockchainResponse setChainType(String chainType) {
        this.chainType = chainType;
        return this;
    }
    public String getChainType() {
        return this.chainType;
    }

}
