// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ClusterInfo extends TeaModel {
    // created time
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // env
    @NameInMap("env")
    public String env;

    // cluster is healthy or not
    @NameInMap("is_healthy")
    @Validation(required = true)
    public Boolean isHealthy;

    // cluster name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // cluster overview info
    @NameInMap("overview_info")
    @Validation(required = true)
    public ClusterOverviewInfo overviewInfo;

    // region name
    @NameInMap("region_name")
    public String regionName;

    // 独占 or 共享
    @NameInMap("type")
    public String type;

    // version
    @NameInMap("version")
    public String version;

    // zone name
    @NameInMap("zone_name")
    public String zoneName;

    // workspace名称[如果存在]。
    @NameInMap("workspace")
    public String workspace;

    public static ClusterInfo build(java.util.Map<String, ?> map) throws Exception {
        ClusterInfo self = new ClusterInfo();
        return TeaModel.build(map, self);
    }

    public ClusterInfo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ClusterInfo setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ClusterInfo setIsHealthy(Boolean isHealthy) {
        this.isHealthy = isHealthy;
        return this;
    }
    public Boolean getIsHealthy() {
        return this.isHealthy;
    }

    public ClusterInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClusterInfo setOverviewInfo(ClusterOverviewInfo overviewInfo) {
        this.overviewInfo = overviewInfo;
        return this;
    }
    public ClusterOverviewInfo getOverviewInfo() {
        return this.overviewInfo;
    }

    public ClusterInfo setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public ClusterInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ClusterInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ClusterInfo setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public ClusterInfo setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
