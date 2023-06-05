// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailEcarEnterprisememberResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账户DID
    @NameInMap("account_did")
    public String accountDid;

    // 会员姓名，脱敏处理
    @NameInMap("name")
    public String name;

    // 会员手机号码，脱敏处理
    @NameInMap("mobile")
    public String mobile;

    // 注册时间
    @NameInMap("register_time")
    public String registerTime;

    public static DetailEcarEnterprisememberResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailEcarEnterprisememberResponse self = new DetailEcarEnterprisememberResponse();
        return TeaModel.build(map, self);
    }

    public DetailEcarEnterprisememberResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailEcarEnterprisememberResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailEcarEnterprisememberResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailEcarEnterprisememberResponse setAccountDid(String accountDid) {
        this.accountDid = accountDid;
        return this;
    }
    public String getAccountDid() {
        return this.accountDid;
    }

    public DetailEcarEnterprisememberResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailEcarEnterprisememberResponse setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public DetailEcarEnterprisememberResponse setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public String getRegisterTime() {
        return this.registerTime;
    }

}
