// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateObjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 交易哈希，物的链上身份
    @NameInMap("object_hash")
    public String objectHash;

    public static CreateObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateObjectResponse self = new CreateObjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateObjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateObjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateObjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateObjectResponse setObjectHash(String objectHash) {
        this.objectHash = objectHash;
        return this;
    }
    public String getObjectHash() {
        return this.objectHash;
    }

}
