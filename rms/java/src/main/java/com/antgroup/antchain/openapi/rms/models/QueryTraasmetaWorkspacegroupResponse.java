// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraasmetaWorkspacegroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // workspace_groups
    @NameInMap("workspace_groups")
    public java.util.List<TraasWorkspaceGroupDto> workspaceGroups;

    public static QueryTraasmetaWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraasmetaWorkspacegroupResponse self = new QueryTraasmetaWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraasmetaWorkspacegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraasmetaWorkspacegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraasmetaWorkspacegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraasmetaWorkspacegroupResponse setWorkspaceGroups(java.util.List<TraasWorkspaceGroupDto> workspaceGroups) {
        this.workspaceGroups = workspaceGroups;
        return this;
    }
    public java.util.List<TraasWorkspaceGroupDto> getWorkspaceGroups() {
        return this.workspaceGroups;
    }

}
