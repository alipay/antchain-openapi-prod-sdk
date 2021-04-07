// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteLoadbalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // loadbalance 序列号
    @NameInMap("loadbalance_sequences")
    @Validation(required = true)
    public java.util.List<String> loadbalanceSequences;

    public static DeleteLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadbalanceRequest self = new DeleteLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoadbalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteLoadbalanceRequest setLoadbalanceSequences(java.util.List<String> loadbalanceSequences) {
        this.loadbalanceSequences = loadbalanceSequences;
        return this;
    }
    public java.util.List<String> getLoadbalanceSequences() {
        return this.loadbalanceSequences;
    }

}
