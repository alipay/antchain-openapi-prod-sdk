// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeleteElectrocarOtacontinuouspushrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 规则所属产品可信标识
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    // 待删除规则 ID
    @NameInMap("rule_id")
    @Validation(required = true)
    public Long ruleId;

    // 规则当前乐观锁版本
    @NameInMap("expected_lock_version")
    @Validation(required = true)
    public Long expectedLockVersion;

    public static DeleteElectrocarOtacontinuouspushrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteElectrocarOtacontinuouspushrulesRequest self = new DeleteElectrocarOtacontinuouspushrulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteElectrocarOtacontinuouspushrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteElectrocarOtacontinuouspushrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteElectrocarOtacontinuouspushrulesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteElectrocarOtacontinuouspushrulesRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public DeleteElectrocarOtacontinuouspushrulesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DeleteElectrocarOtacontinuouspushrulesRequest setExpectedLockVersion(Long expectedLockVersion) {
        this.expectedLockVersion = expectedLockVersion;
        return this;
    }
    public Long getExpectedLockVersion() {
        return this.expectedLockVersion;
    }

}
