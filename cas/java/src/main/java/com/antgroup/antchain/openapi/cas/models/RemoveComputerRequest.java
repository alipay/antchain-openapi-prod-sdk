// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RemoveComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // computer ids
    @NameInMap("computer_sequences")
    @Validation(required = true)
    public java.util.List<String> computerSequences;

    public static RemoveComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveComputerRequest self = new RemoveComputerRequest();
        return TeaModel.build(map, self);
    }

    public RemoveComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveComputerRequest setComputerSequences(java.util.List<String> computerSequences) {
        this.computerSequences = computerSequences;
        return this;
    }
    public java.util.List<String> getComputerSequences() {
        return this.computerSequences;
    }

}
