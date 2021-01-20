// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AiAlarmParams
    public class AiAlarmParams : TeaModel {
        // value_fields
        [NameInMap("value_fields")]
        [Validation(Required=false)]
        public List<string> ValueFields { get; set; }

        // ai_algo_code
        [NameInMap("ai_algo_code")]
        [Validation(Required=false)]
        public string AiAlgoCode { get; set; }

        // ai_extra_attr
        [NameInMap("ai_extra_attr")]
        [Validation(Required=false)]
        public AiExtraAttr AiExtraAttr { get; set; }

    }

}
