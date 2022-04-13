// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QuerySidecaropsStateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar运维状态列表
    @NameInMap("release_info")
    public java.util.List<SidecarReleaseStatus> releaseInfo;

    // 状态
    @NameInMap("state")
    public String state;

    // 变更核心所需变更后改动的podIp
    @NameInMap("change_targets")
    public String changeTargets;

    public static QuerySidecaropsStateResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySidecaropsStateResponse self = new QuerySidecaropsStateResponse();
        return TeaModel.build(map, self);
    }

    public QuerySidecaropsStateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySidecaropsStateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySidecaropsStateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySidecaropsStateResponse setReleaseInfo(java.util.List<SidecarReleaseStatus> releaseInfo) {
        this.releaseInfo = releaseInfo;
        return this;
    }
    public java.util.List<SidecarReleaseStatus> getReleaseInfo() {
        return this.releaseInfo;
    }

    public QuerySidecaropsStateResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QuerySidecaropsStateResponse setChangeTargets(String changeTargets) {
        this.changeTargets = changeTargets;
        return this;
    }
    public String getChangeTargets() {
        return this.changeTargets;
    }

}
