// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAssetContractInfo extends TeaModel {
    // 资产类型：ERC721 / ERC1155
    @NameInMap("erc_type")
    public String ercType;

    // 资产总量
    @NameInMap("asset_count")
    public Long assetCount;

    // 持有者总量
    @NameInMap("owner_count")
    public Long ownerCount;

    public static ChainInsightAssetContractInfo build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAssetContractInfo self = new ChainInsightAssetContractInfo();
        return TeaModel.build(map, self);
    }

    public ChainInsightAssetContractInfo setErcType(String ercType) {
        this.ercType = ercType;
        return this;
    }
    public String getErcType() {
        return this.ercType;
    }

    public ChainInsightAssetContractInfo setAssetCount(Long assetCount) {
        this.assetCount = assetCount;
        return this;
    }
    public Long getAssetCount() {
        return this.assetCount;
    }

    public ChainInsightAssetContractInfo setOwnerCount(Long ownerCount) {
        this.ownerCount = ownerCount;
        return this;
    }
    public Long getOwnerCount() {
        return this.ownerCount;
    }

}
