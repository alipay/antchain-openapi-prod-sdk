// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryDepartmentUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部门唯一码
    @NameInMap("department_code")
    public String departmentCode;

    // 用户 id
    @NameInMap("user_id")
    public String userId;

    // 部门成员类型
    @NameInMap("type")
    public String type;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页
    @NameInMap("page_num")
    public Long pageNum;

    public static QueryDepartmentUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDepartmentUserRequest self = new QueryDepartmentUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryDepartmentUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDepartmentUserRequest setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
        return this;
    }
    public String getDepartmentCode() {
        return this.departmentCode;
    }

    public QueryDepartmentUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDepartmentUserRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryDepartmentUserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDepartmentUserRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

}
