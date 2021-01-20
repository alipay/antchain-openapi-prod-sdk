// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApptechstackrelationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 一组应用id
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // buildpack_arch
    @NameInMap("buildpack_arch")
    public String buildpackArch;

    // creation_fime_from
    // 
    @NameInMap("creation_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTimeFrom;

    // creation_time_to
    // 
    @NameInMap("creation_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTimeTo;

    // current_page
    // 
    @NameInMap("current_page")
    public Long currentPage;

    // 是否降序
    @NameInMap("descend")
    public String descend;

    // ids
    @NameInMap("ids")
    public java.util.List<Long> ids;

    // isProcessed
    @NameInMap("is_processed")
    public Boolean isProcessed;

    // modification_time_from
    // 
    @NameInMap("modification_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTimeFrom;

    // modification_time_to
    // 
    @NameInMap("modification_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTimeTo;

    // page_size
    // 
    @NameInMap("page_size")
    public Long pageSize;

    // 分类
    @NameInMap("sort_field")
    public String sortField;

    // start_index
    // 
    @NameInMap("start_index")
    public Long startIndex;

    // techstack_identities
    // 
    @NameInMap("techstack_identities")
    public String techstackIdentities;

    // techstack_ids
    // 
    @NameInMap("techstack_ids")
    public java.util.List<Long> techstackIds;

    public static QueryApptechstackrelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApptechstackrelationRequest self = new QueryApptechstackrelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryApptechstackrelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApptechstackrelationRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public QueryApptechstackrelationRequest setBuildpackArch(String buildpackArch) {
        this.buildpackArch = buildpackArch;
        return this;
    }
    public String getBuildpackArch() {
        return this.buildpackArch;
    }

    public QueryApptechstackrelationRequest setCreationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }
    public String getCreationTimeFrom() {
        return this.creationTimeFrom;
    }

    public QueryApptechstackrelationRequest setCreationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }
    public String getCreationTimeTo() {
        return this.creationTimeTo;
    }

    public QueryApptechstackrelationRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryApptechstackrelationRequest setDescend(String descend) {
        this.descend = descend;
        return this;
    }
    public String getDescend() {
        return this.descend;
    }

    public QueryApptechstackrelationRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public QueryApptechstackrelationRequest setIsProcessed(Boolean isProcessed) {
        this.isProcessed = isProcessed;
        return this;
    }
    public Boolean getIsProcessed() {
        return this.isProcessed;
    }

    public QueryApptechstackrelationRequest setModificationTimeFrom(String modificationTimeFrom) {
        this.modificationTimeFrom = modificationTimeFrom;
        return this;
    }
    public String getModificationTimeFrom() {
        return this.modificationTimeFrom;
    }

    public QueryApptechstackrelationRequest setModificationTimeTo(String modificationTimeTo) {
        this.modificationTimeTo = modificationTimeTo;
        return this;
    }
    public String getModificationTimeTo() {
        return this.modificationTimeTo;
    }

    public QueryApptechstackrelationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryApptechstackrelationRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public QueryApptechstackrelationRequest setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryApptechstackrelationRequest setTechstackIdentities(String techstackIdentities) {
        this.techstackIdentities = techstackIdentities;
        return this;
    }
    public String getTechstackIdentities() {
        return this.techstackIdentities;
    }

    public QueryApptechstackrelationRequest setTechstackIds(java.util.List<Long> techstackIds) {
        this.techstackIds = techstackIds;
        return this;
    }
    public java.util.List<Long> getTechstackIds() {
        return this.techstackIds;
    }

}
