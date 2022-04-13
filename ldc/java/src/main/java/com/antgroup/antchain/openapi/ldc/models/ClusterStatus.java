// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ClusterStatus extends TeaModel {
    // 集群名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 集群资源概览
    @NameInMap("overview_info")
    @Validation(required = true)
    public ClusterOverviewInfo overviewInfo;

    public static ClusterStatus build(java.util.Map<String, ?> map) throws Exception {
        ClusterStatus self = new ClusterStatus();
        return TeaModel.build(map, self);
    }

    public ClusterStatus setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClusterStatus setOverviewInfo(ClusterOverviewInfo overviewInfo) {
        this.overviewInfo = overviewInfo;
        return this;
    }
    public ClusterOverviewInfo getOverviewInfo() {
        return this.overviewInfo;
    }

}
