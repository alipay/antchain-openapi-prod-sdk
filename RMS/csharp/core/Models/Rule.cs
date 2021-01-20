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
        [Validation(Required=false)]
        public AiAlarmParams AiAlarmParams { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // run_type
        [NameInMap("run_type")]
        [Validation(Required=false)]
        public string RunType { get; set; }

        // cal_time_range
        [NameInMap("cal_time_range")]
        [Validation(Required=false)]
        public TimeRange CalTimeRange { get; set; }

        // exclude_data_time_range
        [NameInMap("exclude_data_time_range")]
        [Validation(Required=false)]
        public TimeRange ExcludeDataTimeRange { get; set; }

        // dim_filters
        [NameInMap("dim_filters")]
        [Validation(Required=false)]
        public List<DimFilter> DimFilters { get; set; }

        // time_filter
        [NameInMap("time_filter")]
        [Validation(Required=false)]
        public TimeFilter TimeFilter { get; set; }

        // triggers
        [NameInMap("triggers")]
        [Validation(Required=false)]
        public List<Trigger> Triggers { get; set; }

        // andor
        [NameInMap("andor")]
        [Validation(Required=false)]
        public string Andor { get; set; }

        // control_plan_auto
        [NameInMap("control_plan_auto")]
        [Validation(Required=false)]
        public bool? ControlPlanAuto { get; set; }

        // control_plans
        [NameInMap("control_plans")]
        [Validation(Required=false)]
        public List<ControlPlan> ControlPlans { get; set; }

        // function_id
        [NameInMap("function_id")]
        [Validation(Required=false)]
        public long? FunctionId { get; set; }

        // from_tmp_rule
        [NameInMap("from_tmp_rule")]
        [Validation(Required=false)]
        public long? FromTmpRule { get; set; }

        // rule_type
        [NameInMap("rule_type")]
        [Validation(Required=false)]
        public string RuleType { get; set; }

        // ports
        [NameInMap("ports")]
        [Validation(Required=false)]
        public List<string> Ports { get; set; }

        // group_by
        [NameInMap("group_by")]
        [Validation(Required=false)]
        public List<string> GroupBy { get; set; }

    }

}
