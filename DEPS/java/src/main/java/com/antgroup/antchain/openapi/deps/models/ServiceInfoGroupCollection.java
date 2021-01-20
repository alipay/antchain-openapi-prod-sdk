// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ServiceInfoGroupCollection extends TeaModel {
    // service info groups
    @NameInMap("service_info_groups")
    public ServiceInfoGroup serviceInfoGroups;

    public static ServiceInfoGroupCollection build(java.util.Map<String, ?> map) throws Exception {
        ServiceInfoGroupCollection self = new ServiceInfoGroupCollection();
        return TeaModel.build(map, self);
    }

    public ServiceInfoGroupCollection setServiceInfoGroups(ServiceInfoGroup serviceInfoGroups) {
        this.serviceInfoGroups = serviceInfoGroups;
        return this;
    }
    public ServiceInfoGroup getServiceInfoGroups() {
        return this.serviceInfoGroups;
    }

}
