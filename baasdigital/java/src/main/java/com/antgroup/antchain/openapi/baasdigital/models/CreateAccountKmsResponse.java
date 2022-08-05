// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class CreateAccountKmsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账户公钥
    @NameInMap("pub_key")
    public String pubKey;

    // 托管秘钥ID
    @NameInMap("my_kms_id")
    public String myKmsId;

    public static CreateAccountKmsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountKmsResponse self = new CreateAccountKmsResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccountKmsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAccountKmsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAccountKmsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAccountKmsResponse setPubKey(String pubKey) {
        this.pubKey = pubKey;
        return this;
    }
    public String getPubKey() {
        return this.pubKey;
    }

    public CreateAccountKmsResponse setMyKmsId(String myKmsId) {
        this.myKmsId = myKmsId;
        return this;
    }
    public String getMyKmsId() {
        return this.myKmsId;
    }

}
