// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class AuthCommercialcoreSpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 规格code
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    // 规格状态
    @NameInMap("spec_status")
    @Validation(required = true)
    public String specStatus;

    public static AuthCommercialcoreSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthCommercialcoreSpecRequest self = new AuthCommercialcoreSpecRequest();
        return TeaModel.build(map, self);
    }

    public AuthCommercialcoreSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthCommercialcoreSpecRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public AuthCommercialcoreSpecRequest setSpecStatus(String specStatus) {
        this.specStatus = specStatus;
        return this;
    }
    public String getSpecStatus() {
        return this.specStatus;
    }

}
