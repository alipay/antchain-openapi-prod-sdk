// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ServiceSummary extends TeaModel {
    // 应用数
    @NameInMap("app_count")
    public Long appCount;

    // 服务数
    @NameInMap("service_count")
    public Long serviceCount;

    // 节点数
    @NameInMap("node_count")
    public Long nodeCount;

    public static ServiceSummary build(java.util.Map<String, ?> map) throws Exception {
        ServiceSummary self = new ServiceSummary();
        return TeaModel.build(map, self);
    }

    public ServiceSummary setAppCount(Long appCount) {
        this.appCount = appCount;
        return this;
    }
    public Long getAppCount() {
        return this.appCount;
    }

    public ServiceSummary setServiceCount(Long serviceCount) {
        this.serviceCount = serviceCount;
        return this;
    }
    public Long getServiceCount() {
        return this.serviceCount;
    }

    public ServiceSummary setNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Long getNodeCount() {
        return this.nodeCount;
    }

}
