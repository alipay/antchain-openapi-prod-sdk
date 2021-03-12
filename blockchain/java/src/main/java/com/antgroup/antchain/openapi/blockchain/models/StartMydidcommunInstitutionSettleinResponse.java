// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunInstitutionSettleinResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 机构入驻后，会为其分配唯一的区块链数字身份，这里是数字身份的ID，后续接口都需要用这个id作为参数
    @NameInMap("did")
    public String did;

    // 是对数字身份did的描述，主要包括通讯公钥，和恢复公钥，以及会调url
    @NameInMap("doc")
    public String doc;

    public static StartMydidcommunInstitutionSettleinResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunInstitutionSettleinResponse self = new StartMydidcommunInstitutionSettleinResponse();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunInstitutionSettleinResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartMydidcommunInstitutionSettleinResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartMydidcommunInstitutionSettleinResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartMydidcommunInstitutionSettleinResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartMydidcommunInstitutionSettleinResponse setDoc(String doc) {
        this.doc = doc;
        return this;
    }
    public String getDoc() {
        return this.doc;
    }

}
