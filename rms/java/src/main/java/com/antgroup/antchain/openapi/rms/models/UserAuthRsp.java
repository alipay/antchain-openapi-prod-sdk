// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UserAuthRsp extends TeaModel {
    // powers
    @NameInMap("powers")
    @Validation(required = true)
    public java.util.List<LongListKeySet> powers;

    // bd_powers
    @NameInMap("bd_powers")
    @Validation(required = true)
    public java.util.List<LongListKeySet> bdPowers;

    // w_powers
    @NameInMap("w_powers")
    @Validation(required = true)
    public java.util.List<LongListKeySet> wPowers;

    // t_powers
    @NameInMap("t_powers")
    @Validation(required = true)
    public java.util.List<LongListKeySet> tPowers;

    // super_admin
    @NameInMap("super_admin")
    @Validation(required = true)
    public Boolean superAdmin;

    // super_view
    @NameInMap("super_view")
    @Validation(required = true)
    public Boolean superView;

    // biz_domains
    @NameInMap("biz_domains")
    @Validation(required = true)
    public java.util.List<BizDomain> bizDomains;

    // auth_url
    @NameInMap("auth_url")
    @Validation(required = true)
    public String authUrl;

    public static UserAuthRsp build(java.util.Map<String, ?> map) throws Exception {
        UserAuthRsp self = new UserAuthRsp();
        return TeaModel.build(map, self);
    }

    public UserAuthRsp setPowers(java.util.List<LongListKeySet> powers) {
        this.powers = powers;
        return this;
    }
    public java.util.List<LongListKeySet> getPowers() {
        return this.powers;
    }

    public UserAuthRsp setBdPowers(java.util.List<LongListKeySet> bdPowers) {
        this.bdPowers = bdPowers;
        return this;
    }
    public java.util.List<LongListKeySet> getBdPowers() {
        return this.bdPowers;
    }

    public UserAuthRsp setWPowers(java.util.List<LongListKeySet> wPowers) {
        this.wPowers = wPowers;
        return this;
    }
    public java.util.List<LongListKeySet> getWPowers() {
        return this.wPowers;
    }

    public UserAuthRsp setTPowers(java.util.List<LongListKeySet> tPowers) {
        this.tPowers = tPowers;
        return this;
    }
    public java.util.List<LongListKeySet> getTPowers() {
        return this.tPowers;
    }

    public UserAuthRsp setSuperAdmin(Boolean superAdmin) {
        this.superAdmin = superAdmin;
        return this;
    }
    public Boolean getSuperAdmin() {
        return this.superAdmin;
    }

    public UserAuthRsp setSuperView(Boolean superView) {
        this.superView = superView;
        return this;
    }
    public Boolean getSuperView() {
        return this.superView;
    }

    public UserAuthRsp setBizDomains(java.util.List<BizDomain> bizDomains) {
        this.bizDomains = bizDomains;
        return this;
    }
    public java.util.List<BizDomain> getBizDomains() {
        return this.bizDomains;
    }

    public UserAuthRsp setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }
    public String getAuthUrl() {
        return this.authUrl;
    }

}
