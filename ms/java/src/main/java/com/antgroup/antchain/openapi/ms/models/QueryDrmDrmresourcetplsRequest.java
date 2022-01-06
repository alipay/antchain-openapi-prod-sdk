// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDrmDrmresourcetplsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 搜索键
    @NameInMap("search_key")
    public String searchKey;

    // 起始索引
    @NameInMap("start")
    public Long start;

    public static QueryDrmDrmresourcetplsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDrmDrmresourcetplsRequest self = new QueryDrmDrmresourcetplsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDrmDrmresourcetplsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDrmDrmresourcetplsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDrmDrmresourcetplsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDrmDrmresourcetplsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDrmDrmresourcetplsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public QueryDrmDrmresourcetplsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
