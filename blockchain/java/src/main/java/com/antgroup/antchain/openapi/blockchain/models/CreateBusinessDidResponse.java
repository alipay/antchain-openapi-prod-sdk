// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessDidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 链的业务编号
    @NameInMap("biz_id")
    public String bizId;

    // 生成的did用户身份号
    @NameInMap("did")
    public String did;

    // isv创建者身份
    @NameInMap("isv_account")
    public String isvAccount;

    // 是否创建成功
    @NameInMap("status")
    public String status;

    public static CreateBusinessDidResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessDidResponse self = new CreateBusinessDidResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessDidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBusinessDidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBusinessDidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBusinessDidResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBusinessDidResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBusinessDidResponse setIsvAccount(String isvAccount) {
        this.isvAccount = isvAccount;
        return this;
    }
    public String getIsvAccount() {
        return this.isvAccount;
    }

    public CreateBusinessDidResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
