// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class OpsCheckResult extends TeaModel {
    // 应用名
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 实际实例数
    @NameInMap("actual_instance_num")
    @Validation(required = true)
    public Long actualInstanceNum;

    // 预期实例数
    @NameInMap("expect_instance_num")
    @Validation(required = true)
    public Long expectInstanceNum;

    // 应用监控指标健康数
    @NameInMap("app_healthy_num")
    @Validation(required = true)
    public Long appHealthyNum;

    // 	
    // 应用监控指标异常数
    @NameInMap("app_unhealthy_num")
    @Validation(required = true)
    public Long appUnhealthyNum;

    // 自定义监控指标健康数
    @NameInMap("custom_healthy_num")
    @Validation(required = true)
    public Long customHealthyNum;

    // 自定义监控指标异常数
    @NameInMap("custom_unhealthy_num")
    @Validation(required = true)
    public Long customUnhealthyNum;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 规则状态 0：已关闭 1：已开启
    @NameInMap("rule_status")
    @Validation(required = true)
    public Long ruleStatus;

    // rule_id
    @NameInMap("rule_id")
    public String ruleId;

    public static OpsCheckResult build(java.util.Map<String, ?> map) throws Exception {
        OpsCheckResult self = new OpsCheckResult();
        return TeaModel.build(map, self);
    }

    public OpsCheckResult setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public OpsCheckResult setActualInstanceNum(Long actualInstanceNum) {
        this.actualInstanceNum = actualInstanceNum;
        return this;
    }
    public Long getActualInstanceNum() {
        return this.actualInstanceNum;
    }

    public OpsCheckResult setExpectInstanceNum(Long expectInstanceNum) {
        this.expectInstanceNum = expectInstanceNum;
        return this;
    }
    public Long getExpectInstanceNum() {
        return this.expectInstanceNum;
    }

    public OpsCheckResult setAppHealthyNum(Long appHealthyNum) {
        this.appHealthyNum = appHealthyNum;
        return this;
    }
    public Long getAppHealthyNum() {
        return this.appHealthyNum;
    }

    public OpsCheckResult setAppUnhealthyNum(Long appUnhealthyNum) {
        this.appUnhealthyNum = appUnhealthyNum;
        return this;
    }
    public Long getAppUnhealthyNum() {
        return this.appUnhealthyNum;
    }

    public OpsCheckResult setCustomHealthyNum(Long customHealthyNum) {
        this.customHealthyNum = customHealthyNum;
        return this;
    }
    public Long getCustomHealthyNum() {
        return this.customHealthyNum;
    }

    public OpsCheckResult setCustomUnhealthyNum(Long customUnhealthyNum) {
        this.customUnhealthyNum = customUnhealthyNum;
        return this;
    }
    public Long getCustomUnhealthyNum() {
        return this.customUnhealthyNum;
    }

    public OpsCheckResult setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public OpsCheckResult setRuleStatus(Long ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public Long getRuleStatus() {
        return this.ruleStatus;
    }

    public OpsCheckResult setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
