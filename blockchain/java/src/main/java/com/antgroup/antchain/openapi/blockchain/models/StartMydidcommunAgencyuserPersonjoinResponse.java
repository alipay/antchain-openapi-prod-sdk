// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyuserPersonjoinResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 生成的did
    @NameInMap("did")
    public String did;

    // 生成的did doc
    @NameInMap("doc")
    public String doc;

    public static StartMydidcommunAgencyuserPersonjoinResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyuserPersonjoinResponse self = new StartMydidcommunAgencyuserPersonjoinResponse();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyuserPersonjoinResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartMydidcommunAgencyuserPersonjoinResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartMydidcommunAgencyuserPersonjoinResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartMydidcommunAgencyuserPersonjoinResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartMydidcommunAgencyuserPersonjoinResponse setDoc(String doc) {
        this.doc = doc;
        return this;
    }
    public String getDoc() {
        return this.doc;
    }

}
