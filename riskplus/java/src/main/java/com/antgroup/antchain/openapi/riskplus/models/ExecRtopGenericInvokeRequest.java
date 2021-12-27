// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ExecRtopGenericInvokeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // {"platformId":1234}
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 这个账号的所有权限点，逗号分隔
    @NameInMap("permission")
    @Validation(required = true)
    public String permission;

    // title
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    public static ExecRtopGenericInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecRtopGenericInvokeRequest self = new ExecRtopGenericInvokeRequest();
        return TeaModel.build(map, self);
    }

    public ExecRtopGenericInvokeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecRtopGenericInvokeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecRtopGenericInvokeRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecRtopGenericInvokeRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public ExecRtopGenericInvokeRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
