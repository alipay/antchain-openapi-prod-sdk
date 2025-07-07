// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainRegion extends TeaModel {
    // region_id
    /**
     * <strong>example:</strong>
     * <p>region_id</p>
     */
    @NameInMap("region_id")
    public String regionId;

    // region_name
    /**
     * <strong>example:</strong>
     * <p>region_name</p>
     */
    @NameInMap("region_name")
    public String regionName;

    public static ALiYunChainRegion build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainRegion self = new ALiYunChainRegion();
        return TeaModel.build(map, self);
    }

    public ALiYunChainRegion setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ALiYunChainRegion setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

}
