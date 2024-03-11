// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31dc9f55b9684fe29acc7c0125a5d7a2.models;

import com.aliyun.tea.*;

public class UploadAntcloudAdomAppmarketOcrfileRequest extends TeaModel {
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

    public static UploadAntcloudAdomAppmarketOcrfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAntcloudAdomAppmarketOcrfileRequest self = new UploadAntcloudAdomAppmarketOcrfileRequest();
        return TeaModel.build(map, self);
    }

    public UploadAntcloudAdomAppmarketOcrfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAntcloudAdomAppmarketOcrfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UploadAntcloudAdomAppmarketOcrfileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
