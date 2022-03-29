// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsUniversalwriteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // cmds
    @NameInMap("cmds")
    @Validation(required = true)
    public java.util.List<UniversalBodyCmd> cmds;

    // rid
    @NameInMap("rid")
    @Validation(required = true)
    public String rid;

    public static QueryRmsUniversalwriteRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsUniversalwriteRequest self = new QueryRmsUniversalwriteRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsUniversalwriteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsUniversalwriteRequest setCmds(java.util.List<UniversalBodyCmd> cmds) {
        this.cmds = cmds;
        return this;
    }
    public java.util.List<UniversalBodyCmd> getCmds() {
        return this.cmds;
    }

    public QueryRmsUniversalwriteRequest setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

}
