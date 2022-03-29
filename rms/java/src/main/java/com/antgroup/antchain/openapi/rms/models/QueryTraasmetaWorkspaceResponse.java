// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraasmetaWorkspaceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // workspaces
    @NameInMap("workspaces")
    public java.util.List<TraasWorkspaceDto> workspaces;

    public static QueryTraasmetaWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraasmetaWorkspaceResponse self = new QueryTraasmetaWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraasmetaWorkspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraasmetaWorkspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraasmetaWorkspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraasmetaWorkspaceResponse setWorkspaces(java.util.List<TraasWorkspaceDto> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<TraasWorkspaceDto> getWorkspaces() {
        return this.workspaces;
    }

}
