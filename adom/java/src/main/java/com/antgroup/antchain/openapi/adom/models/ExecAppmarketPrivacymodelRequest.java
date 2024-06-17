// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.adom.models;

import com.aliyun.tea.*;

public class ExecAppmarketPrivacymodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 文件标识，文件上传时的入参
    @NameInMap("file_id")
    public String fileId;

    // 结构化入参
    @NameInMap("struct_input")
    public String structInput;

    public static ExecAppmarketPrivacymodelRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAppmarketPrivacymodelRequest self = new ExecAppmarketPrivacymodelRequest();
        return TeaModel.build(map, self);
    }

    public ExecAppmarketPrivacymodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAppmarketPrivacymodelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecAppmarketPrivacymodelRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ExecAppmarketPrivacymodelRequest setStructInput(String structInput) {
        this.structInput = structInput;
        return this;
    }
    public String getStructInput() {
        return this.structInput;
    }

}
