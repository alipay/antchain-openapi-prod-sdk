// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerMerchantagreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 协议id
    @NameInMap("agreement_id")
    @Validation(required = true)
    public String agreementId;

    // 租户账号
    @NameInMap("user_name")
    public String userName;

    public static QueryInnerMerchantagreementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerMerchantagreementRequest self = new QueryInnerMerchantagreementRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerMerchantagreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerMerchantagreementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerMerchantagreementRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerMerchantagreementRequest setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }
    public String getAgreementId() {
        return this.agreementId;
    }

    public QueryInnerMerchantagreementRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
