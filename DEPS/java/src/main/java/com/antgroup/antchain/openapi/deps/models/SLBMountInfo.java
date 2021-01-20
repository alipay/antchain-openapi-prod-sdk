// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SLBMountInfo extends TeaModel {
    // iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // slb id
    @NameInMap("id")
    public String id;

    // SLB 名
    @NameInMap("name")
    public String name;

    // vip 地址
    @NameInMap("vip_addresses")
    public java.util.List<String> vipAddresses;

    // 挂载权重
    @NameInMap("mount_weights")
    public java.util.List<MountWeight> mountWeights;

    // 虚拟服务器组挂载信息
    @NameInMap("v_server_group_mount_info_list")
    public java.util.List<VServerGroupMountInfo> vServerGroupMountInfoList;

    public static SLBMountInfo build(java.util.Map<String, ?> map) throws Exception {
        SLBMountInfo self = new SLBMountInfo();
        return TeaModel.build(map, self);
    }

    public SLBMountInfo setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public SLBMountInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SLBMountInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SLBMountInfo setVipAddresses(java.util.List<String> vipAddresses) {
        this.vipAddresses = vipAddresses;
        return this;
    }
    public java.util.List<String> getVipAddresses() {
        return this.vipAddresses;
    }

    public SLBMountInfo setMountWeights(java.util.List<MountWeight> mountWeights) {
        this.mountWeights = mountWeights;
        return this;
    }
    public java.util.List<MountWeight> getMountWeights() {
        return this.mountWeights;
    }

    public SLBMountInfo setVServerGroupMountInfoList(java.util.List<VServerGroupMountInfo> vServerGroupMountInfoList) {
        this.vServerGroupMountInfoList = vServerGroupMountInfoList;
        return this;
    }
    public java.util.List<VServerGroupMountInfo> getVServerGroupMountInfoList() {
        return this.vServerGroupMountInfoList;
    }

}
