// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetIaasaccountBaseinfoResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 账号名称
    @NameInMap("account")
    public String account;

    // 账号ID
    @NameInMap("id")
    public String id;

    // iaas账号类型
    // ALIYUN_BID: 阿里云BID类型
    // ALIYUN_BID_MIG: 原本是阿里云BID类型，迁移后可两侧登录
    // ALIYUN_MPK: 阿里云MPK类型
    // ALIYUN_LOCALIZATION: 阿里云一方化类型
    @NameInMap("source_type")
    public String sourceType;

    public static GetIaasaccountBaseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIaasaccountBaseinfoResponse self = new GetIaasaccountBaseinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetIaasaccountBaseinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetIaasaccountBaseinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetIaasaccountBaseinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetIaasaccountBaseinfoResponse setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public GetIaasaccountBaseinfoResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetIaasaccountBaseinfoResponse setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
