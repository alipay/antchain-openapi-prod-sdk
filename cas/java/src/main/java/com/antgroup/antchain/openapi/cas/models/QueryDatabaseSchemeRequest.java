// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseSchemeRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // char_sets
    @NameInMap("char_sets")
    public java.util.List<String> charSets;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // database_id
    @NameInMap("database_id")
    @Validation(required = true)
    public String databaseId;

    // iaas_ids
    @NameInMap("iaas_ids")
    public java.util.List<String> iaasIds;

    // ids
    @NameInMap("ids")
    public java.util.List<String> ids;

    // name
    @NameInMap("name")
    public String name;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // statuses
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryDatabaseSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseSchemeRequest self = new QueryDatabaseSchemeRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseSchemeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDatabaseSchemeRequest setCharSets(java.util.List<String> charSets) {
        this.charSets = charSets;
        return this;
    }
    public java.util.List<String> getCharSets() {
        return this.charSets;
    }

    public QueryDatabaseSchemeRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryDatabaseSchemeRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public QueryDatabaseSchemeRequest setIaasIds(java.util.List<String> iaasIds) {
        this.iaasIds = iaasIds;
        return this;
    }
    public java.util.List<String> getIaasIds() {
        return this.iaasIds;
    }

    public QueryDatabaseSchemeRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryDatabaseSchemeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDatabaseSchemeRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDatabaseSchemeRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryDatabaseSchemeRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
