// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class QueryCustomRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 分页页码
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 分页长度，最大不超过50
    @NameInMap("page_size")
    @Validation(required = true, maximum = 50, minimum = 10)
    public Long pageSize;

    // 项目id，非必填；可通过项目id查询单个项目
    @NameInMap("project_id")
    public String projectId;

    public static QueryCustomRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomRequest self = new QueryCustomRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryCustomRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCustomRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
