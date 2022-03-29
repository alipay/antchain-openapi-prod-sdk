// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Trigger
    public class Trigger : TeaModel {
        // value_field
        [NameInMap("value_field")]
        [Validation(Required=true)]
        public string ValueField { get; set; }

        // value_index
        [NameInMap("value_index")]
        [Validation(Required=true)]
        public long? ValueIndex { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // n
        [NameInMap("n")]
        [Validation(Required=true)]
        public long? N { get; set; }

        // compare
        [NameInMap("compare")]
        [Validation(Required=true)]
        public string Compare { get; set; }

        // compare_percent
        [NameInMap("compare_percent")]
        [Validation(Required=true)]
        public string ComparePercent { get; set; }

        // threshold
        [NameInMap("threshold")]
        [Validation(Required=true)]
        public Threshold Threshold { get; set; }

        // threshold_copy
        [NameInMap("threshold_copy")]
        [Validation(Required=true)]
        public Threshold ThresholdCopy { get; set; }

        // value_is_percent
        [NameInMap("value_is_percent")]
        [Validation(Required=true)]
        public bool? ValueIsPercent { get; set; }

    }

}
