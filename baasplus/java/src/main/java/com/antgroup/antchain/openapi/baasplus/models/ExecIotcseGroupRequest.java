// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class ExecIotcseGroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 暂无
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static ExecIotcseGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecIotcseGroupRequest self = new ExecIotcseGroupRequest();
        return TeaModel.build(map, self);
    }

    public ExecIotcseGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecIotcseGroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecIotcseGroupRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
