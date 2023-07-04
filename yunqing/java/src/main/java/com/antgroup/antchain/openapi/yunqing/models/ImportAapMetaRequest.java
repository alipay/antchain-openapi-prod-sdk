// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ImportAapMetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // yaml的string格式
    @NameInMap("meta_context")
    @Validation(required = true)
    public String metaContext;

    public static ImportAapMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAapMetaRequest self = new ImportAapMetaRequest();
        return TeaModel.build(map, self);
    }

    public ImportAapMetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportAapMetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportAapMetaRequest setMetaContext(String metaContext) {
        this.metaContext = metaContext;
        return this;
    }
    public String getMetaContext() {
        return this.metaContext;
    }

}
