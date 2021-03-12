// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainResouceForSale extends TeaModel {
    // region_id
    @NameInMap("region_id")
    public String regionId;

    // type_list
    @NameInMap("type_list")
    public java.util.List<String> typeList;

    public static ALiYunChainResouceForSale build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainResouceForSale self = new ALiYunChainResouceForSale();
        return TeaModel.build(map, self);
    }

    public ALiYunChainResouceForSale setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ALiYunChainResouceForSale setTypeList(java.util.List<String> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

}
