// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseSchemaRequest extends TeaModel {
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
    public String workspace;

    public static QueryDatabaseSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseSchemaRequest self = new QueryDatabaseSchemaRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseSchemaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDatabaseSchemaRequest setCharSets(java.util.List<String> charSets) {
        this.charSets = charSets;
        return this;
    }
    public java.util.List<String> getCharSets() {
        return this.charSets;
    }

    public QueryDatabaseSchemaRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryDatabaseSchemaRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public QueryDatabaseSchemaRequest setIaasIds(java.util.List<String> iaasIds) {
        this.iaasIds = iaasIds;
        return this;
    }
    public java.util.List<String> getIaasIds() {
        return this.iaasIds;
    }

    public QueryDatabaseSchemaRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryDatabaseSchemaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDatabaseSchemaRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDatabaseSchemaRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryDatabaseSchemaRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
