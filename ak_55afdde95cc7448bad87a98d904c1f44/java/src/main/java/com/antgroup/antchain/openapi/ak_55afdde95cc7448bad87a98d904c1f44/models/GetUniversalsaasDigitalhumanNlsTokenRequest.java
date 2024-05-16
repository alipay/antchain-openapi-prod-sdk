// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_55afdde95cc7448bad87a98d904c1f44.models;

import com.aliyun.tea.*;

public class GetUniversalsaasDigitalhumanNlsTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户code&租户id，对于子部门客户需要上传子部门id
    @NameInMap("tenant_code")
    public String tenantCode;

    public static GetUniversalsaasDigitalhumanNlsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUniversalsaasDigitalhumanNlsTokenRequest self = new GetUniversalsaasDigitalhumanNlsTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetUniversalsaasDigitalhumanNlsTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUniversalsaasDigitalhumanNlsTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetUniversalsaasDigitalhumanNlsTokenRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

}
