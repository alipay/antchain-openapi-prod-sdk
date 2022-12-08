// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class QueryProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 父亲项目的id: 负数表示不限
    @NameInMap("parent_id")
    public Long parentId;

    // uid
    @NameInMap("uid")
    public String uid;

    // 排序字段名称，如gmt_create
    @NameInMap("order_by")
    public String orderBy;

    // 请求ID
    @NameInMap("request_id")
    public String requestId;

    // 名称
    @NameInMap("name")
    public String name;

    // 指定ID
    @NameInMap("ids")
    public java.util.List<Long> ids;

    // 当前页
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 所在项目组ID
    @NameInMap("project_group_id")
    public Long projectGroupId;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 排序方式：DESC降序，ASC升序
    @NameInMap("sort_type")
    public String sortType;

    public static QueryProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectRequest self = new QueryProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryProjectRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public QueryProjectRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public QueryProjectRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryProjectRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryProjectRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public QueryProjectRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryProjectRequest setProjectGroupId(Long projectGroupId) {
        this.projectGroupId = projectGroupId;
        return this;
    }
    public Long getProjectGroupId() {
        return this.projectGroupId;
    }

    public QueryProjectRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryProjectRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

}
