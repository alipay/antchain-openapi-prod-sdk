// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetTraasmetaWorkspaceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // workspace
    @NameInMap("workspace")
    public TraasWorkspaceDto workspace;

    public static GetTraasmetaWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraasmetaWorkspaceResponse self = new GetTraasmetaWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetTraasmetaWorkspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTraasmetaWorkspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTraasmetaWorkspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTraasmetaWorkspaceResponse setWorkspace(TraasWorkspaceDto workspace) {
        this.workspace = workspace;
        return this;
    }
    public TraasWorkspaceDto getWorkspace() {
        return this.workspace;
    }

}
