// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // TimeRange
    public class TimeRange : TeaModel {
        // start
        [NameInMap("start")]
        [Validation(Required=false)]
        public long? Start { get; set; }

        // end
        [NameInMap("end")]
        [Validation(Required=false)]
        public long? End { get; set; }

    }

}
