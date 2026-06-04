// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class CheckInfosecHoloxcontentcheckserviceRequest extends TeaModel {
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

    public static CheckInfosecHoloxcontentcheckserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInfosecHoloxcontentcheckserviceRequest self = new CheckInfosecHoloxcontentcheckserviceRequest();
        return TeaModel.build(map, self);
    }

    public CheckInfosecHoloxcontentcheckserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckInfosecHoloxcontentcheckserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckInfosecHoloxcontentcheckserviceRequest setHoloxCheckEvent(HoloxCheckEvent holoxCheckEvent) {
        this.holoxCheckEvent = holoxCheckEvent;
        return this;
    }
    public HoloxCheckEvent getHoloxCheckEvent() {
        return this.holoxCheckEvent;
    }

    public CheckInfosecHoloxcontentcheckserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
