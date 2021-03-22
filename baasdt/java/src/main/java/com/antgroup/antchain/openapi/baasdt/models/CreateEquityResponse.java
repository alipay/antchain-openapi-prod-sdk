// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateEquityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 请求ID，用于查询异步发布权益结果
    @NameInMap("create_equity_request_id")
    public String createEquityRequestId;

    public static CreateEquityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEquityResponse self = new CreateEquityResponse();
        return TeaModel.build(map, self);
    }

    public CreateEquityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateEquityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateEquityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateEquityResponse setCreateEquityRequestId(String createEquityRequestId) {
        this.createEquityRequestId = createEquityRequestId;
        return this;
    }
    public String getCreateEquityRequestId() {
        return this.createEquityRequestId;
    }

}
