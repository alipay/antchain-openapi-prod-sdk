// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateTraasmetaWorkspacegroupResponse extends TeaModel {
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

    public static CreateTraasmetaWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTraasmetaWorkspacegroupResponse self = new CreateTraasmetaWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateTraasmetaWorkspacegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateTraasmetaWorkspacegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateTraasmetaWorkspacegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateTraasmetaWorkspacegroupResponse setWorkspaceGroup(TraasWorkspaceGroupDto workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public TraasWorkspaceGroupDto getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
