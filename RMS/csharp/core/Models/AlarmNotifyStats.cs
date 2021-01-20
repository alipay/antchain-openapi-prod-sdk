// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmNotifyStats
    public class AlarmNotifyStats : TeaModel {
        // alarm_time
        [NameInMap("alarm_time")]
        [Validation(Required=false)]
        public long? AlarmTime { get; set; }

        // count
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // notify_channel
        [NameInMap("notify_channel")]
        [Validation(Required=false)]
        public string NotifyChannel { get; set; }

    }

}
