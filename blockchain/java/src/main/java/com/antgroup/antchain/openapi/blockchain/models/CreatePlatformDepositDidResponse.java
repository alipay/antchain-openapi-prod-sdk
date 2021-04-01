// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreatePlatformDepositDidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户did
    @NameInMap("did")
    public String did;

    // 租户金融科技id
    @NameInMap("isv_account")
    public String isvAccount;

    // 是否创建成果
    @NameInMap("status")
    public String status;

    public static CreatePlatformDepositDidResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePlatformDepositDidResponse self = new CreatePlatformDepositDidResponse();
        return TeaModel.build(map, self);
    }

    public CreatePlatformDepositDidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreatePlatformDepositDidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreatePlatformDepositDidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreatePlatformDepositDidResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreatePlatformDepositDidResponse setIsvAccount(String isvAccount) {
        this.isvAccount = isvAccount;
        return this;
    }
    public String getIsvAccount() {
        return this.isvAccount;
    }

    public CreatePlatformDepositDidResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
