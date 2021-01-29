// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateBuildpackResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 创建完成的技术栈ID
    @NameInMap("buildpack_id")
    @Validation(required = true)
    public String buildpackId;

    // 技术栈包上传地址信息
    @NameInMap("upload_endpoints")
    @Validation(required = true)
    public java.util.List<UploadEndpoint> uploadEndpoints;

    public static CreateBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpackResponse self = new CreateBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public CreateBuildpackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBuildpackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBuildpackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBuildpackResponse setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public CreateBuildpackResponse setUploadEndpoints(java.util.List<UploadEndpoint> uploadEndpoints) {
        this.uploadEndpoints = uploadEndpoints;
        return this;
    }
    public java.util.List<UploadEndpoint> getUploadEndpoints() {
        return this.uploadEndpoints;
    }

}
