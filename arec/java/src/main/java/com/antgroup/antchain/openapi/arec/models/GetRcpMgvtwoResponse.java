// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class GetRcpMgvtwoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 抵押单明细
    @NameInMap("mg_order")
    public MgOrder mgOrder;

    public static GetRcpMgvtwoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRcpMgvtwoResponse self = new GetRcpMgvtwoResponse();
        return TeaModel.build(map, self);
    }

    public GetRcpMgvtwoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRcpMgvtwoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRcpMgvtwoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRcpMgvtwoResponse setMgOrder(MgOrder mgOrder) {
        this.mgOrder = mgOrder;
        return this;
    }
    public MgOrder getMgOrder() {
        return this.mgOrder;
    }

}
