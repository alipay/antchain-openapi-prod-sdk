// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class InitOrgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true, maxLength = 50)
    public String id;

    // 机构名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 50)
    public String name;

    // 机构简介
    @NameInMap("introduction")
    @Validation(required = true, maxLength = 500)
    public String introduction;

    // 18位社会统一信用代码
    @NameInMap("unified_social_credit_code")
    @Validation(required = true, maxLength = 18, minLength = 18)
    public String unifiedSocialCreditCode;

    // 测试机构说明:0正式机构(默认),1测试机构
    @NameInMap("test_flag")
    @Validation(maxLength = 1, minLength = 1)
    public String testFlag;

    // 13位时间戳 签约时间
    @NameInMap("sign_time")
    @Validation(required = true, maxLength = 13, minLength = 13)
    public String signTime;

    public static InitOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        InitOrgRequest self = new InitOrgRequest();
        return TeaModel.build(map, self);
    }

    public InitOrgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitOrgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitOrgRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public InitOrgRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InitOrgRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public InitOrgRequest setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
        return this;
    }
    public String getUnifiedSocialCreditCode() {
        return this.unifiedSocialCreditCode;
    }

    public InitOrgRequest setTestFlag(String testFlag) {
        this.testFlag = testFlag;
        return this;
    }
    public String getTestFlag() {
        return this.testFlag;
    }

    public InitOrgRequest setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

}
