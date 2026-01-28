// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class CheckEasMdetectionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // sql
    @NameInMap("sql")
    @Validation(required = true)
    public String sql;

    public static CheckEasMdetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckEasMdetectionRequest self = new CheckEasMdetectionRequest();
        return TeaModel.build(map, self);
    }

    public CheckEasMdetectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckEasMdetectionRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
