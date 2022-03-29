// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Threshold
    public class Threshold : TeaModel {
        // level1
        [NameInMap("level1")]
        [Validation(Required=true)]
        public string Level1 { get; set; }

        // level2
        [NameInMap("level2")]
        [Validation(Required=true)]
        public string Level2 { get; set; }

        // level3
        [NameInMap("level3")]
        [Validation(Required=true)]
        public string Level3 { get; set; }

        // im
        [NameInMap("im")]
        [Validation(Required=true)]
        public string Im { get; set; }

        // sms
        [NameInMap("sms")]
        [Validation(Required=true)]
        public string Sms { get; set; }

        // control_plan
        [NameInMap("control_plan")]
        [Validation(Required=true)]
        public string ControlPlan { get; set; }

    }

}
