// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class QueryNftAssetbyskuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 手机号或者支付宝uid或者open_uid
    @NameInMap("id_no")
    @Validation(required = true)
    public String idNo;

    // 用户id类型
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // sku_meta的ip_id
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

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

}
