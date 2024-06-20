// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class GetGeneralDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 合约服务实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    public static GetGeneralDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralDepositRequest self = new GetGeneralDepositRequest();
        return TeaModel.build(map, self);
    }

    public GetGeneralDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetGeneralDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetGeneralDepositRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetGeneralDepositRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
