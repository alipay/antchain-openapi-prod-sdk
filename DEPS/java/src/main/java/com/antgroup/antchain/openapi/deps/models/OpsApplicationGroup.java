// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsApplicationGroup extends TeaModel {
    // 此运维应用（服务）组中包含的应用（服务）列表
    @NameInMap("applications")
    public java.util.List<OpsApplication> applications;

    public static OpsApplicationGroup build(java.util.Map<String, ?> map) throws Exception {
        OpsApplicationGroup self = new OpsApplicationGroup();
        return TeaModel.build(map, self);
    }

    public OpsApplicationGroup setApplications(java.util.List<OpsApplication> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<OpsApplication> getApplications() {
        return this.applications;
    }

}
