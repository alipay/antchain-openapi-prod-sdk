// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUnifiedalarmRuleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 告警规则名称模糊搜索
        [NameInMap("keyword")]
        [Validation(Required=false)]
        public string Keyword { get; set; }

        // 告警等级
        [NameInMap("level")]
        [Validation(Required=false)]
        public long? Level { get; set; }

        // 告警对象
        [NameInMap("alarm_target")]
        [Validation(Required=false)]
        public AlarmTarget AlarmTarget { get; set; }

        // 启停状态
        [NameInMap("rule_status")]
        [Validation(Required=false)]
        public long? RuleStatus { get; set; }

        // 告警状态
        [NameInMap("alarm_status")]
        [Validation(Required=false)]
        public long? AlarmStatus { get; set; }

        // 只看我
        [NameInMap("only_me")]
        [Validation(Required=false)]
        public bool? OnlyMe { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页面尺寸
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 工作区名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 告警规则id
        [NameInMap("rule_id")]
        [Validation(Required=false)]
        public long? RuleId { get; set; }

        // 告警唯一标识
        [NameInMap("rule_unique_identity")]
        [Validation(Required=false)]
        public string RuleUniqueIdentity { get; set; }

        // 标识符 区分规则是自定义规则还是pql规则
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        //  
        [NameInMap("ref_datasource_type")]
        [Validation(Required=false)]
        public string RefDatasourceType { get; set; }

        // 根据用户组过滤
        [NameInMap("filter_user_group")]
        [Validation(Required=false)]
        public long? FilterUserGroup { get; set; }

        // 根据webhook过滤
        [NameInMap("filter_webhook")]
        [Validation(Required=false)]
        public long? FilterWebhook { get; set; }

        // 钉钉机器人过滤
        [NameInMap("filter_ding_robot")]
        [Validation(Required=false)]
        public long? FilterDingRobot { get; set; }

        // 根据应栈信息对告警规则做过滤
        [NameInMap("alarm_stack_info")]
        [Validation(Required=false)]
        public AlarmStackInfo AlarmStackInfo { get; set; }

        // CUSTOM,STACK,HOST
        [NameInMap("data_source_type")]
        [Validation(Required=false)]
        public string DataSourceType { get; set; }

        // 过滤的告警级别
        [NameInMap("levels")]
        [Validation(Required=false)]
        public List<long?> Levels { get; set; }

        // 告警事件id
        [NameInMap("alarm_event_id")]
        [Validation(Required=false)]
        public string AlarmEventId { get; set; }

    }

}
