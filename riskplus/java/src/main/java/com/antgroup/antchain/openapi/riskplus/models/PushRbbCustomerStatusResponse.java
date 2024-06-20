// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushRbbCustomerStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果说明
    @NameInMap("res_msg")
    public String resMsg;

    // 返回代码
    @NameInMap("res_code")
    public String resCode;

    public static PushRbbCustomerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        PushRbbCustomerStatusResponse self = new PushRbbCustomerStatusResponse();
        return TeaModel.build(map, self);
    }

    public PushRbbCustomerStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushRbbCustomerStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushRbbCustomerStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushRbbCustomerStatusResponse setResMsg(String resMsg) {
        this.resMsg = resMsg;
        return this;
    }
    public String getResMsg() {
        return this.resMsg;
    }

    public PushRbbCustomerStatusResponse setResCode(String resCode) {
        this.resCode = resCode;
        return this;
    }
    public String getResCode() {
        return this.resCode;
    }

}
