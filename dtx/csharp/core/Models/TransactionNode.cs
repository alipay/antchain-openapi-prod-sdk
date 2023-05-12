// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // TransactionNode
    public class TransactionNode : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // start_time
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        // end_time
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        // role
        [NameInMap("role")]
        [Validation(Required=true)]
        public string Role { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // label
        [NameInMap("label")]
        [Validation(Required=true)]
        public string Label { get; set; }

        // is_end
        [NameInMap("is_end")]
        [Validation(Required=true)]
        public bool? IsEnd { get; set; }

    }

}
