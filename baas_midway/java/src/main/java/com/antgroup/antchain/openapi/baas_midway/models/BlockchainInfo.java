// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baas_midway.models;

import com.aliyun.tea.*;

public class BlockchainInfo extends TeaModel {
    // 链节点ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 区块链名称
    @NameInMap("blockchain_name")
    @Validation(required = true)
    public String blockchainName;

    // 当前链如果为主链，该字段为空；否则该字段为子链对应的主链ID
    @NameInMap("parent_biz_id")
    public String parentBizId;

    public static BlockchainInfo build(java.util.Map<String, ?> map) throws Exception {
        BlockchainInfo self = new BlockchainInfo();
        return TeaModel.build(map, self);
    }

    public BlockchainInfo setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BlockchainInfo setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
        return this;
    }
    public String getBlockchainName() {
        return this.blockchainName;
    }

    public BlockchainInfo setParentBizId(String parentBizId) {
        this.parentBizId = parentBizId;
        return this;
    }
    public String getParentBizId() {
        return this.parentBizId;
    }

}
