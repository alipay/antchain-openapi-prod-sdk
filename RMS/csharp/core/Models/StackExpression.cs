// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // StackExpression
    public class StackExpression : TeaModel {
        // states
        [NameInMap("states")]
        [Validation(Required=false)]
        public List<StackState> States { get; set; }

        // andor
        [NameInMap("andor")]
        [Validation(Required=false)]
        public bool? Andor { get; set; }

    }

}
