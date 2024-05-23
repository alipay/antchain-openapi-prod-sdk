// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerMerchantagreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 协议编号
    @NameInMap("agreement_id")
    @Validation(required = true)
    public String agreementId;

    // 签署动作
    @NameInMap("sign_action")
    @Validation(required = true)
    public String signAction;

    // 操作人名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static CreateInnerMerchantagreementRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerMerchantagreementRequest self = new CreateInnerMerchantagreementRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerMerchantagreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerMerchantagreementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerMerchantagreementRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerMerchantagreementRequest setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }
    public String getAgreementId() {
        return this.agreementId;
    }

    public CreateInnerMerchantagreementRequest setSignAction(String signAction) {
        this.signAction = signAction;
        return this;
    }
    public String getSignAction() {
        return this.signAction;
    }

    public CreateInnerMerchantagreementRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
