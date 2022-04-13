// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UnifiedAccessInstanceInfo extends TeaModel {
    // 统一接入实例创建的时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 关联的Spanner逻辑集群名称，一个逻辑集群由很多个local集群组成
    @NameInMap("spanner_cluster")
    @Validation(required = true)
    public String spannerCluster;

    // 关联的应用服务信息
    @NameInMap("unified_access_instance_container_service_infos")
    public java.util.List<UnifiedAccessInstanceContainerServiceInfo> unifiedAccessInstanceContainerServiceInfos;

    // https协议配置
    @NameInMap("unified_access_instance_https_entry")
    public HttpsEntry unifiedAccessInstanceHttpsEntry;

    // http协议配置
    @NameInMap("unified_access_instance_http_entry")
    @Validation(required = true)
    public HttpEntry unifiedAccessInstanceHttpEntry;

    // 统一接入实例ID
    @NameInMap("unified_access_instance_id")
    @Validation(required = true)
    public String unifiedAccessInstanceId;

    // 本地集群详细信息
    @NameInMap("unified_access_instance_local_detail_infos")
    @Validation(required = true)
    public java.util.List<UnifiedAccessInstanceLocalDetailInfo> unifiedAccessInstanceLocalDetailInfos;

    // 统一接入实例详细信息显示，包含错误状态信息等
    @NameInMap("unified_access_instance_message_details")
    public String unifiedAccessInstanceMessageDetails;

    // 统一接入实例名称
    @NameInMap("unified_access_instance_name")
    @Validation(required = true)
    public String unifiedAccessInstanceName;

    // 统一接入实例状态描述：创建中、创建成功、创建失败
    @NameInMap("unified_access_instance_status")
    @Validation(required = true)
    public String unifiedAccessInstanceStatus;

    // 统一接入实例网络类型，内网（intranet），公网（internet）
    @NameInMap("unified_access_instance_type")
    @Validation(required = true)
    public String unifiedAccessInstanceType;

    // custom模式下，用户自定义entryId以及entryVip信息
    @NameInMap("entry_settings")
    public EntrySettings entrySettings;

    public static UnifiedAccessInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAccessInstanceInfo self = new UnifiedAccessInstanceInfo();
        return TeaModel.build(map, self);
    }

    public UnifiedAccessInstanceInfo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public UnifiedAccessInstanceInfo setSpannerCluster(String spannerCluster) {
        this.spannerCluster = spannerCluster;
        return this;
    }
    public String getSpannerCluster() {
        return this.spannerCluster;
    }

    public UnifiedAccessInstanceInfo setUnifiedAccessInstanceContainerServiceInfos(java.util.List<UnifiedAccessInstanceContainerServiceInfo> unifiedAccessInstanceContainerServiceInfos) {
        this.unifiedAccessInstanceContainerServiceInfos = unifiedAccessInstanceContainerServiceInfos;
        return this;
    }
    public java.util.List<UnifiedAccessInstanceContainerServiceInfo> getUnifiedAccessInstanceContainerServiceInfos() {
        return this.unifiedAccessInstanceContainerServiceInfos;
    }

    public UnifiedAccessInstanceInfo setUnifiedAccessInstanceHttpsEntry(HttpsEntry unifiedAccessInstanceHttpsEntry) {
        this.unifiedAccessInstanceHttpsEntry = unifiedAccessInstanceHttpsEntry;
        return this;
    }
    public HttpsEntry getUnifiedAccessInstanceHttpsEntry() {
        return this.unifiedAccessInstanceHttpsEntry;
    }

    public UnifiedAccessInstanceInfo setUnifiedAccessInstanceHttpEntry(HttpEntry unifiedAccessInstanceHttpEntry) {
        this.unifiedAccessInstanceHttpEntry = unifiedAccessInstanceHttpEntry;
        return this;
    }
    public HttpEntry getUnifiedAccessInstanceHttpEntry() {
        return this.unifiedAccessInstanceHttpEntry;
    }

    public UnifiedAccessInstanceInfo setUnifiedAccessInstanceId(String unifiedAccessInstanceId) {
        this.unifiedAccessInstanceId = unifiedAccessInstanceId;
        return this;
    }
    public String getUnifiedAccessInstanceId() {
        return this.unifiedAccessInstanceId;
    }

    public UnifiedAccessInstanceInfo setUnifiedAccessInstanceLocalDetailInfos(java.util.List<UnifiedAccessInstanceLocalDetailInfo> unifiedAccessInstanceLocalDetailInfos) {
        this.unifiedAccessInstanceLocalDetailInfos = unifiedAccessInstanceLocalDetailInfos;
        return this;
    }
    public java.util.List<UnifiedAccessInstanceLocalDetailInfo> getUnifiedAccessInstanceLocalDetailInfos() {
        return this.unifiedAccessInstanceLocalDetailInfos;
    }

    public UnifiedAccessInstanceInfo setUnifiedAccessInstanceMessageDetails(String unifiedAccessInstanceMessageDetails) {
        this.unifiedAccessInstanceMessageDetails = unifiedAccessInstanceMessageDetails;
        return this;
    }
    public String getUnifiedAccessInstanceMessageDetails() {
        return this.unifiedAccessInstanceMessageDetails;
    }

    public UnifiedAccessInstanceInfo setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
        this.unifiedAccessInstanceName = unifiedAccessInstanceName;
        return this;
    }
    public String getUnifiedAccessInstanceName() {
        return this.unifiedAccessInstanceName;
    }

    public UnifiedAccessInstanceInfo setUnifiedAccessInstanceStatus(String unifiedAccessInstanceStatus) {
        this.unifiedAccessInstanceStatus = unifiedAccessInstanceStatus;
        return this;
    }
    public String getUnifiedAccessInstanceStatus() {
        return this.unifiedAccessInstanceStatus;
    }

    public UnifiedAccessInstanceInfo setUnifiedAccessInstanceType(String unifiedAccessInstanceType) {
        this.unifiedAccessInstanceType = unifiedAccessInstanceType;
        return this;
    }
    public String getUnifiedAccessInstanceType() {
        return this.unifiedAccessInstanceType;
    }

    public UnifiedAccessInstanceInfo setEntrySettings(EntrySettings entrySettings) {
        this.entrySettings = entrySettings;
        return this;
    }
    public EntrySettings getEntrySettings() {
        return this.entrySettings;
    }

}
