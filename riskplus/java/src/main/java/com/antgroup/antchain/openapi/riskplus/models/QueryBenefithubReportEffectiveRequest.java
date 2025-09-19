// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryBenefithubReportEffectiveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户唯一id
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    // 平台code
    @NameInMap("platform_code")
    @Validation(required = true)
    public String platformCode;

    public static QueryBenefithubReportEffectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBenefithubReportEffectiveRequest self = new QueryBenefithubReportEffectiveRequest();
        return TeaModel.build(map, self);
    }

    public QueryBenefithubReportEffectiveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBenefithubReportEffectiveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBenefithubReportEffectiveRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public QueryBenefithubReportEffectiveRequest setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }
    public String getPlatformCode() {
        return this.platformCode;
    }

}
