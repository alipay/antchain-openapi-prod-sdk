// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecElectrocarOtacontinuouspushrulesenabledRequest extends TeaModel {
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

    // 待启停规则 ID
    @NameInMap("rule_id")
    @Validation(required = true)
    public Long ruleId;

    // 规则目标启用状态
    @NameInMap("enabled")
    @Validation(required = true)
    public Boolean enabled;

    // 规则当前乐观锁版本
    @NameInMap("expected_lock_version")
    @Validation(required = true)
    public Long expectedLockVersion;

    public static ExecElectrocarOtacontinuouspushrulesenabledRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecElectrocarOtacontinuouspushrulesenabledRequest self = new ExecElectrocarOtacontinuouspushrulesenabledRequest();
        return TeaModel.build(map, self);
    }

    public ExecElectrocarOtacontinuouspushrulesenabledRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledRequest setExpectedLockVersion(Long expectedLockVersion) {
        this.expectedLockVersion = expectedLockVersion;
        return this;
    }
    public Long getExpectedLockVersion() {
        return this.expectedLockVersion;
    }

}
