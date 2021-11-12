// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class UnitResource extends TeaModel {
    // 资源地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 环境标识
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 资源ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 资源名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 资源端口
    @NameInMap("port")
    public Long port;

    // 资源类型:CONTAINER,LB,DB,CACHE,APP,STORAGE
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // zone标识
    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    public static UnitResource build(java.util.Map<String, ?> map) throws Exception {
        UnitResource self = new UnitResource();
        return TeaModel.build(map, self);
    }

    public UnitResource setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UnitResource setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public UnitResource setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UnitResource setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UnitResource setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public UnitResource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UnitResource setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
