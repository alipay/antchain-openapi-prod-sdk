// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Rule extends TeaModel {
    // ai_alarm_params
    @NameInMap("ai_alarm_params")
    @Validation(required = true)
    public AiAlarmParams aiAlarmParams;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // run_type
    @NameInMap("run_type")
    @Validation(required = true)
    public String runType;

    // cal_time_range
    @NameInMap("cal_time_range")
    @Validation(required = true)
    public TimeRange calTimeRange;

    // exclude_data_time_range
    @NameInMap("exclude_data_time_range")
    @Validation(required = true)
    public TimeRange excludeDataTimeRange;

    // dim_filters
    @NameInMap("dim_filters")
    @Validation(required = true)
    public java.util.List<DimFilter> dimFilters;

    // time_filter
    @NameInMap("time_filter")
    @Validation(required = true)
    public TimeFilter timeFilter;

    // triggers
    @NameInMap("triggers")
    @Validation(required = true)
    public java.util.List<Trigger> triggers;

    // andor
    @NameInMap("andor")
    @Validation(required = true)
    public String andor;

    // control_plan_auto
    @NameInMap("control_plan_auto")
    @Validation(required = true)
    public Boolean controlPlanAuto;

    // control_plans
    @NameInMap("control_plans")
    @Validation(required = true)
    public java.util.List<ControlPlan> controlPlans;

    // function_id
    @NameInMap("function_id")
    @Validation(required = true)
    public Long functionId;

    // from_tmp_rule
    @NameInMap("from_tmp_rule")
    @Validation(required = true)
    public Long fromTmpRule;

    // rule_type
    @NameInMap("rule_type")
    @Validation(required = true)
    public String ruleType;

    // ports
    @NameInMap("ports")
    @Validation(required = true)
    public java.util.List<String> ports;

    // group_by
    @NameInMap("group_by")
    @Validation(required = true)
    public java.util.List<String> groupBy;

    public static Rule build(java.util.Map<String, ?> map) throws Exception {
        Rule self = new Rule();
        return TeaModel.build(map, self);
    }

    public Rule setAiAlarmParams(AiAlarmParams aiAlarmParams) {
        this.aiAlarmParams = aiAlarmParams;
        return this;
    }
    public AiAlarmParams getAiAlarmParams() {
        return this.aiAlarmParams;
    }

    public Rule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Rule setRunType(String runType) {
        this.runType = runType;
        return this;
    }
    public String getRunType() {
        return this.runType;
    }

    public Rule setCalTimeRange(TimeRange calTimeRange) {
        this.calTimeRange = calTimeRange;
        return this;
    }
    public TimeRange getCalTimeRange() {
        return this.calTimeRange;
    }

    public Rule setExcludeDataTimeRange(TimeRange excludeDataTimeRange) {
        this.excludeDataTimeRange = excludeDataTimeRange;
        return this;
    }
    public TimeRange getExcludeDataTimeRange() {
        return this.excludeDataTimeRange;
    }

    public Rule setDimFilters(java.util.List<DimFilter> dimFilters) {
        this.dimFilters = dimFilters;
        return this;
    }
    public java.util.List<DimFilter> getDimFilters() {
        return this.dimFilters;
    }

    public Rule setTimeFilter(TimeFilter timeFilter) {
        this.timeFilter = timeFilter;
        return this;
    }
    public TimeFilter getTimeFilter() {
        return this.timeFilter;
    }

    public Rule setTriggers(java.util.List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<Trigger> getTriggers() {
        return this.triggers;
    }

    public Rule setAndor(String andor) {
        this.andor = andor;
        return this;
    }
    public String getAndor() {
        return this.andor;
    }

    public Rule setControlPlanAuto(Boolean controlPlanAuto) {
        this.controlPlanAuto = controlPlanAuto;
        return this;
    }
    public Boolean getControlPlanAuto() {
        return this.controlPlanAuto;
    }

    public Rule setControlPlans(java.util.List<ControlPlan> controlPlans) {
        this.controlPlans = controlPlans;
        return this;
    }
    public java.util.List<ControlPlan> getControlPlans() {
        return this.controlPlans;
    }

    public Rule setFunctionId(Long functionId) {
        this.functionId = functionId;
        return this;
    }
    public Long getFunctionId() {
        return this.functionId;
    }

    public Rule setFromTmpRule(Long fromTmpRule) {
        this.fromTmpRule = fromTmpRule;
        return this;
    }
    public Long getFromTmpRule() {
        return this.fromTmpRule;
    }

    public Rule setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public Rule setPorts(java.util.List<String> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<String> getPorts() {
        return this.ports;
    }

    public Rule setGroupBy(java.util.List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

}
