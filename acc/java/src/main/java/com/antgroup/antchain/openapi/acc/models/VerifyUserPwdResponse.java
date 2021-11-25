// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class VerifyUserPwdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回数据
    @NameInMap("data")
    public TokenData data;

    // 用户id返回值
    @NameInMap("user_id")
    public Long userId;

    // did
    @NameInMap("did")
    public String did;

    public static VerifyUserPwdResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyUserPwdResponse self = new VerifyUserPwdResponse();
        return TeaModel.build(map, self);
    }

    public VerifyUserPwdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyUserPwdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyUserPwdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyUserPwdResponse setData(TokenData data) {
        this.data = data;
        return this;
    }
    public TokenData getData() {
        return this.data;
    }

    public VerifyUserPwdResponse setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public VerifyUserPwdResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
