// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class OrgVO extends TeaModel {
    // 机构ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 机构名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 统一社会信用代码
    @NameInMap("unified_social_credit_code")
    @Validation(required = true)
    public String unifiedSocialCreditCode;

    // 机构简介
    @NameInMap("introduction")
    @Validation(required = true)
    public String introduction;

    // 签约时间
    @NameInMap("sign_time")
    @Validation(required = true)
    public Long signTime;

    //  测试项目:0正式机构(默认),1测试机构
    @NameInMap("test_flag")
    public Long testFlag;

    public static OrgVO build(java.util.Map<String, ?> map) throws Exception {
        OrgVO self = new OrgVO();
        return TeaModel.build(map, self);
    }

    public OrgVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OrgVO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public OrgVO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public OrgVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OrgVO setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
        return this;
    }
    public String getUnifiedSocialCreditCode() {
        return this.unifiedSocialCreditCode;
    }

    public OrgVO setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public OrgVO setSignTime(Long signTime) {
        this.signTime = signTime;
        return this;
    }
    public Long getSignTime() {
        return this.signTime;
    }

    public OrgVO setTestFlag(Long testFlag) {
        this.testFlag = testFlag;
        return this;
    }
    public Long getTestFlag() {
        return this.testFlag;
    }

}
