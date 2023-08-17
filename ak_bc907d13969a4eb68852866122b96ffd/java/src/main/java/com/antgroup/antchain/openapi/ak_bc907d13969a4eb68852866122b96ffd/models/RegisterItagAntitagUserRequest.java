// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class RegisterItagAntitagUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 第三方系统用户账号ID
    @NameInMap("accountno")
    @Validation(required = true)
    public String accountno;

    // 用户来源
    @NameInMap("accountsource")
    @Validation(required = true)
    public String accountsource;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 电话
    @NameInMap("phone")
    public String phone;

    public static RegisterItagAntitagUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterItagAntitagUserRequest self = new RegisterItagAntitagUserRequest();
        return TeaModel.build(map, self);
    }

    public RegisterItagAntitagUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterItagAntitagUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterItagAntitagUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RegisterItagAntitagUserRequest setAccountno(String accountno) {
        this.accountno = accountno;
        return this;
    }
    public String getAccountno() {
        return this.accountno;
    }

    public RegisterItagAntitagUserRequest setAccountsource(String accountsource) {
        this.accountsource = accountsource;
        return this;
    }
    public String getAccountsource() {
        return this.accountsource;
    }

    public RegisterItagAntitagUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public RegisterItagAntitagUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
