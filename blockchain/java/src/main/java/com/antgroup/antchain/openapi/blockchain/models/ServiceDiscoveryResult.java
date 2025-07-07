// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ServiceDiscoveryResult extends TeaModel {
    // 提供该服务能力的did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:...</p>
     */
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 提供该服务能力的endpoint信息
    @NameInMap("services")
    @Validation(required = true)
    public java.util.List<DidDocServicesInfo> services;

    public static ServiceDiscoveryResult build(java.util.Map<String, ?> map) throws Exception {
        ServiceDiscoveryResult self = new ServiceDiscoveryResult();
        return TeaModel.build(map, self);
    }

    public ServiceDiscoveryResult setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public ServiceDiscoveryResult setServices(java.util.List<DidDocServicesInfo> services) {
        this.services = services;
        return this;
    }
    public java.util.List<DidDocServicesInfo> getServices() {
        return this.services;
    }

}
