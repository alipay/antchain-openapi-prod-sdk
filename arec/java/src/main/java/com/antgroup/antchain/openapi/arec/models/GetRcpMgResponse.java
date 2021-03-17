// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class GetRcpMgResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 抵押单
    @NameInMap("mg_order")
    public MgOrder mgOrder;

    public static GetRcpMgResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRcpMgResponse self = new GetRcpMgResponse();
        return TeaModel.build(map, self);
    }

    public GetRcpMgResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRcpMgResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRcpMgResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRcpMgResponse setMgOrder(MgOrder mgOrder) {
        this.mgOrder = mgOrder;
        return this;
    }
    public MgOrder getMgOrder() {
        return this.mgOrder;
    }

}
