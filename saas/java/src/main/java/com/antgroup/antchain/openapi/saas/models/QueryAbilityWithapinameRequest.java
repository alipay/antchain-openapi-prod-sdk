// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryAbilityWithapinameRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api名称列表
    @NameInMap("api_name_list")
    @Validation(required = true)
    public java.util.List<String> apiNameList;

    public static QueryAbilityWithapinameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAbilityWithapinameRequest self = new QueryAbilityWithapinameRequest();
        return TeaModel.build(map, self);
    }

    public QueryAbilityWithapinameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAbilityWithapinameRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAbilityWithapinameRequest setApiNameList(java.util.List<String> apiNameList) {
        this.apiNameList = apiNameList;
        return this;
    }
    public java.util.List<String> getApiNameList() {
        return this.apiNameList;
    }

}
