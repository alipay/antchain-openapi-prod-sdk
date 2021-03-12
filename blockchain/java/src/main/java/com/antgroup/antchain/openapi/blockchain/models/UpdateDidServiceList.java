// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidServiceList extends TeaModel {
    // 待更新did之前的版本号
    @NameInMap("previous_version")
    @Validation(required = true)
    public Long previousVersion;

    // 服务信息列表
    @NameInMap("service_list")
    @Validation(required = true)
    public java.util.List<DisServicesInfo> serviceList;

    public static UpdateDidServiceList build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidServiceList self = new UpdateDidServiceList();
        return TeaModel.build(map, self);
    }

    public UpdateDidServiceList setPreviousVersion(Long previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }
    public Long getPreviousVersion() {
        return this.previousVersion;
    }

    public UpdateDidServiceList setServiceList(java.util.List<DisServicesInfo> serviceList) {
        this.serviceList = serviceList;
        return this;
    }
    public java.util.List<DisServicesInfo> getServiceList() {
        return this.serviceList;
    }

}
