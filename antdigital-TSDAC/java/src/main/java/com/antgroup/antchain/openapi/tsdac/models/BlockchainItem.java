// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class BlockchainItem extends TeaModel {
    // 链名称
    /**
     * <strong>example:</strong>
     * <p>链名称</p>
     */
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 链类型
    /**
     * <strong>example:</strong>
     * <p>链类型</p>
     */
    @NameInMap("chain_type")
    @Validation(required = true)
    public String chainType;

    public static BlockchainItem build(java.util.Map<String, ?> map) throws Exception {
        BlockchainItem self = new BlockchainItem();
        return TeaModel.build(map, self);
    }

    public BlockchainItem setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public BlockchainItem setChainType(String chainType) {
        this.chainType = chainType;
        return this;
    }
    public String getChainType() {
        return this.chainType;
    }

}
