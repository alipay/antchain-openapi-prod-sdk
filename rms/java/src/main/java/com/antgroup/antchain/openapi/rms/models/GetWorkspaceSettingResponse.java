// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetWorkspaceSettingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 工作空间配置
    @NameInMap("workspace_setting_detail")
    public WorkspaceSettingDetail workspaceSettingDetail;

    public static GetWorkspaceSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceSettingResponse self = new GetWorkspaceSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceSettingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetWorkspaceSettingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetWorkspaceSettingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetWorkspaceSettingResponse setWorkspaceSettingDetail(WorkspaceSettingDetail workspaceSettingDetail) {
        this.workspaceSettingDetail = workspaceSettingDetail;
        return this;
    }
    public WorkspaceSettingDetail getWorkspaceSettingDetail() {
        return this.workspaceSettingDetail;
    }

}
