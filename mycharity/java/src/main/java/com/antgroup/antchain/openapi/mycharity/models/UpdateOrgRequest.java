// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class UpdateOrgRequest extends TeaModel {
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

    // 社会统一信用代码固定18位
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

    public static UpdateOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrgRequest self = new UpdateOrgRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOrgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateOrgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateOrgRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateOrgRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateOrgRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public UpdateOrgRequest setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
        return this;
    }
    public String getUnifiedSocialCreditCode() {
        return this.unifiedSocialCreditCode;
    }

    public UpdateOrgRequest setTestFlag(Long testFlag) {
        this.testFlag = testFlag;
        return this;
    }
    public Long getTestFlag() {
        return this.testFlag;
    }

    public UpdateOrgRequest setSignTime(Long signTime) {
        this.signTime = signTime;
        return this;
    }
    public Long getSignTime() {
        return this.signTime;
    }

}
