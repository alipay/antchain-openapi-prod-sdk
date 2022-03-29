// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    //  
    public class XTranslate : TeaModel {
        //  
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public string DefaultValue { get; set; }

        //  
        [NameInMap("include_not_matched")]
        [Validation(Required=false)]
        public bool? IncludeNotMatched { get; set; }

        //  
        [NameInMap("translate_expressions")]
        [Validation(Required=false)]
        public List<XTranslateExpression> TranslateExpressions { get; set; }

    }

}
