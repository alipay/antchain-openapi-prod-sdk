// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    // AssignConfig
    public class AssignConfig : TeaModel {
        // AVG_SIZE
        [NameInMap("assigntype")]
        [Validation(Required=true)]
        public string Assigntype { get; set; }

        // AssignSubTaskCount
        [NameInMap("assignsubtaskcount")]
        [Validation(Required=false)]
        public long? Assignsubtaskcount { get; set; }

    }

}
