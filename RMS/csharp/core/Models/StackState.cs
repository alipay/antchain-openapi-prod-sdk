// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // StackState
    public class StackState : TeaModel {
        // state
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // values
        [NameInMap("values")]
        [Validation(Required=false)]
        public List<string> Values { get; set; }

        // is_black
        [NameInMap("is_black")]
        [Validation(Required=false)]
        public bool? IsBlack { get; set; }

    }

}
