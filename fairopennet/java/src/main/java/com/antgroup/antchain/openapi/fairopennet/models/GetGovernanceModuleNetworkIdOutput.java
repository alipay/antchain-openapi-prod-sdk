// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class GetGovernanceModuleNetworkIdOutput extends TeaModel {
    // networkID
    @NameInMap("network_id")
    @Validation(required = true)
    public String networkId;

    public static GetGovernanceModuleNetworkIdOutput build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceModuleNetworkIdOutput self = new GetGovernanceModuleNetworkIdOutput();
        return TeaModel.build(map, self);
    }

    public GetGovernanceModuleNetworkIdOutput setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

}
