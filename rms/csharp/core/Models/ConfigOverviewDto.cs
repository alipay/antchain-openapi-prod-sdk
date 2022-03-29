// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 总览页配置信息统计
    public class ConfigOverviewDto : TeaModel {
        // 自定义监控配置数
        [NameInMap("custom_plugin_count")]
        [Validation(Required=true)]
        public long? CustomPluginCount { get; set; }

        // 告警规则配置数
        [NameInMap("alarm_rule_count")]
        [Validation(Required=true)]
        public long? AlarmRuleCount { get; set; }

        // 告警规则配置数
        [NameInMap("alarm_tpl_count")]
        [Validation(Required=true)]
        public long? AlarmTplCount { get; set; }

    }

}
