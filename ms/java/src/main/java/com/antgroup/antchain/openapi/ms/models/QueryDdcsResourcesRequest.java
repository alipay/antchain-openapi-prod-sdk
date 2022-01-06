// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDdcsResourcesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 系统字段：环境实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 资源 ID 模糊查询关键字
    @NameInMap("keyword")
    public String keyword;

    // 分页参数，第几页
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页参数，分页大小
    @NameInMap("page_size")
    public String pageSize;

    public static QueryDdcsResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDdcsResourcesRequest self = new QueryDdcsResourcesRequest();
        return TeaModel.build(map, self);
    }

    public QueryDdcsResourcesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDdcsResourcesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDdcsResourcesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryDdcsResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDdcsResourcesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryDdcsResourcesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDdcsResourcesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
