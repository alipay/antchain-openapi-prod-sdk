// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitDidCorporateDirectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // did
    @NameInMap("did")
    public String did;

    // did doc content
    @NameInMap("doc")
    public String doc;

    // 后续did doc上链需要使用私钥对这个hash值进行签名
    @NameInMap("hash")
    public String hash;

    public static InitDidCorporateDirectResponse build(java.util.Map<String, ?> map) throws Exception {
        InitDidCorporateDirectResponse self = new InitDidCorporateDirectResponse();
        return TeaModel.build(map, self);
    }

    public InitDidCorporateDirectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitDidCorporateDirectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitDidCorporateDirectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitDidCorporateDirectResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public InitDidCorporateDirectResponse setDoc(String doc) {
        this.doc = doc;
        return this;
    }
    public String getDoc() {
        return this.doc;
    }

    public InitDidCorporateDirectResponse setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
