// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class SetGeneralDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 要存储的数据，推荐json格式
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 合约服务实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    public static SetGeneralDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGeneralDepositRequest self = new SetGeneralDepositRequest();
        return TeaModel.build(map, self);
    }

    public SetGeneralDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetGeneralDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetGeneralDepositRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetGeneralDepositRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SetGeneralDepositRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
