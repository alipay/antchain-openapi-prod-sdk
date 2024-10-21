// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class DeleteIssuerProjectkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目密钥ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static DeleteIssuerProjectkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIssuerProjectkeyRequest self = new DeleteIssuerProjectkeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIssuerProjectkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteIssuerProjectkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteIssuerProjectkeyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
