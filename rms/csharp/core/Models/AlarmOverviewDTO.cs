// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmOverviewDTO
    public class AlarmOverviewDTO : TeaModel {
        // level1_alarm_count
        [NameInMap("level1_alarm_count")]
        [Validation(Required=true)]
        public long? Level1AlarmCount { get; set; }

        // level2_alarm_count
        [NameInMap("level2_alarm_count")]
        [Validation(Required=true)]
        public long? Level2AlarmCount { get; set; }

        // level3_alarm_count
        [NameInMap("level3_alarm_count")]
        [Validation(Required=true)]
        public long? Level3AlarmCount { get; set; }

        // alarm_sub_count
        [NameInMap("alarm_sub_count")]
        [Validation(Required=true)]
        public long? AlarmSubCount { get; set; }

        // alarm_pkg_count
        [NameInMap("alarm_pkg_count")]
        [Validation(Required=true)]
        public long? AlarmPkgCount { get; set; }

        // recent_alarms
        [NameInMap("recent_alarms")]
        [Validation(Required=true)]
        public List<AlarmHistoryDTO> RecentAlarms { get; set; }

    }

}
