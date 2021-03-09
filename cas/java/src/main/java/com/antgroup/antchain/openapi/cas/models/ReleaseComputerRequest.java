// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ReleaseComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 需要释放的 computer ids
    @NameInMap("computer_sequences")
    @Validation(required = true)
    public java.util.List<String> computerSequences;

    public static ReleaseComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseComputerRequest self = new ReleaseComputerRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReleaseComputerRequest setComputerSequences(java.util.List<String> computerSequences) {
        this.computerSequences = computerSequences;
        return this;
    }
    public java.util.List<String> getComputerSequences() {
        return this.computerSequences;
    }

}
