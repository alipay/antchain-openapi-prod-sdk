// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class VServerGroupMountInfo extends TeaModel {
    // iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // 名称
    @NameInMap("name")
    public String name;

    // paas id
    @NameInMap("paas_id")
    public String paasId;

    // 权重信息
    @NameInMap("mount_weights")
    public java.util.List<MountWeight> mountWeights;

    public static VServerGroupMountInfo build(java.util.Map<String, ?> map) throws Exception {
        VServerGroupMountInfo self = new VServerGroupMountInfo();
        return TeaModel.build(map, self);
    }

    public VServerGroupMountInfo setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public VServerGroupMountInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VServerGroupMountInfo setPaasId(String paasId) {
        this.paasId = paasId;
        return this;
    }
    public String getPaasId() {
        return this.paasId;
    }

    public VServerGroupMountInfo setMountWeights(java.util.List<MountWeight> mountWeights) {
        this.mountWeights = mountWeights;
        return this;
    }
    public java.util.List<MountWeight> getMountWeights() {
        return this.mountWeights;
    }

}
