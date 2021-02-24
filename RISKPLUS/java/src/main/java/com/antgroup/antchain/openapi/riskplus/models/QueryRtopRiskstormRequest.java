// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopRiskstormRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业ID
    @NameInMap("company_id")
    public String companyId;

    // 数据类型
    @NameInMap("type")
    public String type;

    public static QueryRtopRiskstormRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopRiskstormRequest self = new QueryRtopRiskstormRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopRiskstormRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopRiskstormRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopRiskstormRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public QueryRtopRiskstormRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
