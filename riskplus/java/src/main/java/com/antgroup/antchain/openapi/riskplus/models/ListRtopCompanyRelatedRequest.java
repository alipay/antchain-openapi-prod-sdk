// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ListRtopCompanyRelatedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业id
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    public static ListRtopCompanyRelatedRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRtopCompanyRelatedRequest self = new ListRtopCompanyRelatedRequest();
        return TeaModel.build(map, self);
    }

    public ListRtopCompanyRelatedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRtopCompanyRelatedRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListRtopCompanyRelatedRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

}
