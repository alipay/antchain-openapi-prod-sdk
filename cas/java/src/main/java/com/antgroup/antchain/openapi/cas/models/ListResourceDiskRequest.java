// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListResourceDiskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 要查询的云盘或本地盘类型。取值范围：
    // 
    // all：同时查询系统盘与数据盘
    // system：只查询系统盘
    // data：只查询数据盘
    // 默认值：all。
    @NameInMap("disk_type")
    public String diskType;

    // 实例规格
    @NameInMap("instance_type")
    @Validation(required = true)
    public String instanceType;

    // region name
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    public static ListResourceDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceDiskRequest self = new ListResourceDiskRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceDiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListResourceDiskRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public ListResourceDiskRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListResourceDiskRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
