// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateSlsLogstoreRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 日志库名称，在Project下必须唯一
    @NameInMap("logstore_name")
    @Validation(required = true)
    public String logstoreName;

    // 日志项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 区域id
    @NameInMap("sls_region_id")
    public String slsRegionId;

    // Shard个数，单位为个，范围为1~100
    @NameInMap("shard_count")
    @Validation(required = true)
    public Long shardCount;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 数据的保存时间，单位为天，范围1~3600。
    @NameInMap("ttl")
    @Validation(required = true)
    public Long ttl;

    // 是否添加索引
    @NameInMap("add_index")
    public Boolean addIndex;

    public static CreateSlsLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlsLogstoreRequest self = new CreateSlsLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlsLogstoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSlsLogstoreRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public CreateSlsLogstoreRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateSlsLogstoreRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public CreateSlsLogstoreRequest setShardCount(Long shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Long getShardCount() {
        return this.shardCount;
    }

    public CreateSlsLogstoreRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateSlsLogstoreRequest setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

    public CreateSlsLogstoreRequest setAddIndex(Boolean addIndex) {
        this.addIndex = addIndex;
        return this;
    }
    public Boolean getAddIndex() {
        return this.addIndex;
    }

}
