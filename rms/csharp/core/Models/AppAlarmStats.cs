// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AppAlarmStats
    public class AppAlarmStats : TeaModel {
        // app_name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // count
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
