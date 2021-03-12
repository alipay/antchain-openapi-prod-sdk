// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthUserinfoDidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 返回给指定用户创建的did结果，如果入参对应的did之前已经存在，则不会新建did，直接返回已有did。
    @NameInMap("result")
    public String result;

    public static CreateAuthUserinfoDidResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthUserinfoDidResponse self = new CreateAuthUserinfoDidResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthUserinfoDidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAuthUserinfoDidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAuthUserinfoDidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAuthUserinfoDidResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
