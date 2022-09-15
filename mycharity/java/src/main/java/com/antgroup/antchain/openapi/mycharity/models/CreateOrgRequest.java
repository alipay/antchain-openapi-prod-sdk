// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class CreateOrgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 50字符，单平台幂等
    @NameInMap("id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String id;

    // 50字符 机构名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String name;

    // 500字符 机构简介
    @NameInMap("introduction")
    @Validation(required = true, maxLength = 500, minLength = 1)
    public String introduction;

    // 社会统一信用代码18位
    @NameInMap("unified_social_credit_code")
    @Validation(required = true, maxLength = 18, minLength = 18)
    public String unifiedSocialCreditCode;

    // 测试机构说明:0正式机构(默认),1测试机构
    @NameInMap("test_flag")
    public Long testFlag;

    // 13位时间戳 签约时间
    @NameInMap("sign_time")
    @Validation(required = true)
    public Long signTime;

    public static CreateOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrgRequest self = new CreateOrgRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOrgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateOrgRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateOrgRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrgRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public CreateOrgRequest setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
        return this;
    }
    public String getUnifiedSocialCreditCode() {
        return this.unifiedSocialCreditCode;
    }

    public CreateOrgRequest setTestFlag(Long testFlag) {
        this.testFlag = testFlag;
        return this;
    }
    public Long getTestFlag() {
        return this.testFlag;
    }

    public CreateOrgRequest setSignTime(Long signTime) {
        this.signTime = signTime;
        return this;
    }
    public Long getSignTime() {
        return this.signTime;
    }

}
