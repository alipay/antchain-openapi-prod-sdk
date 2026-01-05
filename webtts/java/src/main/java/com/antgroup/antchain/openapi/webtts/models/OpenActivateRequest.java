// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class OpenActivateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 外部客户id
    @NameInMap("external_customer_id")
    @Validation(required = true)
    public String externalCustomerId;

    // 客户性别
    @NameInMap("sex")
    @Validation(required = true)
    public String sex;

    // 用户名
    @NameInMap("username")
    @Validation(required = true)
    public String username;

    // 出生日期
    @NameInMap("birth_date")
    @Validation(required = true)
    public Long birthDate;

    public static OpenActivateRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenActivateRequest self = new OpenActivateRequest();
        return TeaModel.build(map, self);
    }

    public OpenActivateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenActivateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenActivateRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public OpenActivateRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public OpenActivateRequest setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

    public OpenActivateRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public OpenActivateRequest setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    public Long getBirthDate() {
        return this.birthDate;
    }

}
