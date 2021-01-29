// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppserviceenvparamRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // appIds
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // appServiceIds
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // buildpackIds
    @NameInMap("buildpack_ids")
    public java.util.List<String> buildpackIds;

    // creationTimeFrom
    @NameInMap("creation_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTimeFrom;

    // creationTimeTo
    @NameInMap("creation_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTimeTo;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // defaultValue
    @NameInMap("default_value")
    public String defaultValue;

    // 是否降序
    @NameInMap("descend")
    public Boolean descend;

    // ids
    @NameInMap("ids")
    public java.util.List<String> ids;

    // isProcessed
    @NameInMap("is_processed")
    public Boolean isProcessed;

    // key
    @NameInMap("key")
    public String key;

    // modificationTimeFrom
    @NameInMap("modification_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTimeFrom;

    // modificationTimeTo
    @NameInMap("modification_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTimeTo;

    // 每页个数
    @NameInMap("page_size")
    public Long pageSize;

    // 分类
    @NameInMap("sort_field")
    public String sortField;

    // 开始索引
    @NameInMap("start_index")
    public Long startIndex;

    // value
    @NameInMap("value")
    public String value;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    public static QueryAppserviceenvparamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppserviceenvparamRequest self = new QueryAppserviceenvparamRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppserviceenvparamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppserviceenvparamRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryAppserviceenvparamRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public QueryAppserviceenvparamRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public QueryAppserviceenvparamRequest setBuildpackIds(java.util.List<String> buildpackIds) {
        this.buildpackIds = buildpackIds;
        return this;
    }
    public java.util.List<String> getBuildpackIds() {
        return this.buildpackIds;
    }

    public QueryAppserviceenvparamRequest setCreationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }
    public String getCreationTimeFrom() {
        return this.creationTimeFrom;
    }

    public QueryAppserviceenvparamRequest setCreationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }
    public String getCreationTimeTo() {
        return this.creationTimeTo;
    }

    public QueryAppserviceenvparamRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAppserviceenvparamRequest setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public QueryAppserviceenvparamRequest setDescend(Boolean descend) {
        this.descend = descend;
        return this;
    }
    public Boolean getDescend() {
        return this.descend;
    }

    public QueryAppserviceenvparamRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryAppserviceenvparamRequest setIsProcessed(Boolean isProcessed) {
        this.isProcessed = isProcessed;
        return this;
    }
    public Boolean getIsProcessed() {
        return this.isProcessed;
    }

    public QueryAppserviceenvparamRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public QueryAppserviceenvparamRequest setModificationTimeFrom(String modificationTimeFrom) {
        this.modificationTimeFrom = modificationTimeFrom;
        return this;
    }
    public String getModificationTimeFrom() {
        return this.modificationTimeFrom;
    }

    public QueryAppserviceenvparamRequest setModificationTimeTo(String modificationTimeTo) {
        this.modificationTimeTo = modificationTimeTo;
        return this;
    }
    public String getModificationTimeTo() {
        return this.modificationTimeTo;
    }

    public QueryAppserviceenvparamRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppserviceenvparamRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public QueryAppserviceenvparamRequest setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryAppserviceenvparamRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public QueryAppserviceenvparamRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
