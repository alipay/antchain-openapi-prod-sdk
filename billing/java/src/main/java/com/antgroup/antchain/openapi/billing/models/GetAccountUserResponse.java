// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class GetAccountUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 智能科技user_id
    @NameInMap("tenant_id")
    public String tenantId;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 用户的真实姓名
    @NameInMap("real_name")
    public String realName;

    // 手机号
    @NameInMap("mobile_num")
    public String mobileNum;

    // 公司名称
    @NameInMap("firm_name")
    public String firmName;

    // 帐号类型，企业或者是个人
    //  ENTERPRISE("1","企业类型账号"),
    //  INDIVIDUAL("2","个人类型账号")
    @NameInMap("user_type")
    public String userType;

    public static GetAccountUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountUserResponse self = new GetAccountUserResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAccountUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAccountUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAccountUserResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetAccountUserResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetAccountUserResponse setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public GetAccountUserResponse setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
        return this;
    }
    public String getMobileNum() {
        return this.mobileNum;
    }

    public GetAccountUserResponse setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public GetAccountUserResponse setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
