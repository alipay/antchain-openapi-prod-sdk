// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 总览页应用统计信息
    public class AppOverviewDTO : TeaModel {
        // 应用总数
        [NameInMap("total_app_count")]
        [Validation(Required=true)]
        public long? TotalAppCount { get; set; }

        // 正常运行应用数
        [NameInMap("normal_app_count")]
        [Validation(Required=true)]
        public long? NormalAppCount { get; set; }

        // 告警应用数
        [NameInMap("alarm_app_count")]
        [Validation(Required=true)]
        public long? AlarmAppCount { get; set; }

        // 自定义监控配置数
        [NameInMap("custom_plugin_count")]
        [Validation(Required=true)]
        public long? CustomPluginCount { get; set; }

        // 告警规则配置数
        [NameInMap("alarm_rule_count")]
        [Validation(Required=true)]
        public long? AlarmRuleCount { get; set; }

        // 告警模板配置数
        [NameInMap("alarm_tpl_count")]
        [Validation(Required=true)]
        public long? AlarmTplCount { get; set; }

        // 日志路径数
        [NameInMap("log_config_count")]
        [Validation(Required=true)]
        public long? LogConfigCount { get; set; }

        // mem top排序应用
        [NameInMap("mem_top_apps")]
        [Validation(Required=true)]
        public List<AppTopItem> MemTopApps { get; set; }

        // cpu top排序应用
        [NameInMap("cpu_top_apps")]
        [Validation(Required=true)]
        public List<AppTopItem> CpuTopApps { get; set; }

        // 磁盘 top排序应用
        [NameInMap("disk_top_apps")]
        [Validation(Required=true)]
        public List<AppTopItem> DiskTopApps { get; set; }

        // 告警top排序应用
        [NameInMap("alarm_top_apps")]
        [Validation(Required=false)]
        public List<AppTopItem> AlarmTopApps { get; set; }

        // error top排序应用
        [NameInMap("error_top_apps")]
        [Validation(Required=false)]
        public List<AppTopItem> ErrorTopApps { get; set; }

    }

}
