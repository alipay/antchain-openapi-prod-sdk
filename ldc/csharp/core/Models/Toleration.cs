// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
    public class Toleration : TeaModel {
        // 取值：NoExecute、PreferNoSchedule、NoSchedule
        [NameInMap("effect")]
        [Validation(Required=true)]
        public string Effect { get; set; }

        // Key is the taint key that the toleration applies to.
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 取值：Equal、Exists
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. 
        [NameInMap("toleration_seconds")]
        [Validation(Required=false)]
        public long? TolerationSeconds { get; set; }

        // Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
