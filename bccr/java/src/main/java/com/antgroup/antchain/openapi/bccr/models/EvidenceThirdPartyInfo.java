// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class EvidenceThirdPartyInfo extends TeaModel {
    // 三方系统用户提交网址时间
    @NameInMap("submit_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String submitTime;

    // 三方系统地址
    @NameInMap("system_url")
    @Validation(required = true)
    public String systemUrl;

    // 三方系统账号
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 三方系统名称
    @NameInMap("system_name")
    @Validation(required = true)
    public String systemName;

    // 用户取证时登录的时间
    @NameInMap("login_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String loginTime;

    // 用户取证时登录的IP
    @NameInMap("login_ip")
    @Validation(required = true)
    public String loginIp;

    public static EvidenceThirdPartyInfo build(java.util.Map<String, ?> map) throws Exception {
        EvidenceThirdPartyInfo self = new EvidenceThirdPartyInfo();
        return TeaModel.build(map, self);
    }

    public EvidenceThirdPartyInfo setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public EvidenceThirdPartyInfo setSystemUrl(String systemUrl) {
        this.systemUrl = systemUrl;
        return this;
    }
    public String getSystemUrl() {
        return this.systemUrl;
    }

    public EvidenceThirdPartyInfo setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public EvidenceThirdPartyInfo setSystemName(String systemName) {
        this.systemName = systemName;
        return this;
    }
    public String getSystemName() {
        return this.systemName;
    }

    public EvidenceThirdPartyInfo setLoginTime(String loginTime) {
        this.loginTime = loginTime;
        return this;
    }
    public String getLoginTime() {
        return this.loginTime;
    }

    public EvidenceThirdPartyInfo setLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }
    public String getLoginIp() {
        return this.loginIp;
    }

}
