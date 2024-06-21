// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class QueryProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // l3code的数组
    @NameInMap("l3code_list")
    @Validation(required = true)
    public java.util.List<String> l3codeList;

    public static QueryProductRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductRequest self = new QueryProductRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryProductRequest setL3codeList(java.util.List<String> l3codeList) {
        this.l3codeList = l3codeList;
        return this;
    }
    public java.util.List<String> getL3codeList() {
        return this.l3codeList;
    }

}
