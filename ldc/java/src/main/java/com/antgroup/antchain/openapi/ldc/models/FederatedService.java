// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FederatedService extends TeaModel {
    // metadata
    @NameInMap("metadata")
    public ObjectMeta metadata;

    // status
    @NameInMap("status")
    public FederatedServiceStatus status;

    public static FederatedService build(java.util.Map<String, ?> map) throws Exception {
        FederatedService self = new FederatedService();
        return TeaModel.build(map, self);
    }

    public FederatedService setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }
    public ObjectMeta getMetadata() {
        return this.metadata;
    }

    public FederatedService setStatus(FederatedServiceStatus status) {
        this.status = status;
        return this;
    }
    public FederatedServiceStatus getStatus() {
        return this.status;
    }

}
