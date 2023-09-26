// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightStatisticassetdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 合约地址
    @NameInMap("contract")
    @Validation(required = true)
    public String contract;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    public static QueryChaininsightStatisticassetdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightStatisticassetdetailRequest self = new QueryChaininsightStatisticassetdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightStatisticassetdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightStatisticassetdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightStatisticassetdetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryChaininsightStatisticassetdetailRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public QueryChaininsightStatisticassetdetailRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

}
