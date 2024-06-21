// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class QueryCodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("l5code_list")
    @Validation(required = true)
    public java.util.List<String> l5codeList;

    public static QueryCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCodeRequest self = new QueryCodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCodeRequest setL5codeList(java.util.List<String> l5codeList) {
        this.l5codeList = l5codeList;
        return this;
    }
    public java.util.List<String> getL5codeList() {
        return this.l5codeList;
    }

}
