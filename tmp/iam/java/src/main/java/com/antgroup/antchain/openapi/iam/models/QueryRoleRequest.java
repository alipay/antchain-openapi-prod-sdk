// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryRoleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 角色名称
    @NameInMap("name")
    public String name;

    // 当前页,默认1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，取值范围[1~50],默认10
    @NameInMap("page_size")
    public Long pageSize;

    // 是否分页，默认true
    @NameInMap("paging")
    public Boolean paging;

    // 角色类型，自定义角色为CUSTOM或者系统角色为COMMON
    @NameInMap("type")
    public String type;

    public static QueryRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRoleRequest self = new QueryRoleRequest();
        return TeaModel.build(map, self);
    }

    public QueryRoleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRoleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryRoleRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryRoleRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRoleRequest setPaging(Boolean paging) {
        this.paging = paging;
        return this;
    }
    public Boolean getPaging() {
        return this.paging;
    }

    public QueryRoleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
