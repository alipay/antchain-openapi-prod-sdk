// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateContractUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 邮箱地址，默认不变
    @NameInMap("email")
    public String email;

    // 证件号，该字段只有为空才允许修改
    @NameInMap("id_number")
    public String idNumber;

    // 证件类型，默认为身份证
    @NameInMap("id_type")
    public String idType;

    // 手机号码，默认不变
    @NameInMap("mobile")
    public String mobile;

    // 姓名，默认不变
    @NameInMap("name")
    public String name;

    // 用户账号id，注册用户返回的个人账号id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static UpdateContractUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContractUserRequest self = new UpdateContractUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContractUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContractUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateContractUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateContractUserRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public UpdateContractUserRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public UpdateContractUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public UpdateContractUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContractUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
