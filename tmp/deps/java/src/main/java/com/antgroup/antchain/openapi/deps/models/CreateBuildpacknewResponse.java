// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateBuildpacknewResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // buildpack_id
    // 
    @NameInMap("buildpack_id")
    public String buildpackId;

    // upload_endpoints
    // 
    @NameInMap("upload_endpoints")
    public java.util.List<UploadEndpoint> uploadEndpoints;

    public static CreateBuildpacknewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpacknewResponse self = new CreateBuildpacknewResponse();
        return TeaModel.build(map, self);
    }

    public CreateBuildpacknewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBuildpacknewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBuildpacknewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBuildpacknewResponse setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public CreateBuildpacknewResponse setUploadEndpoints(java.util.List<UploadEndpoint> uploadEndpoints) {
        this.uploadEndpoints = uploadEndpoints;
        return this;
    }
    public java.util.List<UploadEndpoint> getUploadEndpoints() {
        return this.uploadEndpoints;
    }

}
