// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ServiceInfoGroup extends TeaModel {
    // 发布应用列表
    @NameInMap("service_info_list")
    public java.util.List<ServiceInfo> serviceInfoList;

    public static ServiceInfoGroup build(java.util.Map<String, ?> map) throws Exception {
        ServiceInfoGroup self = new ServiceInfoGroup();
        return TeaModel.build(map, self);
    }

    public ServiceInfoGroup setServiceInfoList(java.util.List<ServiceInfo> serviceInfoList) {
        this.serviceInfoList = serviceInfoList;
        return this;
    }
    public java.util.List<ServiceInfo> getServiceInfoList() {
        return this.serviceInfoList;
    }

}
