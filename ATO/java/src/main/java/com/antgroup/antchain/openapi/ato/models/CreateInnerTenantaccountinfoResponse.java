// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerTenantaccountinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 登录账号
    @NameInMap("login_name")
    public String loginName;

    public static CreateInnerTenantaccountinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerTenantaccountinfoResponse self = new CreateInnerTenantaccountinfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateInnerTenantaccountinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateInnerTenantaccountinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateInnerTenantaccountinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateInnerTenantaccountinfoResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerTenantaccountinfoResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
