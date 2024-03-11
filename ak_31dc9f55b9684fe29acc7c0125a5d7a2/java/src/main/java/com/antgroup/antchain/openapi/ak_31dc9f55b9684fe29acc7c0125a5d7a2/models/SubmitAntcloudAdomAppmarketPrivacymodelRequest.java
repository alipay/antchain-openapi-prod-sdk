// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31dc9f55b9684fe29acc7c0125a5d7a2.models;

import com.aliyun.tea.*;

public class SubmitAntcloudAdomAppmarketPrivacymodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 文件名称
    @NameInMap("file_id")
    public String fileId;

    // 结构化入参
    @NameInMap("struct_input")
    public String structInput;

    public static SubmitAntcloudAdomAppmarketPrivacymodelRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntcloudAdomAppmarketPrivacymodelRequest self = new SubmitAntcloudAdomAppmarketPrivacymodelRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAntcloudAdomAppmarketPrivacymodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAntcloudAdomAppmarketPrivacymodelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SubmitAntcloudAdomAppmarketPrivacymodelRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public SubmitAntcloudAdomAppmarketPrivacymodelRequest setStructInput(String structInput) {
        this.structInput = structInput;
        return this;
    }
    public String getStructInput() {
        return this.structInput;
    }

}
