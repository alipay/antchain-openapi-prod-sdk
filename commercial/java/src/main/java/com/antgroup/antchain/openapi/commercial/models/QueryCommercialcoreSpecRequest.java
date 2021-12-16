// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryCommercialcoreSpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 规格code
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    public static QueryCommercialcoreSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommercialcoreSpecRequest self = new QueryCommercialcoreSpecRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommercialcoreSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCommercialcoreSpecRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

}
