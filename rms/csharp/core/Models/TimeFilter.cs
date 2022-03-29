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
        [Validation(Required=true)]
        public string From { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // weeks
        [NameInMap("weeks")]
        [Validation(Required=true)]
        public List<long?> Weeks { get; set; }

    }

}
