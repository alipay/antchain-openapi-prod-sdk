// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class NetworkEntranceInfo extends TeaModel {
    //  
    @NameInMap("network_id")
    @Validation(required = true)
    public String networkId;

    //  
    @NameInMap("entrance_info")
    @Validation(required = true)
    public String entranceInfo;

    public static NetworkEntranceInfo build(java.util.Map<String, ?> map) throws Exception {
        NetworkEntranceInfo self = new NetworkEntranceInfo();
        return TeaModel.build(map, self);
    }

    public NetworkEntranceInfo setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public NetworkEntranceInfo setEntranceInfo(String entranceInfo) {
        this.entranceInfo = entranceInfo;
        return this;
    }
    public String getEntranceInfo() {
        return this.entranceInfo;
    }

}
