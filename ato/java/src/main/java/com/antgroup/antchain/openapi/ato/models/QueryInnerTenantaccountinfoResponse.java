// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerTenantaccountinfoResponse extends TeaModel {
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

    // 绑定手机号
    @NameInMap("bind_mobile")
    public String bindMobile;

    // 登录账号
    @NameInMap("login_name")
    public String loginName;

    // 注册时间
    @NameInMap("create_time")
    public String createTime;

    // 是否已实名认证
    @NameInMap("is_certified")
    public Boolean isCertified;

    public static QueryInnerTenantaccountinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerTenantaccountinfoResponse self = new QueryInnerTenantaccountinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerTenantaccountinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerTenantaccountinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerTenantaccountinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerTenantaccountinfoResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerTenantaccountinfoResponse setBindMobile(String bindMobile) {
        this.bindMobile = bindMobile;
        return this;
    }
    public String getBindMobile() {
        return this.bindMobile;
    }

    public QueryInnerTenantaccountinfoResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public QueryInnerTenantaccountinfoResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryInnerTenantaccountinfoResponse setIsCertified(Boolean isCertified) {
        this.isCertified = isCertified;
        return this;
    }
    public Boolean getIsCertified() {
        return this.isCertified;
    }

}
