// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreatePlatformDepositCorpdidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业did
    @NameInMap("did")
    public String did;

    // 调用者金融科技id
    @NameInMap("isv_account")
    public String isvAccount;

    // 是否调用成功
    @NameInMap("status")
    public String status;

    public static CreatePlatformDepositCorpdidResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePlatformDepositCorpdidResponse self = new CreatePlatformDepositCorpdidResponse();
        return TeaModel.build(map, self);
    }

    public CreatePlatformDepositCorpdidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreatePlatformDepositCorpdidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreatePlatformDepositCorpdidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreatePlatformDepositCorpdidResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreatePlatformDepositCorpdidResponse setIsvAccount(String isvAccount) {
        this.isvAccount = isvAccount;
        return this;
    }
    public String getIsvAccount() {
        return this.isvAccount;
    }

    public CreatePlatformDepositCorpdidResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
