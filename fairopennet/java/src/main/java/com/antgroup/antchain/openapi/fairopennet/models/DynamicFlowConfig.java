// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class DynamicFlowConfig extends TeaModel {
    //  
    @NameInMap("network_id")
    @Validation(required = true)
    public String networkId;

    //  
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    //  
    @NameInMap("dsl")
    @Validation(required = true)
    public DynamicDsl dsl;

    public static DynamicFlowConfig build(java.util.Map<String, ?> map) throws Exception {
        DynamicFlowConfig self = new DynamicFlowConfig();
        return TeaModel.build(map, self);
    }

    public DynamicFlowConfig setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DynamicFlowConfig setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DynamicFlowConfig setDsl(DynamicDsl dsl) {
        this.dsl = dsl;
        return this;
    }
    public DynamicDsl getDsl() {
        return this.dsl;
    }

}
