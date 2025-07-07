// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DidDeleteService extends TeaModel {
    // 修改前did doc版本
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("previous_version")
    @Validation(required = true)
    public Long previousVersion;

    // 指定服务的id
    /**
     * <strong>example:</strong>
     * <p>service#2</p>
     */
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    public static DidDeleteService build(java.util.Map<String, ?> map) throws Exception {
        DidDeleteService self = new DidDeleteService();
        return TeaModel.build(map, self);
    }

    public DidDeleteService setPreviousVersion(Long previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }
    public Long getPreviousVersion() {
        return this.previousVersion;
    }

    public DidDeleteService setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
