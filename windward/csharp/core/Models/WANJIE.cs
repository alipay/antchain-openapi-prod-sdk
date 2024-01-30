// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WINDWARD.Models
{
    // data
    public class WANJIE : TeaModel {
        // code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // abilityAttribute
        [NameInMap("ability_attribute")]
        [Validation(Required=true)]
        public string AbilityAttribute { get; set; }

        // pastAttribute
        [NameInMap("past_attribute")]
        [Validation(Required=false)]
        public string PastAttribute { get; set; }

        // stabilityAttribute
        [NameInMap("stability_attribute")]
        [Validation(Required=false)]
        public string StabilityAttribute { get; set; }

    }

}
