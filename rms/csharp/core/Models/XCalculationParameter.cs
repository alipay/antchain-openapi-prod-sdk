// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // x
    public class XCalculationParameter : TeaModel {
        // x
        [NameInMap("expression")]
        [Validation(Required=false)]
        public string Expression { get; set; }

        // x
        [NameInMap("constant")]
        [Validation(Required=false)]
        public bool? Constant { get; set; }

    }

}
