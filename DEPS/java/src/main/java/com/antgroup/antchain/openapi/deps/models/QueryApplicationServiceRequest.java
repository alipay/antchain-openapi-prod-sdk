// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApplicationServiceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 待查询的应用名称。最大60个UTF-8字符
    @NameInMap("application_name")
    public String applicationName;

    // 当前页码，默认为1
    @NameInMap("page_num")
    public Integer pageNum;

    // 分页大小，默认10，最大50
    @NameInMap("page_size")
    public Integer pageSize;

    // 目标环境名称
    @NameInMap("workspaces")
    public java.util.List<String> workspaces;

    public static QueryApplicationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationServiceRequest self = new QueryApplicationServiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationServiceRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public QueryApplicationServiceRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryApplicationServiceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryApplicationServiceRequest setWorkspaces(java.util.List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<String> getWorkspaces() {
        return this.workspaces;
    }

}
