// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DeleteSchemaAdmindetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // uniq_id
    @NameInMap("uniq_id")
    @Validation(required = true)
    public Long uniqId;

    public static DeleteSchemaAdmindetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemaAdmindetailRequest self = new DeleteSchemaAdmindetailRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSchemaAdmindetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSchemaAdmindetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSchemaAdmindetailRequest setUniqId(Long uniqId) {
        this.uniqId = uniqId;
        return this;
    }
    public Long getUniqId() {
        return this.uniqId;
    }

}
