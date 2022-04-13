// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // label selector requirement struct
    public class LabelSelectorRequirement : TeaModel {
        // label key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // label match operator
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // label match values
        [NameInMap("values")]
        [Validation(Required=true)]
        public List<string> Values { get; set; }

    }

}
