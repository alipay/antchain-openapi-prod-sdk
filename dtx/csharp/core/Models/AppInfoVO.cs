// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 应用列表 应用信息
    public class AppInfoVO : TeaModel {
        // 参与者数组
        [NameInMap("action_array")]
        [Validation(Required=true)]
        public List<Participator> ActionArray { get; set; }

        // 10
        [NameInMap("action_count")]
        [Validation(Required=true)]
        public long? ActionCount { get; set; }

        // 10
        [NameInMap("activity_count")]
        [Validation(Required=true)]
        public long? ActivityCount { get; set; }

        // 1 同库 2 异库
        [NameInMap("activity_mode")]
        [Validation(Required=true)]
        public long? ActivityMode { get; set; }

        // app
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 分库规则
        [NameInMap("db_rule_name")]
        [Validation(Required=true)]
        public string DbRuleName { get; set; }

        // 分库规则
        [NameInMap("db_rule_template")]
        [Validation(Required=true)]
        public string DbRuleTemplate { get; set; }

        // 一句话描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 唯一id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 1
        [NameInMap("recovery_array")]
        [Validation(Required=true)]
        public List<AppRecoveryVO> RecoveryArray { get; set; }

        // 分表类型
        [NameInMap("table_rule_name")]
        [Validation(Required=true)]
        public string TableRuleName { get; set; }

        // 分表规则
        [NameInMap("table_rule_template")]
        [Validation(Required=true)]
        public string TableRuleTemplate { get; set; }

        // 是否被使用
        [NameInMap("used")]
        [Validation(Required=true)]
        public bool? Used { get; set; }

        // 1 单库单表 2 分库分表
        [NameInMap("splite_mode")]
        [Validation(Required=true)]
        public long? SpliteMode { get; set; }

    }

}
