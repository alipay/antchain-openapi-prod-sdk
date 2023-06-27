// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31dc9f55b9684fe29acc7c0125a5d7a2.models;

import com.aliyun.tea.*;

public class ExecAntcloudAdomAppmarketPrivacymodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 文件标识，文件上传时的入参
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    public static ExecAntcloudAdomAppmarketPrivacymodelRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudAdomAppmarketPrivacymodelRequest self = new ExecAntcloudAdomAppmarketPrivacymodelRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudAdomAppmarketPrivacymodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudAdomAppmarketPrivacymodelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecAntcloudAdomAppmarketPrivacymodelRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
