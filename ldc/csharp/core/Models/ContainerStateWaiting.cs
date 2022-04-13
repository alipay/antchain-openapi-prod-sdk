// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // container state waiting
    public class ContainerStateWaiting : TeaModel {
        // message
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // reason
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

    }

}
