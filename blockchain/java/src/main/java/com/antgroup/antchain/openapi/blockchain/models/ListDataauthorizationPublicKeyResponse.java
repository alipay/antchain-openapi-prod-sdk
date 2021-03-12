// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationPublicKeyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 公钥列表
    @NameInMap("public_keys")
    public java.util.List<PublicKey> publicKeys;

    public static ListDataauthorizationPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationPublicKeyResponse self = new ListDataauthorizationPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationPublicKeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDataauthorizationPublicKeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDataauthorizationPublicKeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDataauthorizationPublicKeyResponse setPublicKeys(java.util.List<PublicKey> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }
    public java.util.List<PublicKey> getPublicKeys() {
        return this.publicKeys;
    }

}
