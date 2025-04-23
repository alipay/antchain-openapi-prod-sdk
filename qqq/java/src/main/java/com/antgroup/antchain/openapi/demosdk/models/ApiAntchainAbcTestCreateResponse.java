// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class ApiAntchainAbcTestCreateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求返回描述
    @NameInMap("status")
    public String status;

    // msg
    @NameInMap("msg")
    public String msg;

    public static ApiAntchainAbcTestCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApiAntchainAbcTestCreateResponse self = new ApiAntchainAbcTestCreateResponse();
        return TeaModel.build(map, self);
    }

    public ApiAntchainAbcTestCreateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApiAntchainAbcTestCreateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApiAntchainAbcTestCreateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApiAntchainAbcTestCreateResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApiAntchainAbcTestCreateResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
