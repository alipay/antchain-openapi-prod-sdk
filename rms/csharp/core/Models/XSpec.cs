// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // spec
    public class XSpec : TeaModel {
        //  
        [NameInMap("target")]
        [Validation(Required=true)]
        public XTarget Target { get; set; }

        //  
        [NameInMap("rule")]
        [Validation(Required=true)]
        public XRule Rule { get; set; }

    }

}
