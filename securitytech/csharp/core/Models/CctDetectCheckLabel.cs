// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 内容安全response
    public class CctDetectCheckLabel : TeaModel {
        // label
        [NameInMap("label")]
        [Validation(Required=true)]
        public string Label { get; set; }

        // rate
        [NameInMap("rate")]
        [Validation(Required=true)]
        public long? Rate { get; set; }

        // subLabels
        [NameInMap("sub_labels")]
        [Validation(Required=true)]
        public List<CctSubCheckLabel> SubLabels { get; set; }

        // details
        [NameInMap("details")]
        [Validation(Required=true)]
        public string Details { get; set; }

    }

}
