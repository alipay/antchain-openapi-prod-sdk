// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Cluster extends TeaModel {
    // 集群创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // env
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 集群是否健康
    @NameInMap("is_healthy")
    @Validation(required = true)
    public Boolean isHealthy;

    // 集群名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // region name
    // 
    @NameInMap("region_name")
    @Validation(required = true)
    public String regionName;

    // 独占
    @NameInMap("type")
    public String type;

    // 集群版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 环境名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 机房名称
    @NameInMap("zone_name")
    @Validation(required = true)
    public String zoneName;

    public static Cluster build(java.util.Map<String, ?> map) throws Exception {
        Cluster self = new Cluster();
        return TeaModel.build(map, self);
    }

    public Cluster setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Cluster setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public Cluster setIsHealthy(Boolean isHealthy) {
        this.isHealthy = isHealthy;
        return this;
    }
    public Boolean getIsHealthy() {
        return this.isHealthy;
    }

    public Cluster setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Cluster setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public Cluster setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Cluster setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public Cluster setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public Cluster setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
