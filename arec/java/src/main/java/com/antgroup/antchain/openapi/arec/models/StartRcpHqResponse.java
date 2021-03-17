// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class StartRcpHqResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 房产链房产查询单号
    @NameInMap("hq_order_no")
    public String hqOrderNo;

    public static StartRcpHqResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRcpHqResponse self = new StartRcpHqResponse();
        return TeaModel.build(map, self);
    }

    public StartRcpHqResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartRcpHqResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartRcpHqResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartRcpHqResponse setHqOrderNo(String hqOrderNo) {
        this.hqOrderNo = hqOrderNo;
        return this;
    }
    public String getHqOrderNo() {
        return this.hqOrderNo;
    }

}
