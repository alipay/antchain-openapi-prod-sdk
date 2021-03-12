// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户身份证号
    @NameInMap("id_card_number")
    @Validation(required = true)
    public String idCardNumber;

    // 用户手机号
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 用户姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static CreateBusinessDidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessDidRequest self = new CreateBusinessDidRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessDidRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }
    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public CreateBusinessDidRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreateBusinessDidRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
