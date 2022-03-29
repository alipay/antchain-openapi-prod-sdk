// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // WorkspaceSettingDetail
    public class WorkspaceSettingDetail : TeaModel {
        // old_alarm_lang
        [NameInMap("old_alarm_lang")]
        [Validation(Required=false)]
        public string OldAlarmLang { get; set; }

        // 旧版告警开关
        [NameInMap("old_alarm_enable")]
        [Validation(Required=false)]
        public bool? OldAlarmEnable { get; set; }

        // unified_alarm_lang
        [NameInMap("unified_alarm_lang")]
        [Validation(Required=false)]
        public string UnifiedAlarmLang { get; set; }

        // unified_alarm_enable
        [NameInMap("unified_alarm_enable")]
        [Validation(Required=false)]
        public bool? UnifiedAlarmEnable { get; set; }

        // trace_enable
        [NameInMap("trace_enable")]
        [Validation(Required=false)]
        public bool? TraceEnable { get; set; }

        // 监控诊断开关
        [NameInMap("diagnose_enable")]
        [Validation(Required=false)]
        public bool? DiagnoseEnable { get; set; }

    }

}
