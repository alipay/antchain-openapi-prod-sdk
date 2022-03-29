// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // condition
    public class XCondition : TeaModel {
        // 表达式
        [NameInMap("expr")]
        [Validation(Required=true)]
        public string Expr { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        //  
        [NameInMap("values")]
        [Validation(Required=false)]
        public List<string> Values { get; set; }

        //  
        [NameInMap("all")]
        [Validation(Required=false)]
        public bool? All { get; set; }

    }

}
