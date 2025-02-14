// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade_inner.models;

import com.aliyun.tea.*;

public class QueryPlatformInvestmentreportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可信产业资产项目批次id
    @NameInMap("project_external_id")
    @Validation(required = true)
    public String projectExternalId;

    public static QueryPlatformInvestmentreportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPlatformInvestmentreportRequest self = new QueryPlatformInvestmentreportRequest();
        return TeaModel.build(map, self);
    }

    public QueryPlatformInvestmentreportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPlatformInvestmentreportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPlatformInvestmentreportRequest setProjectExternalId(String projectExternalId) {
        this.projectExternalId = projectExternalId;
        return this;
    }
    public String getProjectExternalId() {
        return this.projectExternalId;
    }

}
