// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateBclPayeeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 收款方的ID，后续进行商家进件和创建订单需要用到。
    @NameInMap("payee_id")
    public String payeeId;

    public static CreateBclPayeeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBclPayeeResponse self = new CreateBclPayeeResponse();
        return TeaModel.build(map, self);
    }

    public CreateBclPayeeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBclPayeeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBclPayeeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBclPayeeResponse setPayeeId(String payeeId) {
        this.payeeId = payeeId;
        return this;
    }
    public String getPayeeId() {
        return this.payeeId;
    }

}
