// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMerchantExchangeableequitylistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 页码
    @NameInMap("page_number")
    @Validation(required = true)
    public String pageNumber;

    // 每页数量（不填默认返回50条数据）
    @NameInMap("page_size")
    public String pageSize;

    public static QueryMerchantExchangeableequitylistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantExchangeableequitylistRequest self = new QueryMerchantExchangeableequitylistRequest();
        return TeaModel.build(map, self);
    }

    public QueryMerchantExchangeableequitylistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMerchantExchangeableequitylistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMerchantExchangeableequitylistRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryMerchantExchangeableequitylistRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public QueryMerchantExchangeableequitylistRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
