// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class QueryTokenSymbolResponse extends TeaModel {
    // 链名称
    /**
     * <strong>example:</strong>
     * <p>Ethereum</p>
     */
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>USDC</p>
     */
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    public static QueryTokenSymbolResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenSymbolResponse self = new QueryTokenSymbolResponse();
        return TeaModel.build(map, self);
    }

    public QueryTokenSymbolResponse setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public QueryTokenSymbolResponse setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

}
