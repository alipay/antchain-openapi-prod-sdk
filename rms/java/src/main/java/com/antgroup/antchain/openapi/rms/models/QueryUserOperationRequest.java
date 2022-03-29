// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUserOperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 开始时间
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 结束时间
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // 表名
    @NameInMap("table_name")
    @Validation(required = true)
    public String tableName;

    // 表实体对应ID
    @NameInMap("table_entity_id")
    @Validation(required = true)
    public Long tableEntityId;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    public static QueryUserOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserOperationRequest self = new QueryUserOperationRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserOperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserOperationRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUserOperationRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryUserOperationRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryUserOperationRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public QueryUserOperationRequest setTableEntityId(Long tableEntityId) {
        this.tableEntityId = tableEntityId;
        return this;
    }
    public Long getTableEntityId() {
        return this.tableEntityId;
    }

    public QueryUserOperationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUserOperationRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
