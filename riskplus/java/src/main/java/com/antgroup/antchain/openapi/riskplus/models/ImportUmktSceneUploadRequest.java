// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ImportUmktSceneUploadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要刷新的key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 需要刷新的value，可能是json格式
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static ImportUmktSceneUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportUmktSceneUploadRequest self = new ImportUmktSceneUploadRequest();
        return TeaModel.build(map, self);
    }

    public ImportUmktSceneUploadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportUmktSceneUploadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportUmktSceneUploadRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ImportUmktSceneUploadRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
