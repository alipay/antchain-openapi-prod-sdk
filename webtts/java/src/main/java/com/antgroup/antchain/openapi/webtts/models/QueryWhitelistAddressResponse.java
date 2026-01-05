// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class QueryWhitelistAddressResponse extends TeaModel {
    // 白名单地址
    /**
     * <strong>example:</strong>
     * <p>0xf5be944e4829aa055957e45bdf1b41175744f0a2</p>
     */
    @NameInMap("whitelist_address")
    @Validation(required = true)
    public String whitelistAddress;

    // 区块链列表信息
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("blockchain_list")
    @Validation(required = true)
    public java.util.List<QueryBlockchainResponse> blockchainList;

    public static QueryWhitelistAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWhitelistAddressResponse self = new QueryWhitelistAddressResponse();
        return TeaModel.build(map, self);
    }

    public QueryWhitelistAddressResponse setWhitelistAddress(String whitelistAddress) {
        this.whitelistAddress = whitelistAddress;
        return this;
    }
    public String getWhitelistAddress() {
        return this.whitelistAddress;
    }

    public QueryWhitelistAddressResponse setBlockchainList(java.util.List<QueryBlockchainResponse> blockchainList) {
        this.blockchainList = blockchainList;
        return this;
    }
    public java.util.List<QueryBlockchainResponse> getBlockchainList() {
        return this.blockchainList;
    }

}
