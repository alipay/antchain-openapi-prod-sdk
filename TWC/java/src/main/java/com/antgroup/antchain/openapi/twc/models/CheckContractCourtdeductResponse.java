// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckContractCourtdeductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否预校验成功
    @NameInMap("success")
    public Boolean success;

    // 预校验详细信息
    @NameInMap("check_msg")
    public String checkMsg;

    public static CheckContractCourtdeductResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckContractCourtdeductResponse self = new CheckContractCourtdeductResponse();
        return TeaModel.build(map, self);
    }

    public CheckContractCourtdeductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckContractCourtdeductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckContractCourtdeductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckContractCourtdeductResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckContractCourtdeductResponse setCheckMsg(String checkMsg) {
        this.checkMsg = checkMsg;
        return this;
    }
    public String getCheckMsg() {
        return this.checkMsg;
    }

}
