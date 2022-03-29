// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetTraasmetaWorkspacegroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // workspace_group
    @NameInMap("workspace_group")
    public TraasWorkspaceGroupDto workspaceGroup;

    public static GetTraasmetaWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraasmetaWorkspacegroupResponse self = new GetTraasmetaWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public GetTraasmetaWorkspacegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTraasmetaWorkspacegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTraasmetaWorkspacegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTraasmetaWorkspacegroupResponse setWorkspaceGroup(TraasWorkspaceGroupDto workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public TraasWorkspaceGroupDto getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
