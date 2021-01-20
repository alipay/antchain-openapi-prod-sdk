// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // TimeFilter
    public class TimeFilter : TeaModel {
        // from
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // weeks
        [NameInMap("weeks")]
        [Validation(Required=false)]
        public List<long?> Weeks { get; set; }

    }

}
