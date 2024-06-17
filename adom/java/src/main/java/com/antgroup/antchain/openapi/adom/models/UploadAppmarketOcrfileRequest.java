// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.adom.models;

import com.aliyun.tea.*;

public class UploadAppmarketOcrfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所购商品实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 文件名
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    public static UploadAppmarketOcrfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAppmarketOcrfileRequest self = new UploadAppmarketOcrfileRequest();
        return TeaModel.build(map, self);
    }

    public UploadAppmarketOcrfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAppmarketOcrfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UploadAppmarketOcrfileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
