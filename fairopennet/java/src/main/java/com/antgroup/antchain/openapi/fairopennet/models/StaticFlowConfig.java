// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class StaticFlowConfig extends TeaModel {
    //  
    @NameInMap("network_id")
    @Validation(required = true)
    public String networkId;

    //  
    @NameInMap("dsl")
    @Validation(required = true)
    public StaticDsl dsl;

    public static StaticFlowConfig build(java.util.Map<String, ?> map) throws Exception {
        StaticFlowConfig self = new StaticFlowConfig();
        return TeaModel.build(map, self);
    }

    public StaticFlowConfig setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public StaticFlowConfig setDsl(StaticDsl dsl) {
        this.dsl = dsl;
        return this;
    }
    public StaticDsl getDsl() {
        return this.dsl;
    }

}
