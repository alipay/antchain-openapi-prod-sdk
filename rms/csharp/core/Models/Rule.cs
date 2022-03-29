// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Rule
    public class Rule : TeaModel {
        // ai_alarm_params
        [NameInMap("ai_alarm_params")]
        [Validation(Required=true)]
        public AiAlarmParams AiAlarmParams { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // run_type
        [NameInMap("run_type")]
        [Validation(Required=true)]
        public string RunType { get; set; }

        // cal_time_range
        [NameInMap("cal_time_range")]
        [Validation(Required=true)]
        public TimeRange CalTimeRange { get; set; }

        // exclude_data_time_range
        [NameInMap("exclude_data_time_range")]
        [Validation(Required=true)]
        public TimeRange ExcludeDataTimeRange { get; set; }

        // dim_filters
        [NameInMap("dim_filters")]
        [Validation(Required=true)]
        public List<DimFilter> DimFilters { get; set; }

        // time_filter
        [NameInMap("time_filter")]
        [Validation(Required=true)]
        public TimeFilter TimeFilter { get; set; }

        // triggers
        [NameInMap("triggers")]
        [Validation(Required=true)]
        public List<Trigger> Triggers { get; set; }

        // andor
        [NameInMap("andor")]
        [Validation(Required=true)]
        public string Andor { get; set; }

        // control_plan_auto
        [NameInMap("control_plan_auto")]
        [Validation(Required=true)]
        public bool? ControlPlanAuto { get; set; }

        // control_plans
        [NameInMap("control_plans")]
        [Validation(Required=true)]
        public List<ControlPlan> ControlPlans { get; set; }

        // function_id
        [NameInMap("function_id")]
        [Validation(Required=true)]
        public long? FunctionId { get; set; }

        // from_tmp_rule
        [NameInMap("from_tmp_rule")]
        [Validation(Required=true)]
        public long? FromTmpRule { get; set; }

        // rule_type
        [NameInMap("rule_type")]
        [Validation(Required=true)]
        public string RuleType { get; set; }

        // ports
        [NameInMap("ports")]
        [Validation(Required=true)]
        public List<string> Ports { get; set; }

        // group_by
        [NameInMap("group_by")]
        [Validation(Required=true)]
        public List<string> GroupBy { get; set; }

    }

}
