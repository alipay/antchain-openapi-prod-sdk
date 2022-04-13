// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DrmOpsRecord extends TeaModel {
    // 应用
    @NameInMap("apps")
    public java.util.List<String> apps;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 推送时间
    @NameInMap("push_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String pushTime;

    // 推送结果，包括（SUCCESS，FAILED，INVALID_REQUEST，NO_RECORD，SYSTEM_EXCEPTION，PARAM_QUERY_ERROR，PARAM_INVALID）
    @NameInMap("result_code")
    @Validation(required = true)
    public String resultCode;

    // 结果信息
    @NameInMap("result_msg")
    public String resultMsg;

    // 推送目标
    @NameInMap("targets")
    public java.util.List<String> targets;

    // 推送值
    @NameInMap("value")
    public String value;

    // 规则类型
    @NameInMap("rule_type")
    @Validation(required = true)
    public String ruleType;

    public static DrmOpsRecord build(java.util.Map<String, ?> map) throws Exception {
        DrmOpsRecord self = new DrmOpsRecord();
        return TeaModel.build(map, self);
    }

    public DrmOpsRecord setApps(java.util.List<String> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<String> getApps() {
        return this.apps;
    }

    public DrmOpsRecord setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DrmOpsRecord setPushTime(String pushTime) {
        this.pushTime = pushTime;
        return this;
    }
    public String getPushTime() {
        return this.pushTime;
    }

    public DrmOpsRecord setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DrmOpsRecord setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DrmOpsRecord setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public DrmOpsRecord setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DrmOpsRecord setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
