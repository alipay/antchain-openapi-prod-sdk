// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryNftAssetbyskuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 具体用户Id标识，支持不同类型的id标识，根据toIdType不同而不同
    @NameInMap("id_no")
    @Validation(required = true)
    public String idNo;

    // 参照idType枚举，支持手机号/openUserId
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 数字藏品类标识ID
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    // 页码，从1开始
    @NameInMap("page")
    @Validation(required = true)
    public Long page;

    // 分页大小-上限10
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryNftAssetbyskuRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNftAssetbyskuRequest self = new QueryNftAssetbyskuRequest();
        return TeaModel.build(map, self);
    }

    public QueryNftAssetbyskuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNftAssetbyskuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNftAssetbyskuRequest setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

    public QueryNftAssetbyskuRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public QueryNftAssetbyskuRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public QueryNftAssetbyskuRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryNftAssetbyskuRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
