// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class GetGeneralRightsbalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约服务实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 账号的地址
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 数据资产ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static GetGeneralRightsbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralRightsbalanceRequest self = new GetGeneralRightsbalanceRequest();
        return TeaModel.build(map, self);
    }

    public GetGeneralRightsbalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetGeneralRightsbalanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetGeneralRightsbalanceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetGeneralRightsbalanceRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public GetGeneralRightsbalanceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
