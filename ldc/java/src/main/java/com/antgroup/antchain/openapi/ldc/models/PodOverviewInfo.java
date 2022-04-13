// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodOverviewInfo extends TeaModel {
    // pod number
    @NameInMap("pod_number")
    public Long podNumber;

    // unhealthy pod number
    @NameInMap("unhealthy_pod_number")
    public Long unhealthyPodNumber;

    public static PodOverviewInfo build(java.util.Map<String, ?> map) throws Exception {
        PodOverviewInfo self = new PodOverviewInfo();
        return TeaModel.build(map, self);
    }

    public PodOverviewInfo setPodNumber(Long podNumber) {
        this.podNumber = podNumber;
        return this;
    }
    public Long getPodNumber() {
        return this.podNumber;
    }

    public PodOverviewInfo setUnhealthyPodNumber(Long unhealthyPodNumber) {
        this.unhealthyPodNumber = unhealthyPodNumber;
        return this;
    }
    public Long getUnhealthyPodNumber() {
        return this.unhealthyPodNumber;
    }

}
