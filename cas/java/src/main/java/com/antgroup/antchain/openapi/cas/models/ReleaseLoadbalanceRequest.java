// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ReleaseLoadbalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // loadbalance ids
    @NameInMap("loadbalance_sequences")
    @Validation(required = true)
    public java.util.List<String> loadbalanceSequences;

    public static ReleaseLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLoadbalanceRequest self = new ReleaseLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseLoadbalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReleaseLoadbalanceRequest setLoadbalanceSequences(java.util.List<String> loadbalanceSequences) {
        this.loadbalanceSequences = loadbalanceSequences;
        return this;
    }
    public java.util.List<String> getLoadbalanceSequences() {
        return this.loadbalanceSequences;
    }

}
