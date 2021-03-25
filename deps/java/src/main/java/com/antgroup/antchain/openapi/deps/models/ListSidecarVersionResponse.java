// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListSidecarVersionResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar发布版本列表
    @NameInMap("sidecar_release_versions")
    public java.util.List<SidecarReleaseVersion> sidecarReleaseVersions;

    // 总记录条数
    @NameInMap("total_count")
    public Long totalCount;

    public static ListSidecarVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarVersionResponse self = new ListSidecarVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListSidecarVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSidecarVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSidecarVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSidecarVersionResponse setSidecarReleaseVersions(java.util.List<SidecarReleaseVersion> sidecarReleaseVersions) {
        this.sidecarReleaseVersions = sidecarReleaseVersions;
        return this;
    }
    public java.util.List<SidecarReleaseVersion> getSidecarReleaseVersions() {
        return this.sidecarReleaseVersions;
    }

    public ListSidecarVersionResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
