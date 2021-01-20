// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsUniversalreadRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // cmds
    @NameInMap("cmds")
    public java.util.List<UniversalBodyCmd> cmds;

    // rid
    @NameInMap("rid")
    public String rid;

    public static QueryRmsUniversalreadRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsUniversalreadRequest self = new QueryRmsUniversalreadRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsUniversalreadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsUniversalreadRequest setCmds(java.util.List<UniversalBodyCmd> cmds) {
        this.cmds = cmds;
        return this;
    }
    public java.util.List<UniversalBodyCmd> getCmds() {
        return this.cmds;
    }

    public QueryRmsUniversalreadRequest setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

}
