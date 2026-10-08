// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class OpenAntdigitalWebttsActivateRequest extends TeaModel {
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
    public String birthDate;

    public static OpenAntdigitalWebttsActivateRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenAntdigitalWebttsActivateRequest self = new OpenAntdigitalWebttsActivateRequest();
        return TeaModel.build(map, self);
    }

    public OpenAntdigitalWebttsActivateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenAntdigitalWebttsActivateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenAntdigitalWebttsActivateRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public OpenAntdigitalWebttsActivateRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public OpenAntdigitalWebttsActivateRequest setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

    public OpenAntdigitalWebttsActivateRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public OpenAntdigitalWebttsActivateRequest setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    public String getBirthDate() {
        return this.birthDate;
    }

}
