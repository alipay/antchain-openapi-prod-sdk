// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class TrafficConfig extends TeaModel {
    // 是否摘除注册中心流量
    @NameInMap("registry_managed")
    public Boolean registryManaged;

    // 摘流等待时间
    @NameInMap("registry_traffic_off_wait_sec")
    public Long registryTrafficOffWaitSec;

    public static TrafficConfig build(java.util.Map<String, ?> map) throws Exception {
        TrafficConfig self = new TrafficConfig();
        return TeaModel.build(map, self);
    }

    public TrafficConfig setRegistryManaged(Boolean registryManaged) {
        this.registryManaged = registryManaged;
        return this;
    }
    public Boolean getRegistryManaged() {
        return this.registryManaged;
    }

    public TrafficConfig setRegistryTrafficOffWaitSec(Long registryTrafficOffWaitSec) {
        this.registryTrafficOffWaitSec = registryTrafficOffWaitSec;
        return this;
    }
    public Long getRegistryTrafficOffWaitSec() {
        return this.registryTrafficOffWaitSec;
    }

}
