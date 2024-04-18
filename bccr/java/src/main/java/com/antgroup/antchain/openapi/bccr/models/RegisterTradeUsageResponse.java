// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class RegisterTradeUsageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 登记Id
    @NameInMap("register_id")
    public String registerId;

    // 登记状态
    @NameInMap("status")
    public String status;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    public static RegisterTradeUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterTradeUsageResponse self = new RegisterTradeUsageResponse();
        return TeaModel.build(map, self);
    }

    public RegisterTradeUsageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterTradeUsageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterTradeUsageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterTradeUsageResponse setRegisterId(String registerId) {
        this.registerId = registerId;
        return this;
    }
    public String getRegisterId() {
        return this.registerId;
    }

    public RegisterTradeUsageResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RegisterTradeUsageResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
