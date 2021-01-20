// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // TopAlarmDO
    public class TopAlarmDO : TeaModel {
        // error
        [NameInMap("error")]
        [Validation(Required=false)]
        public string Error { get; set; }

        // error_count
        [NameInMap("error_count")]
        [Validation(Required=false)]
        public long? ErrorCount { get; set; }

        // warn
        [NameInMap("warn")]
        [Validation(Required=false)]
        public string Warn { get; set; }

        // warn_count
        [NameInMap("warn_count")]
        [Validation(Required=false)]
        public long? WarnCount { get; set; }

        // alarm_level
        [NameInMap("alarm_level")]
        [Validation(Required=false)]
        public long? AlarmLevel { get; set; }

        // max_alarm_count
        [NameInMap("max_alarm_count")]
        [Validation(Required=false)]
        public long? MaxAlarmCount { get; set; }

        // emergency_copy
        [NameInMap("emergency_copy")]
        [Validation(Required=false)]
        public string EmergencyCopy { get; set; }

        // emergency_url
        [NameInMap("emergency_url")]
        [Validation(Required=false)]
        public string EmergencyUrl { get; set; }

    }

}
