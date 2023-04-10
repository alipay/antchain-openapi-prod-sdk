// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class GetNetworkStatusInput extends TeaModel {
    // 网络的networkId
    @NameInMap("network_id")
    @Validation(required = true)
    public String networkId;

    public static GetNetworkStatusInput build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkStatusInput self = new GetNetworkStatusInput();
        return TeaModel.build(map, self);
    }

    public GetNetworkStatusInput setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

}
