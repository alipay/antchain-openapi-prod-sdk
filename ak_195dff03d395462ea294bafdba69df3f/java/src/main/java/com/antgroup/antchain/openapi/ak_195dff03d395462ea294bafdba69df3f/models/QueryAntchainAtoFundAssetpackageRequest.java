// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoFundAssetpackageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true, maxLength = 200, minLength = 1)
    public String fundId;

    // 商家统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 200, minLength = 1)
    public String merchantId;

    // 商户的租户id
    @NameInMap("tenant_id")
    @Validation(required = true, maxLength = 10, minLength = 1)
    public String tenantId;

    // 用信id
    @NameInMap("utilization_id")
    @Validation(maxLength = 32, minLength = 1)
    public String utilizationId;

    // 资产包id
    @NameInMap("asset_package_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String assetPackageId;

    public static QueryAntchainAtoFundAssetpackageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoFundAssetpackageRequest self = new QueryAntchainAtoFundAssetpackageRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoFundAssetpackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoFundAssetpackageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoFundAssetpackageRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryAntchainAtoFundAssetpackageRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryAntchainAtoFundAssetpackageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoFundAssetpackageRequest setUtilizationId(String utilizationId) {
        this.utilizationId = utilizationId;
        return this;
    }
    public String getUtilizationId() {
        return this.utilizationId;
    }

    public QueryAntchainAtoFundAssetpackageRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

}
