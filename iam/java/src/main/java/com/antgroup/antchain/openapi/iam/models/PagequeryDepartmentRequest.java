// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class PagequeryDepartmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部门唯一码
    @NameInMap("code")
    public String code;

    // 部门名称
    @NameInMap("name")
    public String name;

    // 部门描述信息
    @NameInMap("description")
    public String description;

    // 父部门唯一码
    @NameInMap("parent_code")
    public String parentCode;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页
    @NameInMap("page_num")
    public Long pageNum;

    public static PagequeryDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDepartmentRequest self = new PagequeryDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryDepartmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryDepartmentRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PagequeryDepartmentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PagequeryDepartmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PagequeryDepartmentRequest setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }
    public String getParentCode() {
        return this.parentCode;
    }

    public PagequeryDepartmentRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryDepartmentRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

}
