// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotIotagentUseridRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户名
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 页码
    @NameInMap("page_index")
    public Long pageIndex;

    @NameInMap("page_size")
    public Long pageSize;

    public static QueryBlockchainBotIotagentUseridRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotIotagentUseridRequest self = new QueryBlockchainBotIotagentUseridRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotIotagentUseridRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotIotagentUseridRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotIotagentUseridRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBlockchainBotIotagentUseridRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryBlockchainBotIotagentUseridRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
