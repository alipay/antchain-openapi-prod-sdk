// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteDatabaseAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // account id
    @NameInMap("account_sequence")
    @Validation(required = true)
    public String accountSequence;

    public static DeleteDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseAccountRequest self = new DeleteDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDatabaseAccountRequest setAccountSequence(String accountSequence) {
        this.accountSequence = accountSequence;
        return this;
    }
    public String getAccountSequence() {
        return this.accountSequence;
    }

}
