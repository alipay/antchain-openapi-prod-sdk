// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseImportRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // iaas_type
    @NameInMap("iaas_type")
    @Validation(required = true)
    public String iaasType;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryDatabaseImportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseImportRequest self = new QueryDatabaseImportRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseImportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDatabaseImportRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryDatabaseImportRequest setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public QueryDatabaseImportRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDatabaseImportRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
