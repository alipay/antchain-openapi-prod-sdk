// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AuthUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // powers
    @NameInMap("powers")
    public java.util.List<LongListKeySet> powers;

    // bd_powers
    @NameInMap("bd_powers")
    public java.util.List<LongListKeySet> bdPowers;

    // w_powers
    @NameInMap("w_powers")
    public java.util.List<LongListKeySet> wPowers;

    // t_powers
    @NameInMap("t_powers")
    public java.util.List<LongListKeySet> tPowers;

    // super_admin
    @NameInMap("super_admin")
    public Boolean superAdmin;

    // super_view
    @NameInMap("super_view")
    public Boolean superView;

    // biz_domains
    @NameInMap("biz_domains")
    public java.util.List<BizDomain> bizDomains;

    // auth_url
    @NameInMap("auth_url")
    public String authUrl;

    public static AuthUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthUserResponse self = new AuthUserResponse();
        return TeaModel.build(map, self);
    }

    public AuthUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthUserResponse setPowers(java.util.List<LongListKeySet> powers) {
        this.powers = powers;
        return this;
    }
    public java.util.List<LongListKeySet> getPowers() {
        return this.powers;
    }

    public AuthUserResponse setBdPowers(java.util.List<LongListKeySet> bdPowers) {
        this.bdPowers = bdPowers;
        return this;
    }
    public java.util.List<LongListKeySet> getBdPowers() {
        return this.bdPowers;
    }

    public AuthUserResponse setWPowers(java.util.List<LongListKeySet> wPowers) {
        this.wPowers = wPowers;
        return this;
    }
    public java.util.List<LongListKeySet> getWPowers() {
        return this.wPowers;
    }

    public AuthUserResponse setTPowers(java.util.List<LongListKeySet> tPowers) {
        this.tPowers = tPowers;
        return this;
    }
    public java.util.List<LongListKeySet> getTPowers() {
        return this.tPowers;
    }

    public AuthUserResponse setSuperAdmin(Boolean superAdmin) {
        this.superAdmin = superAdmin;
        return this;
    }
    public Boolean getSuperAdmin() {
        return this.superAdmin;
    }

    public AuthUserResponse setSuperView(Boolean superView) {
        this.superView = superView;
        return this;
    }
    public Boolean getSuperView() {
        return this.superView;
    }

    public AuthUserResponse setBizDomains(java.util.List<BizDomain> bizDomains) {
        this.bizDomains = bizDomains;
        return this;
    }
    public java.util.List<BizDomain> getBizDomains() {
        return this.bizDomains;
    }

    public AuthUserResponse setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }
    public String getAuthUrl() {
        return this.authUrl;
    }

}
