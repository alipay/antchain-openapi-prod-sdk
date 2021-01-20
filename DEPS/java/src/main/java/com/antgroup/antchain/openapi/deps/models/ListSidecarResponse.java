// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListSidecarResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar元信息结构体列表
    @NameInMap("sidecars")
    public java.util.List<Sidecar> sidecars;

    // 总记录条数
    @NameInMap("total_count")
    public Long totalCount;

    public static ListSidecarResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarResponse self = new ListSidecarResponse();
        return TeaModel.build(map, self);
    }

    public ListSidecarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSidecarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSidecarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSidecarResponse setSidecars(java.util.List<Sidecar> sidecars) {
        this.sidecars = sidecars;
        return this;
    }
    public java.util.List<Sidecar> getSidecars() {
        return this.sidecars;
    }

    public ListSidecarResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
