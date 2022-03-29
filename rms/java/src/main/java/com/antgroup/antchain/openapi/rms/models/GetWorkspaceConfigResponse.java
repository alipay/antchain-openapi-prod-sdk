// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetWorkspaceConfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否拥有kubeconfig
    @NameInMap("has_kubeconfig")
    public Boolean hasKubeconfig;

    public static GetWorkspaceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceConfigResponse self = new GetWorkspaceConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetWorkspaceConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetWorkspaceConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetWorkspaceConfigResponse setHasKubeconfig(Boolean hasKubeconfig) {
        this.hasKubeconfig = hasKubeconfig;
        return this;
    }
    public Boolean getHasKubeconfig() {
        return this.hasKubeconfig;
    }

}
