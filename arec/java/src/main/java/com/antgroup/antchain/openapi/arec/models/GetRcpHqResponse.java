// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class GetRcpHqResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 房产查询单明细
    @NameInMap("hq_order")
    public HqOrder hqOrder;

    public static GetRcpHqResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRcpHqResponse self = new GetRcpHqResponse();
        return TeaModel.build(map, self);
    }

    public GetRcpHqResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRcpHqResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRcpHqResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRcpHqResponse setHqOrder(HqOrder hqOrder) {
        this.hqOrder = hqOrder;
        return this;
    }
    public HqOrder getHqOrder() {
        return this.hqOrder;
    }

}
