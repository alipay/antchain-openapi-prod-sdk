// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class AuthItagAntitagAcmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 第三方平台用户ID
    @NameInMap("accountno")
    @Validation(required = true)
    public String accountno;

    // 用户来源
    @NameInMap("accountsource")
    @Validation(required = true)
    public String accountsource;

    public static AuthItagAntitagAcmRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthItagAntitagAcmRequest self = new AuthItagAntitagAcmRequest();
        return TeaModel.build(map, self);
    }

    public AuthItagAntitagAcmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthItagAntitagAcmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthItagAntitagAcmRequest setAccountno(String accountno) {
        this.accountno = accountno;
        return this;
    }
    public String getAccountno() {
        return this.accountno;
    }

    public AuthItagAntitagAcmRequest setAccountsource(String accountsource) {
        this.accountsource = accountsource;
        return this;
    }
    public String getAccountsource() {
        return this.accountsource;
    }

}
