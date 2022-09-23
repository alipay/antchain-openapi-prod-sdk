// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class StartMypocketAppdidsignverifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签名是否合法
    @NameInMap("is_valid")
    public Boolean isValid;

    public static StartMypocketAppdidsignverifyResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMypocketAppdidsignverifyResponse self = new StartMypocketAppdidsignverifyResponse();
        return TeaModel.build(map, self);
    }

    public StartMypocketAppdidsignverifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartMypocketAppdidsignverifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartMypocketAppdidsignverifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartMypocketAppdidsignverifyResponse setIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }
    public Boolean getIsValid() {
        return this.isValid;
    }

}
