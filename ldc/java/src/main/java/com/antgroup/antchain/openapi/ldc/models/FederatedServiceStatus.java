// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FederatedServiceStatus extends TeaModel {
    // metadata
    @NameInMap("metadata")
    public ObjectMeta metadata;

    // topologyStatus
    @NameInMap("topology_status")
    public java.util.List<FederatedServiceTopologyStatus> topologyStatus;

    public static FederatedServiceStatus build(java.util.Map<String, ?> map) throws Exception {
        FederatedServiceStatus self = new FederatedServiceStatus();
        return TeaModel.build(map, self);
    }

    public FederatedServiceStatus setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }
    public ObjectMeta getMetadata() {
        return this.metadata;
    }

    public FederatedServiceStatus setTopologyStatus(java.util.List<FederatedServiceTopologyStatus> topologyStatus) {
        this.topologyStatus = topologyStatus;
        return this;
    }
    public java.util.List<FederatedServiceTopologyStatus> getTopologyStatus() {
        return this.topologyStatus;
    }

}
