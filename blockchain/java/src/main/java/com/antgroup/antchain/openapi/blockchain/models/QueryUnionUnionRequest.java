// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryUnionUnionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分页编号
    @NameInMap("page_number")
    public String pageNumber;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public String pageSize;

    // 区域信息
    @NameInMap("region_id")
    public String regionId;

    public static QueryUnionUnionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionUnionRequest self = new QueryUnionUnionRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnionUnionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnionUnionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUnionUnionRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public QueryUnionUnionRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryUnionUnionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
