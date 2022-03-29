// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Translate Expression
    public class XTranslateExpression : TeaModel {
        // expression type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        //  from
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

    }

}
