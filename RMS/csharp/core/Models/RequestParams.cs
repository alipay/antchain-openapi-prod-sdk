// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // RequestParams
    public class RequestParams : TeaModel {
        // req_type
        [NameInMap("req_type")]
        [Validation(Required=false)]
        public string ReqType { get; set; }

        // condition
        [NameInMap("condition")]
        [Validation(Required=false)]
        public Condition Condition { get; set; }

        // dimCondition
        [NameInMap("dim_condition")]
        [Validation(Required=false)]
        public PontusTrendRequest DimCondition { get; set; }

        // tenant
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // zones
        [NameInMap("zones")]
        [Validation(Required=false)]
        public string Zones { get; set; }

        // from_front
        [NameInMap("from_front")]
        [Validation(Required=false)]
        public bool? FromFront { get; set; }

        // fuzzy
        [NameInMap("fuzzy")]
        [Validation(Required=false)]
        public bool? Fuzzy { get; set; }

        // validKeyCount
        [NameInMap("valid_key_count")]
        [Validation(Required=false)]
        public long? ValidKeyCount { get; set; }

        // can_switch
        [NameInMap("can_switch")]
        [Validation(Required=false)]
        public bool? CanSwitch { get; set; }

    }

}
