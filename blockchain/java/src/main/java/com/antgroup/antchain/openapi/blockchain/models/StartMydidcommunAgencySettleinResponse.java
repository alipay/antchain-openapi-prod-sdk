// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencySettleinResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 生成的did
    @NameInMap("did")
    public String did;

    // 生成的did doc
    @NameInMap("doc")
    public String doc;

    public static StartMydidcommunAgencySettleinResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencySettleinResponse self = new StartMydidcommunAgencySettleinResponse();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencySettleinResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartMydidcommunAgencySettleinResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartMydidcommunAgencySettleinResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartMydidcommunAgencySettleinResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartMydidcommunAgencySettleinResponse setDoc(String doc) {
        this.doc = doc;
        return this;
    }
    public String getDoc() {
        return this.doc;
    }

}
