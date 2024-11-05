// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demositdevsy.models;

import com.aliyun.tea.*;

public class QueryTesxXxxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 性别
    @NameInMap("sex")
    public Long sex;

    public static QueryTesxXxxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTesxXxxRequest self = new QueryTesxXxxRequest();
        return TeaModel.build(map, self);
    }

    public QueryTesxXxxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTesxXxxRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryTesxXxxRequest setSex(Long sex) {
        this.sex = sex;
        return this;
    }
    public Long getSex() {
        return this.sex;
    }

}
