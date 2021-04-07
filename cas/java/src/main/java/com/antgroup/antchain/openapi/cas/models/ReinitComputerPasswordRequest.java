// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ReinitComputerPasswordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // computer_sequence
    @NameInMap("computer_sequence")
    @Validation(required = true)
    public String computerSequence;

    // 密码
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    public static ReinitComputerPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitComputerPasswordRequest self = new ReinitComputerPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ReinitComputerPasswordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReinitComputerPasswordRequest setComputerSequence(String computerSequence) {
        this.computerSequence = computerSequence;
        return this;
    }
    public String getComputerSequence() {
        return this.computerSequence;
    }

    public ReinitComputerPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
