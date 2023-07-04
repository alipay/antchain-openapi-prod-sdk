// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class TopologyConstraints extends TeaModel {
    // 亲和性配置
    @NameInMap("affinity")
    public AffinityConfig affinity;

    // 反亲和性配置
    @NameInMap("anti_affinity")
    public AffinityConfig antiAffinity;

    // sidecar应用列表
    @NameInMap("sidecars")
    public java.util.List<String> sidecars;

    public static TopologyConstraints build(java.util.Map<String, ?> map) throws Exception {
        TopologyConstraints self = new TopologyConstraints();
        return TeaModel.build(map, self);
    }

    public TopologyConstraints setAffinity(AffinityConfig affinity) {
        this.affinity = affinity;
        return this;
    }
    public AffinityConfig getAffinity() {
        return this.affinity;
    }

    public TopologyConstraints setAntiAffinity(AffinityConfig antiAffinity) {
        this.antiAffinity = antiAffinity;
        return this;
    }
    public AffinityConfig getAntiAffinity() {
        return this.antiAffinity;
    }

    public TopologyConstraints setSidecars(java.util.List<String> sidecars) {
        this.sidecars = sidecars;
        return this;
    }
    public java.util.List<String> getSidecars() {
        return this.sidecars;
    }

}
