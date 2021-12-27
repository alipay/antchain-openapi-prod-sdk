// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GetRtopCompanyDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业ID
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    public static GetRtopCompanyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRtopCompanyDetailRequest self = new GetRtopCompanyDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetRtopCompanyDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRtopCompanyDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetRtopCompanyDetailRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

}
