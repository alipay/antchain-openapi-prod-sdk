// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryUnireleaseSolutionfilesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 日期
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    public static QueryUnireleaseSolutionfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnireleaseSolutionfilesRequest self = new QueryUnireleaseSolutionfilesRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnireleaseSolutionfilesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnireleaseSolutionfilesRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
