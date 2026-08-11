// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ContinuousOtaPolicyResponse extends TeaModel {
    // 策略所属租户 ID
    /**
     * <strong>example:</strong>
     * <p>策略所属租户 ID</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 策略所属产品可信标识
    /**
     * <strong>example:</strong>
     * <p>策略所属产品可信标识</p>
     */
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // 产品策略主键
    /**
     * <strong>example:</strong>
     * <p>产品策略主键</p>
     */
    @NameInMap("policy_id")
    public String policyId;

    // 产品下规则集合版本
    /**
     * <strong>example:</strong>
     * <p>产品下规则集合版本</p>
     */
    @NameInMap("rules_version")
    public String rulesVersion;

    // 产品全局白名单版本
    /**
     * <strong>example:</strong>
     * <p>产品全局白名单版本</p>
     */
    @NameInMap("whitelist_version")
    public String whitelistVersion;

    // 当前有效白名单成员数量
    /**
     * <strong>example:</strong>
     * <p>当前有效白名单成员数量</p>
     */
    @NameInMap("whitelist_count")
    public String whitelistCount;

    // 当前产品配置是否允许整体删除
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletable")
    public Boolean deletable;

    // 当前产品配置不可删除的稳定原因编码集合
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("delete_blocked_reasons")
    public java.util.List<String> deleteBlockedReasons;

    // 产品当前生效的连续推送规则集合
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("rules")
    public java.util.List<ContinuousOtaRuleResponse> rules;

    public static ContinuousOtaPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinuousOtaPolicyResponse self = new ContinuousOtaPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ContinuousOtaPolicyResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ContinuousOtaPolicyResponse setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public ContinuousOtaPolicyResponse setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ContinuousOtaPolicyResponse setRulesVersion(String rulesVersion) {
        this.rulesVersion = rulesVersion;
        return this;
    }
    public String getRulesVersion() {
        return this.rulesVersion;
    }

    public ContinuousOtaPolicyResponse setWhitelistVersion(String whitelistVersion) {
        this.whitelistVersion = whitelistVersion;
        return this;
    }
    public String getWhitelistVersion() {
        return this.whitelistVersion;
    }

    public ContinuousOtaPolicyResponse setWhitelistCount(String whitelistCount) {
        this.whitelistCount = whitelistCount;
        return this;
    }
    public String getWhitelistCount() {
        return this.whitelistCount;
    }

    public ContinuousOtaPolicyResponse setDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }
    public Boolean getDeletable() {
        return this.deletable;
    }

    public ContinuousOtaPolicyResponse setDeleteBlockedReasons(java.util.List<String> deleteBlockedReasons) {
        this.deleteBlockedReasons = deleteBlockedReasons;
        return this;
    }
    public java.util.List<String> getDeleteBlockedReasons() {
        return this.deleteBlockedReasons;
    }

    public ContinuousOtaPolicyResponse setRules(java.util.List<ContinuousOtaRuleResponse> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ContinuousOtaRuleResponse> getRules() {
        return this.rules;
    }

}
