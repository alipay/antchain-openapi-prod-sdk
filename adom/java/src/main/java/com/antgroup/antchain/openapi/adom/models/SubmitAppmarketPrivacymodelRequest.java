// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.adom.models;

import com.aliyun.tea.*;

public class SubmitAppmarketPrivacymodelRequest extends TeaModel {
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

    public static SubmitAppmarketPrivacymodelRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAppmarketPrivacymodelRequest self = new SubmitAppmarketPrivacymodelRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAppmarketPrivacymodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAppmarketPrivacymodelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SubmitAppmarketPrivacymodelRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public SubmitAppmarketPrivacymodelRequest setStructInput(String structInput) {
        this.structInput = structInput;
        return this;
    }
    public String getStructInput() {
        return this.structInput;
    }

}
