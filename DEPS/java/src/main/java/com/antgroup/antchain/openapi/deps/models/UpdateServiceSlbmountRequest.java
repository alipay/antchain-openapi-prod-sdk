// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateServiceSlbmountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 权重
    @NameInMap("mount_info")
    public java.util.List<Pair> mountInfo;

    // region_identity
    @NameInMap("region_identity")
    public String regionIdentity;

    // service_id
    @NameInMap("service_id")
    public String serviceId;

    // slb_id
    @NameInMap("slb_id")
    public String slbId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static UpdateServiceSlbmountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSlbmountRequest self = new UpdateServiceSlbmountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSlbmountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateServiceSlbmountRequest setMountInfo(java.util.List<Pair> mountInfo) {
        this.mountInfo = mountInfo;
        return this;
    }
    public java.util.List<Pair> getMountInfo() {
        return this.mountInfo;
    }

    public UpdateServiceSlbmountRequest setRegionIdentity(String regionIdentity) {
        this.regionIdentity = regionIdentity;
        return this;
    }
    public String getRegionIdentity() {
        return this.regionIdentity;
    }

    public UpdateServiceSlbmountRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateServiceSlbmountRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public UpdateServiceSlbmountRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
