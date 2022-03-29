// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmHistoryStatsDTO
    public class AlarmHistoryStatsDTO : TeaModel {
        // alarm_time
        [NameInMap("alarm_time")]
        [Validation(Required=true)]
        public long? AlarmTime { get; set; }

        // alarm_level
        [NameInMap("alarm_level")]
        [Validation(Required=true)]
        public long? AlarmLevel { get; set; }

        // count
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
