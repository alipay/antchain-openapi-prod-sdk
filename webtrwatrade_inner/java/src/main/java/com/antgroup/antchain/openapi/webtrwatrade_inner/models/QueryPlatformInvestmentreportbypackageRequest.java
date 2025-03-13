// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade_inner.models;

import com.aliyun.tea.*;

public class QueryPlatformInvestmentreportbypackageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可信产业资产项目批次id
    @NameInMap("project_external_id")
    @Validation(required = true)
    public String projectExternalId;

    // 资产包id
    @NameInMap("asset_package_id")
    @Validation(required = true)
    public String assetPackageId;

    public static QueryPlatformInvestmentreportbypackageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPlatformInvestmentreportbypackageRequest self = new QueryPlatformInvestmentreportbypackageRequest();
        return TeaModel.build(map, self);
    }

    public QueryPlatformInvestmentreportbypackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPlatformInvestmentreportbypackageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPlatformInvestmentreportbypackageRequest setProjectExternalId(String projectExternalId) {
        this.projectExternalId = projectExternalId;
        return this;
    }
    public String getProjectExternalId() {
        return this.projectExternalId;
    }

    public QueryPlatformInvestmentreportbypackageRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

}
