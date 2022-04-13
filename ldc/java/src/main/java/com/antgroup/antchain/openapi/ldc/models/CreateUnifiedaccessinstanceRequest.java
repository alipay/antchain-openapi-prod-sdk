// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateUnifiedaccessinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 关联的Spanner逻辑集群名称，一个逻辑集群由很多个local集群组成
    @NameInMap("spanner_cluster")
    @Validation(required = true)
    public String spannerCluster;

    // https协议配置
    @NameInMap("unified_access_instance_https_entry")
    public HttpsEntry unifiedAccessInstanceHttpsEntry;

    // http协议配置
    @NameInMap("unified_access_instance_http_entry")
    @Validation(required = true)
    public HttpEntry unifiedAccessInstanceHttpEntry;

    // 统一接入实例名称
    @NameInMap("unified_access_instance_name")
    @Validation(required = true)
    public String unifiedAccessInstanceName;

    // 统一接入网络类型，内网（intranet），公网（internet）
    @NameInMap("unified_access_instance_type")
    @Validation(required = true)
    public String unifiedAccessInstanceType;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 用户自定义实例entry相关信息（vip/id），datacenter粒度
    @NameInMap("entry_settings")
    public EntrySettings entrySettings;

    public static CreateUnifiedaccessinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUnifiedaccessinstanceRequest self = new CreateUnifiedaccessinstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateUnifiedaccessinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUnifiedaccessinstanceRequest setSpannerCluster(String spannerCluster) {
        this.spannerCluster = spannerCluster;
        return this;
    }
    public String getSpannerCluster() {
        return this.spannerCluster;
    }

    public CreateUnifiedaccessinstanceRequest setUnifiedAccessInstanceHttpsEntry(HttpsEntry unifiedAccessInstanceHttpsEntry) {
        this.unifiedAccessInstanceHttpsEntry = unifiedAccessInstanceHttpsEntry;
        return this;
    }
    public HttpsEntry getUnifiedAccessInstanceHttpsEntry() {
        return this.unifiedAccessInstanceHttpsEntry;
    }

    public CreateUnifiedaccessinstanceRequest setUnifiedAccessInstanceHttpEntry(HttpEntry unifiedAccessInstanceHttpEntry) {
        this.unifiedAccessInstanceHttpEntry = unifiedAccessInstanceHttpEntry;
        return this;
    }
    public HttpEntry getUnifiedAccessInstanceHttpEntry() {
        return this.unifiedAccessInstanceHttpEntry;
    }

    public CreateUnifiedaccessinstanceRequest setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
        this.unifiedAccessInstanceName = unifiedAccessInstanceName;
        return this;
    }
    public String getUnifiedAccessInstanceName() {
        return this.unifiedAccessInstanceName;
    }

    public CreateUnifiedaccessinstanceRequest setUnifiedAccessInstanceType(String unifiedAccessInstanceType) {
        this.unifiedAccessInstanceType = unifiedAccessInstanceType;
        return this;
    }
    public String getUnifiedAccessInstanceType() {
        return this.unifiedAccessInstanceType;
    }

    public CreateUnifiedaccessinstanceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateUnifiedaccessinstanceRequest setEntrySettings(EntrySettings entrySettings) {
        this.entrySettings = entrySettings;
        return this;
    }
    public EntrySettings getEntrySettings() {
        return this.entrySettings;
    }

}
