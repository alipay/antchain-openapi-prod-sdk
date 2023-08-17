// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class AddItagAntitagUserTntRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 标注平台的租户ID
    @NameInMap("tntinstid")
    @Validation(required = true)
    public String tntinstid;

    // 第三方账号
    @NameInMap("accountno")
    @Validation(required = true)
    public String accountno;

    // 用户来源
    @NameInMap("accountsource")
    @Validation(required = true)
    public String accountsource;

    // 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
    @NameInMap("role")
    public String role;

    public static AddItagAntitagUserTntRequest build(java.util.Map<String, ?> map) throws Exception {
        AddItagAntitagUserTntRequest self = new AddItagAntitagUserTntRequest();
        return TeaModel.build(map, self);
    }

    public AddItagAntitagUserTntRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddItagAntitagUserTntRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddItagAntitagUserTntRequest setTntinstid(String tntinstid) {
        this.tntinstid = tntinstid;
        return this;
    }
    public String getTntinstid() {
        return this.tntinstid;
    }

    public AddItagAntitagUserTntRequest setAccountno(String accountno) {
        this.accountno = accountno;
        return this;
    }
    public String getAccountno() {
        return this.accountno;
    }

    public AddItagAntitagUserTntRequest setAccountsource(String accountsource) {
        this.accountsource = accountsource;
        return this;
    }
    public String getAccountsource() {
        return this.accountsource;
    }

    public AddItagAntitagUserTntRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
