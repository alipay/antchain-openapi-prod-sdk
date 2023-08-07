// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 自动生成单测代码model
    public class AutoCodeModel : TeaModel {
        // 111
        [NameInMap("model_string_param")]
        [Validation(Required=true)]
        public string ModelStringParam { get; set; }

        // 111
        [NameInMap("model_date_param")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModelDateParam { get; set; }

        // 111
        [NameInMap("model_array_param")]
        [Validation(Required=true)]
        public List<string> ModelArrayParam { get; set; }

    }

}
