// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSidecarInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar版本实例
    @NameInMap("sidecar_version_instance")
    public SidecarVersionInstance sidecarVersionInstance;

    public static GetSidecarInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSidecarInstanceResponse self = new GetSidecarInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetSidecarInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSidecarInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSidecarInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSidecarInstanceResponse setSidecarVersionInstance(SidecarVersionInstance sidecarVersionInstance) {
        this.sidecarVersionInstance = sidecarVersionInstance;
        return this;
    }
    public SidecarVersionInstance getSidecarVersionInstance() {
        return this.sidecarVersionInstance;
    }

}
