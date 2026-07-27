// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class QueryZolozsgRaasApplicantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static QueryZolozsgRaasApplicantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryZolozsgRaasApplicantRequest self = new QueryZolozsgRaasApplicantRequest();
        return TeaModel.build(map, self);
    }

    public QueryZolozsgRaasApplicantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryZolozsgRaasApplicantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
