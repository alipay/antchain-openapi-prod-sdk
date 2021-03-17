// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class GetRcpMgrResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 解抵押单明细
    @NameInMap("mg_release_order")
    public MgReleaseOrder mgReleaseOrder;

    public static GetRcpMgrResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRcpMgrResponse self = new GetRcpMgrResponse();
        return TeaModel.build(map, self);
    }

    public GetRcpMgrResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRcpMgrResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRcpMgrResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRcpMgrResponse setMgReleaseOrder(MgReleaseOrder mgReleaseOrder) {
        this.mgReleaseOrder = mgReleaseOrder;
        return this;
    }
    public MgReleaseOrder getMgReleaseOrder() {
        return this.mgReleaseOrder;
    }

}
