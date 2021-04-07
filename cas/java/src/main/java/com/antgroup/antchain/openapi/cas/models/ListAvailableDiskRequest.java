// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAvailableDiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // region name
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 磁盘类型：
    // SystemDisk;
    // DataDisk
    @NameInMap("disk_type")
    @Validation(required = true)
    public String diskType;

    // 实例规格
    @NameInMap("instance_type")
    @Validation(required = true)
    public String instanceType;

    public static ListAvailableDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableDiskRequest self = new ListAvailableDiskRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableDiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAvailableDiskRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListAvailableDiskRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public ListAvailableDiskRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
