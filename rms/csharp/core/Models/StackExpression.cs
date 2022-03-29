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
        [Validation(Required=true)]
        public List<StackState> States { get; set; }

        // andor
        [NameInMap("andor")]
        [Validation(Required=true)]
        public bool? Andor { get; set; }

    }

}
