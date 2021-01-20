// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSidecarResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar类型
    @NameInMap("sidecar")
    public Sidecar sidecar;

    public static GetSidecarResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSidecarResponse self = new GetSidecarResponse();
        return TeaModel.build(map, self);
    }

    public GetSidecarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSidecarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSidecarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSidecarResponse setSidecar(Sidecar sidecar) {
        this.sidecar = sidecar;
        return this;
    }
    public Sidecar getSidecar() {
        return this.sidecar;
    }

}
