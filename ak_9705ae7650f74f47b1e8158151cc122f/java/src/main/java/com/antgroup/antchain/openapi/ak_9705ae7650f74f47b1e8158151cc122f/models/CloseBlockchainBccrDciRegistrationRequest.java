// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class CloseBlockchainBccrDciRegistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登id
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public String digitalRegisterId;

    // 退费人名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 联系手机号
    @NameInMap("mobile_no")
    @Validation(required = true)
    public String mobileNo;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static CloseBlockchainBccrDciRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseBlockchainBccrDciRegistrationRequest self = new CloseBlockchainBccrDciRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public CloseBlockchainBccrDciRegistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CloseBlockchainBccrDciRegistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CloseBlockchainBccrDciRegistrationRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

    public CloseBlockchainBccrDciRegistrationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloseBlockchainBccrDciRegistrationRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public CloseBlockchainBccrDciRegistrationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
