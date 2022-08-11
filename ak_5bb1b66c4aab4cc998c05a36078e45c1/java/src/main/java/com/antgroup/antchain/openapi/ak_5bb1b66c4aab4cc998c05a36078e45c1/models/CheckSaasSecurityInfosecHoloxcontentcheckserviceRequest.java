// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("holox_check_event")
    public HoloxCheckEvent holoxCheckEvent;

    // 123
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    // 大安全风控接口返回结果
    @NameInMap("data")
    public HoloxCheckResult data;

    public static CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest self = new CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest();
        return TeaModel.build(map, self);
    }

    public CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest setHoloxCheckEvent(HoloxCheckEvent holoxCheckEvent) {
        this.holoxCheckEvent = holoxCheckEvent;
        return this;
    }
    public HoloxCheckEvent getHoloxCheckEvent() {
        return this.holoxCheckEvent;
    }

    public CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest setData(HoloxCheckResult data) {
        this.data = data;
        return this;
    }
    public HoloxCheckResult getData() {
        return this.data;
    }

}
