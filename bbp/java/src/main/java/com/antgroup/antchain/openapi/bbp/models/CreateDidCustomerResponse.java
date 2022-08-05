// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class CreateDidCustomerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户生成的did	用户的did
    @NameInMap("did")
    public String did;

    // 用户昵称
    @NameInMap("nickname")
    public String nickname;

    public static CreateDidCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDidCustomerResponse self = new CreateDidCustomerResponse();
        return TeaModel.build(map, self);
    }

    public CreateDidCustomerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDidCustomerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDidCustomerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDidCustomerResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateDidCustomerResponse setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

}
