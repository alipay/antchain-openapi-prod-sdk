// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessBizaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // did地址
    @NameInMap("did")
    public String did;

    // 租户账户
    @NameInMap("isv_account")
    public String isvAccount;

    // 生成的账户在kms上的密钥id    
    // 
    @NameInMap("kms_id")
    public String kmsId;

    // 调用接口是否成功
    @NameInMap("status")
    public String status;

    public static CreateBusinessBizaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessBizaccountResponse self = new CreateBusinessBizaccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessBizaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBusinessBizaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBusinessBizaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBusinessBizaccountResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBusinessBizaccountResponse setIsvAccount(String isvAccount) {
        this.isvAccount = isvAccount;
        return this;
    }
    public String getIsvAccount() {
        return this.isvAccount;
    }

    public CreateBusinessBizaccountResponse setKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }
    public String getKmsId() {
        return this.kmsId;
    }

    public CreateBusinessBizaccountResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
