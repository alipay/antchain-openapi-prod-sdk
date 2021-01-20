// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmAppStats
    public class AlarmAppStats : TeaModel {
        // app
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // alarm_level
        [NameInMap("alarm_level")]
        [Validation(Required=false)]
        public long? AlarmLevel { get; set; }

        // count
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // stack_universal_table_id
        [NameInMap("stack_universal_table_id")]
        [Validation(Required=false)]
        public string StackUniversalTableId { get; set; }

    }

}
