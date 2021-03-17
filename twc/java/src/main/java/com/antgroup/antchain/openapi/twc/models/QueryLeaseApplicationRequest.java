// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseApplicationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 每页的大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 起始id
    @NameInMap("start_id")
    @Validation(required = true)
    public Long startId;

    public static QueryLeaseApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseApplicationRequest self = new QueryLeaseApplicationRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseApplicationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseApplicationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLeaseApplicationRequest setStartId(Long startId) {
        this.startId = startId;
        return this;
    }
    public Long getStartId() {
        return this.startId;
    }

}
