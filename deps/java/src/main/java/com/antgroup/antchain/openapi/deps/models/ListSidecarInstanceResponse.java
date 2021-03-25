// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListSidecarInstanceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar版本实例列表
    @NameInMap("sidecar_version_instances")
    public java.util.List<SidecarVersionInstance> sidecarVersionInstances;

    // 总记录条数
    @NameInMap("total_count")
    public Long totalCount;

    public static ListSidecarInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarInstanceResponse self = new ListSidecarInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListSidecarInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSidecarInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSidecarInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSidecarInstanceResponse setSidecarVersionInstances(java.util.List<SidecarVersionInstance> sidecarVersionInstances) {
        this.sidecarVersionInstances = sidecarVersionInstances;
        return this;
    }
    public java.util.List<SidecarVersionInstance> getSidecarVersionInstances() {
        return this.sidecarVersionInstances;
    }

    public ListSidecarInstanceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
