// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unicontact.models;

import com.aliyun.tea.*;

public class ImportInitUploadRequest extends TeaModel {
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

    public static ImportInitUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportInitUploadRequest self = new ImportInitUploadRequest();
        return TeaModel.build(map, self);
    }

    public ImportInitUploadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportInitUploadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportInitUploadRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ImportInitUploadRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
