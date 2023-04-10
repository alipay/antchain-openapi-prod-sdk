// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class NetworkStatusInfo extends TeaModel {
    // 协作网络状态枚举类型
    @NameInMap("network_status")
    @Validation(required = true)
    public String networkStatus;

    public static NetworkStatusInfo build(java.util.Map<String, ?> map) throws Exception {
        NetworkStatusInfo self = new NetworkStatusInfo();
        return TeaModel.build(map, self);
    }

    public NetworkStatusInfo setNetworkStatus(String networkStatus) {
        this.networkStatus = networkStatus;
        return this;
    }
    public String getNetworkStatus() {
        return this.networkStatus;
    }

}
