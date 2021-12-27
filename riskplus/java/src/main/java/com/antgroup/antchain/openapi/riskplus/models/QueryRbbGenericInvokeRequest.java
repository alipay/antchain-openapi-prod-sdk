// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRbbGenericInvokeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // {"platformId":1234,"method":"riskQuery"}
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 账号的所有权限点，逗号分隔
    @NameInMap("permission")
    @Validation(required = true)
    public String permission;

    // 标题备用
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    public static QueryRbbGenericInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRbbGenericInvokeRequest self = new QueryRbbGenericInvokeRequest();
        return TeaModel.build(map, self);
    }

    public QueryRbbGenericInvokeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRbbGenericInvokeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRbbGenericInvokeRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryRbbGenericInvokeRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public QueryRbbGenericInvokeRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
