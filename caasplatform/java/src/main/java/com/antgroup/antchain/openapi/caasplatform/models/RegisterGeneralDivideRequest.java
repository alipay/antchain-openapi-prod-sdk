// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class RegisterGeneralDivideRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 自定义Id,重复则更新
    @NameInMap("id")
    @Validation(required = true, maxLength = 64)
    public String id;

    // 企业营业证编号，或唯一ID
    @NameInMap("code")
    @Validation(required = true, maxLength = 100)
    public String code;

    // 企业名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 100)
    public String name;

    public static RegisterGeneralDivideRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterGeneralDivideRequest self = new RegisterGeneralDivideRequest();
        return TeaModel.build(map, self);
    }

    public RegisterGeneralDivideRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterGeneralDivideRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterGeneralDivideRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RegisterGeneralDivideRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RegisterGeneralDivideRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterGeneralDivideRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
