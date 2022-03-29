// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // match expression
    public class XMatchExpression : TeaModel {
        // match expression type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // metadata field expr
        [NameInMap("expr")]
        [Validation(Required=false)]
        public string Expr { get; set; }

        // left character
        [NameInMap("left")]
        [Validation(Required=false)]
        public string Left { get; set; }

        // left index
        [NameInMap("left_index")]
        [Validation(Required=false)]
        public long? LeftIndex { get; set; }

        //  
        [NameInMap("right")]
        [Validation(Required=false)]
        public string Right { get; set; }

        //  
        [NameInMap("value_type")]
        [Validation(Required=false)]
        public string ValueType { get; set; }

    }

}
