// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSidecarVersionResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar发布版本
    @NameInMap("sidecar_release_version")
    public SidecarReleaseVersion sidecarReleaseVersion;

    public static GetSidecarVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSidecarVersionResponse self = new GetSidecarVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetSidecarVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSidecarVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSidecarVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSidecarVersionResponse setSidecarReleaseVersion(SidecarReleaseVersion sidecarReleaseVersion) {
        this.sidecarReleaseVersion = sidecarReleaseVersion;
        return this;
    }
    public SidecarReleaseVersion getSidecarReleaseVersion() {
        return this.sidecarReleaseVersion;
    }

}
