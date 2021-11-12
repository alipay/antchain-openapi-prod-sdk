// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ImportProdMetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
    @NameInMap("box_data")
    @Validation(required = true)
    public String boxData;

    public static ImportProdMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportProdMetaRequest self = new ImportProdMetaRequest();
        return TeaModel.build(map, self);
    }

    public ImportProdMetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportProdMetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportProdMetaRequest setBoxData(String boxData) {
        this.boxData = boxData;
        return this;
    }
    public String getBoxData() {
        return this.boxData;
    }

}
