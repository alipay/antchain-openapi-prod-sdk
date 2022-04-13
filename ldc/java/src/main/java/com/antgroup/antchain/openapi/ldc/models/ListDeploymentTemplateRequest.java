// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListDeploymentTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 模板编码或名称模糊搜索
    @NameInMap("name")
    public String name;

    // 当前页码，从1开始，默认为1
    @NameInMap("page_number")
    public Long pageNumber;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 查询方式，默认FUZZY，模糊查询
    @NameInMap("query_type")
    public String queryType;

    public static ListDeploymentTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentTemplateRequest self = new ListDeploymentTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDeploymentTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDeploymentTemplateRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDeploymentTemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDeploymentTemplateRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

}
