// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Model
    public class Model : TeaModel {
        // rules
        [NameInMap("rules")]
        [Validation(Required=true)]
        public List<Rule> Rules { get; set; }

        // batch_rule_id
        [NameInMap("batch_rule_id")]
        [Validation(Required=true)]
        public string BatchRuleId { get; set; }

    }

}
