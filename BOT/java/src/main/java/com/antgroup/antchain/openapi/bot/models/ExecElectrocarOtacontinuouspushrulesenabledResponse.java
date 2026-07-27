// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecElectrocarOtacontinuouspushrulesenabledResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 策略所属产品可信标识
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // 产品策略主键，以字符串返回，避免前端整数精度丢失
    @NameInMap("policy_id")
    public String policyId;

    // 产品下规则集合版本，以字符串返回；任一规则变更时递增并用于运行快照失效。
    @NameInMap("rules_version")
    public String rulesVersion;

    // 产品全局白名单版本，以字符串返回，白名单变更时递增。
    @NameInMap("whitelist_version")
    public String whitelistVersion;

    // 当前有效白名单成员数量，以字符串返回。
    @NameInMap("whitelist_count")
    public String whitelistCount;

    // 当前产品配置是否允许整体删除；服务端执行删除时仍会重新校验。
    @NameInMap("deletable")
    public Boolean deletable;

    // 当前产品配置不可删除的稳定原因编码集合。
    @NameInMap("delete_blocked_reasons")
    public java.util.List<String> deleteBlockedReasons;

    // 产品当前生效的连续推送规则集合
    @NameInMap("rules")
    public java.util.List<ContinuousOtaRuleResponse> rules;

    public static ExecElectrocarOtacontinuouspushrulesenabledResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecElectrocarOtacontinuouspushrulesenabledResponse self = new ExecElectrocarOtacontinuouspushrulesenabledResponse();
        return TeaModel.build(map, self);
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setRulesVersion(String rulesVersion) {
        this.rulesVersion = rulesVersion;
        return this;
    }
    public String getRulesVersion() {
        return this.rulesVersion;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setWhitelistVersion(String whitelistVersion) {
        this.whitelistVersion = whitelistVersion;
        return this;
    }
    public String getWhitelistVersion() {
        return this.whitelistVersion;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setWhitelistCount(String whitelistCount) {
        this.whitelistCount = whitelistCount;
        return this;
    }
    public String getWhitelistCount() {
        return this.whitelistCount;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }
    public Boolean getDeletable() {
        return this.deletable;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setDeleteBlockedReasons(java.util.List<String> deleteBlockedReasons) {
        this.deleteBlockedReasons = deleteBlockedReasons;
        return this;
    }
    public java.util.List<String> getDeleteBlockedReasons() {
        return this.deleteBlockedReasons;
    }

    public ExecElectrocarOtacontinuouspushrulesenabledResponse setRules(java.util.List<ContinuousOtaRuleResponse> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ContinuousOtaRuleResponse> getRules() {
        return this.rules;
    }

}
